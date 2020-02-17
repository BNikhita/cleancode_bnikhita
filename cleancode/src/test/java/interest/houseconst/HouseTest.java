package interest.houseconst;

import static org.junit.Assert.*;

import org.junit.Test;

import interest.houseconst.MainHouse;

public class HouseTest {

	@Test
	public void test() {
		
		 
		MainHouse mh=new MainHouse();
		assertEquals(4800,mh.standardBase("Standard",4),0);
		
		assertEquals(3000,mh.standardBase("AboveStandard",2),0);
		
		assertEquals(5400,mh.standardBase("HighStandard",3),0);
		
		assertEquals(10000,mh.standardBase("FullyHighStandard",4),0);
		
	}

}
