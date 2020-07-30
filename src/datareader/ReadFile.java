package datareader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFile {
    public ReadFile(String filePath) {

    }

    //Absolute path = Full path
    // Relative path = partial path

    //String filePath="C:\\Users\\lenis\\IdeaProjects\\FirstProject\\src\\datareader\\Sample.txt";

    public static void main(String[] args) throws FileNotFoundException {
        String filePath="src\\datareader\\Sample.txt";
        new ReadFile(filePath);

        FileReader fileReader=null;
        BufferedReader bufferedReader=null;

        try{
            fileReader=new FileReader(filePath);
            bufferedReader=new BufferedReader(fileReader);

            String data;
            while ((data=bufferedReader.readLine())!=null){
                System.out.println(data);
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("File not found exception");
        }finally {
            try{
                fileReader.close();
                bufferedReader.close();
            }catch (Exception e){
                e.printStackTrace();
                System.out.println("null point Exception and file is already close");
            }
        }


    }

}
