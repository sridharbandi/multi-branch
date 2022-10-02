package con.axone.devintest.junit;

import org.junit.Ignore;
import org.junit.Test;

public class SimpleJunitTest {

	@Test
	public void test1(){
		System.out.println("running a test");
	}
	
	
	@Test
	public void test2(){
		System.out.println("running test2");
	}
	
	@Test
	public void test3(){
		System.out.println("running test2");
	}
	
	private int someMethod(){
		return 0;
	}

	private int someMethod2(){
		return 1;
	}
	
}
