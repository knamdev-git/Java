import java.util.Scanner;

public class Advance_pattern_problem {

    public static void main(String[] args) {
//Scanner class
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a value ");
        int n = scan.nextInt();
//Butterfly pattern 
        System.out.println("Buterfly Pattern");
       
         int row ,col ;
        
        // First half of the butterfly pattern
        for (row = 1; row <= n; row++) {
            // Left stars
            for (col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            // Middle spaces
            for (col = 1; col <= 2 * (n - row); col++) {
                System.out.print("  ");
            }
            // Right stars
            for (col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Second half of the butterfly pattern
        for (row = n; row >= 1; row--) {
            // Left stars
            for (col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            // Middle spaces
            for (col = 1; col <= 2 * (n - row); col++) {
                System.out.print("  ");
            }
            // Right stars
            for (col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
//Diamond Shape Pattern
        
        System.out.println("Diamond shape pattern ");
        //outer half loop
        for( row = 1 ; row <= n ; row++){
            //inner half loop
                //for pring space   
            for ( col = 1; col <= n-row; col++) {
                System.out.print("  ");
            }
            //for star pring
            for ( col = 1; col <= 2*row - 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //reverse loop for diamond shape 

        for( row = n-1 ; row >= 1 ; row--){
            //inner half loop
                //for pring space   
            for ( col = 1; col <= n-row; col++) {
                System.out.print("  ");
            }
            //for star pring
            for ( col = 1; col <= 2*row - 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }//end of diamond loop 

        scan.close();
 
    }//end of main class
}//end of Advance_pattern_problem class 
