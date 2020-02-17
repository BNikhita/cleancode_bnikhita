package interest.houseconst;

import static org.junit.Assert.*;

import org.junit.Test;

import interest.houseconst.CI;
import interest.houseconst.SI;

public class InterestTest {

	@Test
	public void test() {
	SI si=new SI();
	assertEquals(9000,si.calculation(1000,3,3),0);
	
	CI ci=new CI();
	assertEquals(1333.09,ci.calculation(1200,5.4,2),2);
	}

}