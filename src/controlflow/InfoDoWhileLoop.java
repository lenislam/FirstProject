package controlflow;

public class InfoDoWhileLoop {

    //Post condition
    //Do while loop execute at least one time then it will check condition
    //do {} while()
    //First it will execute one time then it will check the condition

    public static void main(String[] args) {

        int x = 20;
        do{
            System.out.println("We are learning do while Loop"+x);
            x++;
        }while (x<25);
    }
}
