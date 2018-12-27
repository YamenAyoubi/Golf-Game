package Project.GolfGameFinal;

import org.junit.Assert;
import org.junit.Test;

public class GolfGameTest {

	@Test
	public void Golf_test_angle_velcoity () {
	
	
		double Givenvelocity= 56;
		double Givenangle = 45;
		
		double expecteddistance = 320;
		double actual=App.main(Givenvelocity, Givenangle);

		Assert.assertEquals(expecteddistance,actual,0.1);

}
}