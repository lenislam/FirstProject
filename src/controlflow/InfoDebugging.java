package controlflow;

public class InfoDebugging {
    // Debug : bug
    // To identify the logical error in our code
    // Break point

public int doMultiply(int number1,int number2){
    int multiply = number1*number2;
    System.out.println("Multiply value is "+multiply);
    return multiply;
}

    public static void main(String[] args) {
        InfoDebugging bug =new InfoDebugging();
// Expected Result 600
        //Actual result is 50
        int expectedResult=600;
        //bug.doMultiply(20,30);
        int actualResult = bug.doMultiply(20,30);
        //Unit testing: i am checking my method is working or not
        if (actualResult==expectedResult){
            System.out.println("Test case is Pass");
        }else{
            System.out.println("Test case is Fail");
        }
    }
    // Logical error : To fix our logical we need to do debugging


}
