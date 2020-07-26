package mentoring.slide;

public class ArrayFirst {
    // Array : To store similar data type value in a array variable

    // 1. int array:
    //lowest bound/index = 0
    // Upper bound/index = s-1 (n is size of array
    // This is call One Dimension

    // int i =0;

    public static void main(String[] args) {
        int i[] = new int[5]; // int [5] is size so Index L-1,
        i[0] = 10; // Index = 5-1=4, we print always Index
        i[1] = 20;
        i[2] = 30;
        i[3] = 40;
        i[4] = 50;
        System.out.println(i[3]);
        System.out.println(i[0]);

        //System.out.println(i[5]); // Array Index Out Of BoundsException
        System.out.println(i.length); // size / length of array

        // print all the values of array
        for (int j = 0; j < i.length; j++) {
            System.out.println(i[j]);

            // 2. double array:
            double d[] = new double[3];
            d[0] = 12.45;
            d[1] = 10.33;
            d[2] = 14.25;
            double sum = d[1] + d[2];
            System.out.println(d[2]);
            System.out.println("The value of :" + sum);

            //3. char array
            char c[] = new char[3];
            c[0] = 'a';
            c[1] = '6';
            c[2] = '$';
            System.out.println(c[2]);

            //4. boolean array:
            boolean b[] = new boolean[2];
            b[0] = true;
            b[1] = false;

            //5. String array:
            String s[] = new String[3];
            s[0] = "Mizan";
            s[1] = "Shuvo";
            s[2] = "Zakarin";
            System.out.println(s.length);

// Object array: (object is a class is used to store different data types values
            Object obj[] = new Object[6];
            obj[0] = "James";
            obj[1] = 25;
            obj[2] = 12.33;
            obj[3] = "1/1/2020";
            obj[4] = "M";
            obj[5] = "London";
            //System.out.println(obj[4]);

            for (String ob:obj) {

            }

//            String studentRecord[][] = new String[4][4];
//
//            studentRecord[0][0] = "Serial";
//            studentRecord[0][1] = "fName";
//            studentRecord[0][2] = "lName";
//            studentRecord[0][3] = "City";
//
//            studentRecord[1][0] = "01";
//            studentRecord[1][1] = "Mujahid";
//            studentRecord[1][2] = "Islam";
//            studentRecord[1][3] = "NY";
//
//            studentRecord[2][0] = "02";
//            studentRecord[2][1] = "Rana";
//            studentRecord[2][2] = "Hossain";
//            studentRecord[2][3] = "VA";
//
//            studentRecord[2][0] = "03";
//            studentRecord[2][1] = "Reza";
//            studentRecord[2][2] = "selim";
//            studentRecord[2][3] = "CA";
//
//            studentRecord[3][0] = "04";
//            studentRecord[3][1] = "Asharaful";
//            studentRecord[3][2] = "Hoque";
//            studentRecord[3][3] = "MD";
//
//            for (String srt[] : studentRecord) {
//                for (String x : srt) {
//                    System.out.println(x);
//                }
//
//            }
//
        }


    }
    }
