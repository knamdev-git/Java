import java.util.Scanner;

public class Array_in_Java {
    public static void main(String[] args) {
       
        // New (Keyword) : Use to to take new space in memeory for non premitive data 
        int marks[] = new int[5]; // After new " int[5] " : 5 , describes the size of an array we created 
        
        // Printing the statement we have to show to the screen 
        System.out.println("Enter five marks ");
        
        // Taking input from the user  
        Scanner scan = new Scanner(System.in) ;
        
        for (int i = 0; i < marks.length; i++) { //marks.length calls the length of an array , In java we can directly calculate the length with the help of .length() func
         marks[i] = scan.nextInt();   
        }

        //printing array element 
        for (int i = 0; i < marks.length; i++) {
            System.out.println((i+1)+" student marks "+marks[i]);
        }
    }
}
