package Project.GolfGameFinal;

import java.util.Arrays;

public class Store_The_Result {
	
	public static double [] addToArray(double[] source, double toAdd) {
		boolean isAdded = false;
		
		for(int i = 0; i<source.length; i++) {
			if(source[i] == 0) {
				source[i] = toAdd;
				isAdded = true;
				break;
			}			
		}
		
		if(isAdded == false) {
			source = expandArray(source);
			source[source.length-1] = toAdd;
		}
		return source;		
	}

	public static double[] expandArray(double[] source) {
		return Arrays.copyOf(source, source.length + 1);
	}

	

}
