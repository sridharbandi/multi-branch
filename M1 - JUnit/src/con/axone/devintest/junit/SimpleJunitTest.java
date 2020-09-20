package con.axone.devintest.junit;

import org.junit.Ignore;
import org.junit.Test;

public class SimpleJunitTest {

	@Ignore
	public void test1(){
		System.out.println("running a test");
	}
	
	
	@Ignore
	public void test2(){
		System.out.println("running test2");
	}
	
	@Ignore
	public void test3(){
		System.out.println("running test2");
	}
	
	private int someMethod(){
		return 0;
	}
	
}
