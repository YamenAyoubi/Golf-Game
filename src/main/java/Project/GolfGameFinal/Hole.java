package Project.GolfGameFinal;

import java.util.Random;

public class Hole {

	public static Random A = new Random();
	
	public static int getHoleDistance() {


		int MIN = 1500;
		int MAX = 2500;
		int HoleDistance = A.nextInt(MAX-MIN)+MIN;
		return HoleDistance;
		

}
}