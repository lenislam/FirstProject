package advance;

public class InfoRecursion {

    // Recursion : process in which a method calls itself continuously
    // Must call itself
    //Must have base case.
    // Must change its state and move toward the base case

    int count=3;

    public void stInfo(){
        count++;
        if (count <=5){
            System.out.println("Student name is Mujahid");
            stInfo();
        }
    }
//public static void test1() {
//    System.out.println("In test1");
//    test2();
//    System.out.println("In test1 after test2");
//}
//        public static void test2(){
//        int y = 0;
//        int x = 3/y;
//        }

    public static void main(String[] args) {
        InfoRecursion car = new InfoRecursion();
        car.stInfo();
//        System.out.println("in main");
//        test1();

    }
}
