package practice;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

public class WriteExcel {
    // Set the path of the excel file. System.getProperty("user.dir") is not way to get the home directory at all,
    // it is the way to get the current working directory.
    public static final String filePath = System.getProperty("user.dir") + "/DataTest/Team2.xlsx";
//C:\Users\lenis\IdeaProjects\FirstProject\DataTest

    // If we create the 2D Array out side the main method then
    //Copy and paste then make Static Object [] []
    static Object[][] groupMembers = { // Class type Array
            {"SL", "FirstName", "LastName", "Address", "ContactNumber"},
            {"01", "Mujahid", "Islam", "Queens", "2154687900"},
            {"02", "Mohammad", "Khan", "Queens", "1478546980"},
            {"03", "Shah", "Jakarin", "Queens", "1245798780"},
            {"04", "Jony", "Hossain", "Queens", "7854668450"},
            {"05", "Mohammad", "Shuvo", "Queens", "2454754745"},
            {"06", "Mohammad","Sharif", "Queens", "4578884646"},
            {"07","Ehsan", "Kabir","Queens","1245783939"}
    };

    public static void main(String[] args) {
        // System.out.println(System.getProperty("user.dir"));
        writeExcel1(filePath, groupMembers); // Add studentDetails
    }

    public static void writeExcel1(String fileName, Object[][] groupMembers) {   //Add Object[] [] and studentDetails
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Group details");

        System.out.println("Excel File Created");
        int rowNum = 0;
        for (Object[] std : groupMembers) { // For each Loop - we break the array by creating single array
            Row row = sheet.createRow(rowNum++); //To a Row in my sheet
            int colNum = 0;
            for (Object field : std) { //For each Loop
                Cell cell = row.createCell(colNum++); // Now we another
                if (field instanceof String) {
                    cell.setCellValue((String) field);
                } else if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);
                }
            }
        }
        try {
            // File output steam
            FileOutputStream output = new FileOutputStream(fileName);
            workbook.write(output);
            workbook.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("done");
        }
    }

}

