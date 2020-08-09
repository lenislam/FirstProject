package excelreadandwrite;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class ReadExcelFile {
    // File location
    //input stream
    // Create The Syntex
    public static final String fileName=System.getProperty("user.dir")+"/DataTest/Team4.xlsx";

    public static void main(String[] args) {
        readExcelFile(fileName,0);
    }
    //we read the file so use input LET ME DESIGN THIS

    public static void readExcelFile(String fileName, int sheetNumber) {
        try {
            FileInputStream inputStream = new FileInputStream(fileName) ;//When it look for the DataTest file then it workbook
            Workbook workbook = new XSSFWorkbook(inputStream);
            Sheet dataTypeSheet = workbook.getSheetAt(sheetNumber);

            Iterator<Row> rowIterator = dataTypeSheet.iterator();
            while (rowIterator.hasNext()) {
                Row currentRow = rowIterator.next();
                Iterator<Cell> cellIterator = currentRow.iterator();
                while (cellIterator.hasNext()) {
                    Cell currentCell = cellIterator.next();
                    if (currentCell.getCellType() == CellType.STRING) {
                        System.out.println(currentCell.getStringCellValue() + " ");
                    } else if (currentCell.getCellType() == CellType.NUMERIC) {
                        System.out.println(currentCell.getNumericCellValue() + " ");
                    } else if (currentCell.getCellType() == CellType.BOOLEAN) {
                        System.out.println(currentCell.getBooleanCellValue() + " ");
                    }
                }
                System.out.println();
            }
        }catch (FileNotFoundException e){
            System.out.println("File not Found");
        }catch (IOException e1){
            System.out.println("reading done");
        }
    }


}
