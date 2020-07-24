package string;

public class InfoString {

    public static void main(String[] args) {
        String foodName= "American Pizza";
        String foodName1= "Mexican Pizza";
        //System.out.println(foodName.length());
        //System.out.println(foodName.concat(foodName1));
        //System.out.println(foodName+" "+foodName1);
//        System.out.println(foodName.equalsIgnoreCase("Mexican Pizza"));
//        System.out.println(foodName.equals("American Pizza"));
//        System.out.println(foodName.equals("amirican Pizza"));
//        System.out.println(foodName.charAt(6));
//        System.out.println(foodName.substring(4));
//        System.out.println(foodName1.substring(4,12));

        //System.out.println(foodName1.charAt(16));
        try{
            System.out.println(foodName1.charAt(15));
        }catch(Exception e){
         //e.printStackTrace();
            System.out.println("String Index out of bounds Exception");
        }finally {
            System.out.println(foodName1.charAt(7));
        }
    }
}