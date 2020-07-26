package mentoring.slide;

import java.util.Arrays;

public class TwoDimension {

    public static void main(String[] args) {
        String [][] countryRecord={
                { "SL_ID", "Country_Name", "City_Name", "City_ID"},
                { "01", "USA", "NY", "XYZ"},
                { "02", "Australia", "Melborn", "ZXY"},
                { "03", "Bangladesh", "Dhaka", "YXZ"}
        };
        //System.out.println(countryRecord[3][3]);

        for (String xyz[]:countryRecord) {
//            for (String x : xyz) {
//                System.out.println(x);
//            }
            System.out.println(Arrays.toString(xyz));
        }

    }

}
