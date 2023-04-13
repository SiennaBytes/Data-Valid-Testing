/*
 * Program: U3A1A1 Data Validation and Testing Data
 * Purpose: A program that will validate data entered by the user.
 */
package u3a1a1datavalidtesting;

import java.util.Scanner;

/**
 *
 * @author Sienna M
 */
public class U3A1A1DataValidTesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner (System.in);
        
        // variables
        String tempString;
        boolean invalid = true;
        
        while(invalid)
        {
            System.out.println("Please enter a word greater than 6 letters:");
            tempString = keyedInput.nextLine();
            
            // correct
            if (tempString.length()>6)
            {
                invalid = false;
                System.out.println("Thank you for entering the correct input.");
            }
            // wrong
            else
            {
                System.out.println("Incorrect input, please try again.");
            }
        }
        
        // variables
        String tempString2;
        boolean invalid2 = true;
        
        while(invalid2)
        
        {
        
            System.out.println("Let's continue with stage 2:");
        
            System.out.println("Please enter a word with a lowercase 'a':");
            tempString2 = keyedInput.nextLine();
            
            // correct
            if (tempString2.contains("a"))
            {
                invalid2 = false;
                System.out.println("Thank you for entering the correct input.");
            }
            // wrong
            else
            {
                System.out.println("Incorrect input, please try again.");
            }
        }
        
        // variables
        String tempString3;
        boolean invalid3 = true;
        
        while(invalid3)
        {
            System.out.println("Let's continue with stage 3:");
          
            System.out.println("Please enter a word that is 5 and 15 letters long, and does"
                    + " not contain the letter 'z': ");
            tempString3 = keyedInput.nextLine();
           
            // correct
            if ((tempString3.length()>=5) && (tempString3.length()<=15) && (tempString3.contains("z") == false))
            {
               invalid3 = false;
               System.out.println("Thank you for entering the correct input.");
            }  
            // wrong
            else
            {
                System.out.println("Incorrect input, please try again.");
            }
        }
        
        // variables
        int tempNum4;
        boolean invalid4 = true;
        
        while(invalid4)
        {
            System.out.println("Let's continue with stage 4:");
            
            System.out.println("Please enter an integer between 5 and 500:");
            tempNum4 = keyedInput.nextInt();
           
            // correct
            if ((tempNum4 > 5) && (tempNum4 < 500))
            {
                invalid4 = false;
                System.out.println("Thank you for entering the correct input.");
            }
            // wrong
            else
            {
                System.out.println("Incorect input, please try again.");
            }
        }
        
        // variables
        int tempNum5;
        boolean invalid5 = true;
        
        while(invalid5)
        {
            System.out.println("Let's continue with stage 5:");
          
            System.out.println("Please enter a negative integer:");
            tempNum5 = keyedInput.nextInt();

            // correct
            if (tempNum5 < 0)   
            {
                invalid5 = false;
                System.out.println("Thank you for entering the correct input");
            }
            // wrong
            else
            {
                System.out.println("Incorrect input, please try again.");
            }
        }
        // variables
        int tempNum6; 
        int remainder;
        boolean invalid6 = true;
        
        while(invalid6)
        {
            System.out.println("Let's continue with our last stage:");
           
            System.out.println("Please enter a positive, odd integer:");
            tempNum6 = keyedInput.nextInt();
            
            // correct
            remainder = tempNum6 % 2; 
            if ((tempNum6 > 0) && (remainder == 1))
            {
                invalid6 = false;
                System.out.println("Thank you for entering the corect input.");
            }
            // wrong
            else
            {
                System.out.println("Incorrect input, please try again.");
            }
        }
        
        {
            // if user manages to get through each stage
            System.out.println("Congratulations!! You made it through the program.");
        }
    }
}
