package Project.GolfGameFinal;

import java.util.Random;

public class Hole {

	public static Random A = new Random();
	
	public static int getHoleDistance() {


		int MIN = 882;
		int MAX = 884;
		int HoleDistance = A.nextInt(MAX-MIN)+MIN;
		return HoleDistance;
		

}
}