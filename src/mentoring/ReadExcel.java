package mentoring;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.sound.midi.Soundbank;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
//C:\Users\lenis\Desktop\PNT1
public class ReadExcel { public static final String fileName=System.getProperty("user.dir")+"/PNT/Team1.xlsx";
    //public static final String fileName=System.getProperty("C:")+"/Users/lenis/Desktop/PNT1/Team1.xlsx";
    public static void main(String[] args) {
        readExcelFile(fileName,0);
    }
    public static void readExcelFile(String file, int sheetNumber){
        try{
            FileInputStream inputStream=new FileInputStream(fileName);
            Workbook workbook = new XSSFWorkbook(inputStream);
            Sheet dataTypeSheet= workbook.getSheetAt(sheetNumber);

            Iterator<Row> rowIterator= dataTypeSheet.iterator();
            while(rowIterator.hasNext()){
                Row currentRow=rowIterator.next();
             Iterator<Cell> cellIterator=currentRow.iterator();
             while (cellIterator.hasNext()){
                 Cell currentcell=cellIterator.next();
                 if (currentcell.getCellType()== CellType.STRING){
                     System.out.print(currentcell.getStringCellValue()+" ");
                 }else if (currentcell.getCellType()==CellType.NUMERIC){
                     System.out.println(currentcell.getNumericCellValue()+" ");
                 }else if (currentcell.getCellType()==CellType.BOOLEAN){
                     System.out.println(currentcell.getBooleanCellValue());
                 }
             }
                System.out.println();
            }
        }catch (FileNotFoundException e){
            System.out.println("File Not Found");
        }catch (IOException e1){
            System.out.println("Done");
        }
    }
}
