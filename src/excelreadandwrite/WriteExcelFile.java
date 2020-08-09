package excelreadandwrite;

import oop.inheritance.Son;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcelFile {
    // Set the path of the excel file. System.getProperty("user.dir") is not way to get the home directory at all,
    // it is the way to get the current working directory.
    public static final String filePath = System.getProperty("user.dir") + "/DataTest/myExcel.xlsx";
//C:\Users\lenis\IdeaProjects\FirstProject\DataTest

    // If we create the 2D Array out side the main method then
    //Copy and paste then make Static Object [] []

    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));
        writeExcel(filePath);
    }
    public static void writeExcel(String fileName) {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Student details");

        Object[][] studentdetails = { // Class type Array
                {"SL", "FirstName", "LastName", "Address", "ContactNumber"},
                {"01", "Mujahid", "Islam", "NY", "2154687900"},
                {"02", "Selim", "Reza", "NY", "1478546980"},
                {"03", "Sazzad", "Hossain", "FL", "1245798780"},
                {"04", "Saleh", "Ahmed", "Queens", "7854668450"},
                {"05","Ashraful","Hoque","Jamaica", "2454754745"},
        };
        System.out.println("Excel File Created");
        int rowNum = 0;
        for (Object[] std : studentdetails) { // For each Loop - we break the array by creating single array
            Row row = sheet.createRow(rowNum++); //To a Row in my sheet
            int colNum = 0;
            for (Object field : std) { //For each Loop
                Cell cell = row.createCell(colNum++); // Now we another
                if (field instanceof String){
                    cell.setCellValue((String) field);
            }else if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);
                }
            }
        }
        try {
            // File output steam
            FileOutputStream output=new FileOutputStream(fileName);
            workbook.write(output);
            workbook.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("done");
        }
    }
}
