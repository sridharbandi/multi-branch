package con.axone.devintest.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppUtilsTest {

	AppUtils aUtl = new AppUtils();
	
	@Test
	public void test1_add(){
		int actRes = aUtl.add(10, 20);
		int expRes = 30;
		assertEquals(expRes, actRes);
	}
	
	@Test
	public void test2_add(){
		int actRes = aUtl.add(-100, -200);
		int expRes = 300;
		assertEquals(expRes, actRes);
	}
	
	@Test
	public void test3_multiply(){
		int actRes = aUtl.add(10, 2);
		int expRes = 20;
		assertEquals(expRes, actRes);
	}
	
}
