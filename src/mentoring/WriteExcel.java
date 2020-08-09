package mentoring;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcel {

    public static final String filepath = System.getProperty("user.dir") + "/PNT/Team4.xlsx";

    static Object[][] groupMember = {
            {"Sl", "firstName", "lastName", "theLocation", "contactNumber"},
            {"01", "Mujahidul", "Islam", "Queens", "12456378458"},
            {"02", "Mizan", "Khan", "Queens", "12456458458"},
            {"03", "Jony", "Hossain", "Queens", "12412478458"},
            {"04", "Shah", "Zakarin", "Queens", "12457548458"},
            {"05", "Khairul", "Shuvo", "Queens", "12456378458"},
    };

    public static void main(String[] args) {
        writeExcel1(filepath, groupMember);
    }

    public static void writeExcel1(String fileName, Object[][] groupMember) {
        XSSFWorkbook workrbook = new XSSFWorkbook();
        XSSFSheet sheet = workrbook.createSheet("Group details");
        System.out.println("Excel file is created");
        int rowNum = 0;
        for (Object[] mem : groupMember) {
            Row row = sheet.createRow(rowNum++);
            int colNum = 0;
            for (Object field : mem) {
                Cell cell = row.createCell(colNum++);
                if (field instanceof String) {
                    cell.setCellValue((String) field);
                } else if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);
                }
            }
        }
        try {
            FileOutputStream output = new FileOutputStream(fileName);
            workrbook.write(output);
            workrbook.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Done");
        }
    }
}
