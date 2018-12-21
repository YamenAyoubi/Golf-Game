package Project.GolfGameFinal;

import java.util.Scanner;

public class GetValidNumber {

	static Scanner out = new Scanner(System.in);


    private static String GetValidvalue() {

             return out.nextLine();

}

       public static int checkValidvalue() {
            boolean valid = false;
            int number = 0;
            
            while(!valid) {
            try {
            number = (int)Double.parseDouble(GetValidvalue());
	        valid = true;				
            }catch(NumberFormatException e) {
	        
            	System.out.println("Input Was Not a Number");
           }
           }
            
           return number;
           
    }
  }
