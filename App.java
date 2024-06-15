import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

//String Operation 

        //Sring uppercase 
        String str = "kaNha";
        
        //length : total length of string 
        System.out.printf("1. Length : ",str.length());
 
        // touppercase : uppercase of str 
        System.out.printf("\n2. Upercase : " +str.toUpperCase());
    
        //toLowerCase : lowercase of str 
        System.out.printf("\n3. Lowercase : " + str.toLowerCase());
        
        //input string 
        str = "kanhajdsgdhsghsg " ;
        //trim : remove firstly coming spaces in the string 
        String my = str.trim();
        System.out.printf("\n4. Trim : " + my);

        //substring 
        System.out.printf("\n5. Substing starts from : " +str.substring(5));

        //Substring  ( para1 , para2 )
        System.out.printf("\n6. Subsubstring : "+str.substring(3,9));
        
        //replace() : it replace particular word in the string 
        str = "Tony";
        System.out.printf("\n7. Replace str : "+ str.replace('T','M'));
         
        //startsWith() : Function that return bool is true or false 
        System.out.printf("\n8. Starts With : " +str.startsWith("kan"));
        
        //endsWith() : Function that return bool is true or false 
        System.out.printf("\n9. Ends With : " +str.endsWith("y"));
        
        //charat();
        System.out.printf("\n10. Char at : "+ str.charAt(3));

        //index of : Shows index value at particular word
        System.out.println("\n11. Index at : "+ str.indexOf("o"));

        //Last Index of : starts counting form last index
        System.out.printf("12. Last Index of :" +str.lastIndexOf("ny") );

        //equals of : Is it String equal to or not ?
        String str1 = "Tony";
        System.out.printf("\n13. Equals or not : "+ str.equals(str1)); // str.equals("Tony") ;

        //equals Ignore : Ignore Upper or Lower Case , it will only check or compare the value 
        System.out.println("\n14. Ignore Case String : "+str.equalsIgnoreCase("toNy"));


//Escape sequence character 
/* :\n:\t:\a:\\:\':\f:\r */



// Scanner is a class in java 
        Scanner sc = new Scanner(System.in);

        
        String character = sc.nextLine();
        System.out.println(character);

        String mn = sc.next();
        System.out.println(mn);

        System.out.println("Enter the integer number ");
        int num1 = sc.nextInt();
        System.out.println(num1);
    }
}
