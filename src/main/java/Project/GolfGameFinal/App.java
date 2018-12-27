package Project.GolfGameFinal;


import java.util.Scanner;

public class App 
{
	
static Scanner in = new Scanner (System.in);
	
	
	public static double  main( double velocity , double angle  )
    {

    		double []distance = new double [0];
    		double gravity =9.8;
    		boolean running = true;
    		boolean win =false;
    		double HoleDistance;
    		int NumberOfTries=1;
    	

    		while (running) {
    			
    			HoleDistance=Hole.getHoleDistance();
        		
    			System.out.println(Hole.getHoleDistance() + " Your Target Distance Good Luck :)");
    			if(NumberOfTries == 0) {
    			
   				HoleDistance = Hole.getHoleDistance();}
 
    			NumberOfTries = NumberOfTries + 1 ;
    			do {

    			NumberOfTries++; 
				System.out.println("enter the shot power");
				velocity = GetValidNumber.checkValidvalue();


				if (velocity >= 300 || velocity <= 5 ) {
					System.out.println("Wrong Speed please Enter Number between 5 & 300");
					System.out.println("enter the shot power");
					velocity = GetValidNumber.checkValidvalue();}
				
				System.out.println("enter the angel degrees ");
				angle = GetValidNumber.checkValidvalue();
				
				if (angle >= 90 || angle <= 1) {

					System.out.println("Wrong Value please Enter Number between 1 & 89");
					System.out.println("enter the angel degrees ");
					angle = GetValidNumber.checkValidvalue();}
				
				double angleinradians = ((Math.PI / 180) * angle);
				
			    distance = Store_The_Result.addToArray(distance, (Math.round((Math.pow(velocity, 2) / gravity * Math.sin(2 * angleinradians)) * 10 ) / 10) );
			    
			    double total = 0;
				
			    for (int i = 0; i < distance.length; i++) {
					
			    	total += distance[i];
				}
			    
				System.out.println( "The Ball distance  " + distance[distance.length - 1] + " Total: " + total );


				 if (total < HoleDistance) {
					System.out.println("Too Much Weak ! ");}
				 
				 
				 if (total == HoleDistance) {
						System.out.println("Gollllllllllllll!!!!!" + " WOW Lucky Shot! ");
						
					win=true;}
				 
					if (total > HoleDistance ) {
						System.out.println("Too Much Strong Out Of Stadium! ");
						System.out.println("Do You Want To Play Again ? (Y/N)");
						String answer = GetPlayAgainAnswer();
						running = PlayAgain(answer);
					}
				 

    		}while(!win && NumberOfTries<=5 );

					System.out.println("Do You Want To Play Again ? (Y/N)");
					String answer = GetPlayAgainAnswer();
					running = PlayAgain(answer);

				}
    		
			return 0;

    }
    		
	private static boolean PlayAgain(String answer) {
		String upperCaseString = answer.toUpperCase();
 		switch(upperCaseString) {
 		case "Y":
 			System.out.println("welcome Back 👍");
 			return true;
 		default:
 			System.out.println(" ಠ_ಠ   See You Soon ಠ_ಠ");
 			return false;
 			
 		}

	}
	
 	    public static String GetPlayAgainAnswer() {
 			return in.nextLine();
 			
 	    }
 	    

}
