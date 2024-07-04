import java.util.*;

public class Password_strength_check {

    public static void main(String[] args) {
        //Prob : Password Check crcumtances code 
        System.out.println("\nPassword Check");

        //scanner class 
        Scanner scan = new Scanner(System.in);

        System.out.println("\nEnter your Password ");
        String password = scan.nextLine();

        // First we Define all the variable as "False" 
        Boolean passlen = false;
        Boolean passUper = false;
        Boolean passSpec = false;
        Boolean passdigi = false ;

        // If the password length is 8 greater then it goes " True "
        if (password.length() >= 8) {
          passlen = true;
        }

        // Now we check for other criterias of the password 
        for (int i = 0; i < password.length(); i++) {
        // for checking each letter of "Password" we store letter in ch : variable 
            char ch = password.charAt(i);
        
         if (Character.isDigit(ch)) {
              passdigi = true ;      // checking for letter is digit or not if yes then it goes into true
         }
         else if (Character.isUpperCase(ch)) {
              passUper = true ;    // similarly is it Uppercase it goes to true 
         }
         else if (Character.isLetterOrDigit(ch)) {
              passSpec = true ;    // similarly is it Letter or digit it goes to true 
         }
        }

        if (passSpec && passUper && passdigi && passlen){ // If All the criteria's satisfy then it Display's the True Condition  
          System.out.println("Your password is Strong ");
        }
        else{ 
          System.out.println("Your Password is Weak . \nMake sure it meets all the criteria !!");
        }

    }
}
