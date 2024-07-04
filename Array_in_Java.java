import java.util.Scanner;

public class Array_in_Java {
    public static void main(String[] args) {
       
        //New (Keyword) : use to to take new space in memeory which is non premitive data 
        int marks[] = new int[5];
        
        //
        System.out.println("Enter five marks ");
        
        //taking input 
        Scanner scan = new Scanner(System.in) ;
        
        for (int i = 0; i < marks.length; i++) {
         marks[i] = scan.nextInt();   
        }

        //printing array element 
        for (int i = 0; i < marks.length; i++) {
            System.out.println((i+1)+" student marks "+marks[i]);
        }
    }
}
