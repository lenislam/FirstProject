package controlflow;

public class InfoWhileLoop {
    // While loop is used in situations where we do not know how many times loop
    // needs to be executed beforehand.
    // For loop is where we already know about the number of times loop needs
    //to be executed. Typically for a index used in iteration.

    //While loop: pre condition check
    //when condition is false then exit from while loop
    //While (Condition){++ or __}

    public static void main(String[] args) {

        int x = 45;
        int y =30;

//        while (x>42){
//            System.out.println("We are learning "+x);
//            --x;
//        }

//        // Nested Loop
        while (x>44){
            System.out.println("We are learning while loop"+x);
           --x;
             while (y<35){
                System.out.println("Nested while loop");
                y++;
            }
        }



    }
}
