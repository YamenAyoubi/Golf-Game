package Project.GolfGameFinal;

import java.util.Random;

public class Hole {

	public static Random A = new Random();
	
	public static int getHoleDistance() {


		int MIN = 1000;
		int MAX = 10000;
		int HoleDistance = A.nextInt(MAX-MIN)+MIN;
		return HoleDistance;
		

}
}