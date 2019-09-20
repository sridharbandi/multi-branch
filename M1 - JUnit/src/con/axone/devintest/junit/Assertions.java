package con.axone.devintest.junit;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class Assertions {

	@Rule
	public ErrorCollector errColl = new ErrorCollector();
	
	@Test
	public void bookTicket(){
		System.out.println("Starting the test .. ");
		
		int expResult = 200;
		int actResult = 500;
		
		try{
			assertEquals(expResult, actResult);
		}catch(Throwable err){
			errColl.addError(err);
			System.out.println("Issues with Assertion 1 ");
		}
		
		System.out.println("Assertion 1 complete ..");
		
		String exp = "Booking Success";
		String act = "Booking Success";
		
		try{
			assertEquals(exp, act);
		}catch(Throwable err){
			errColl.addError(err);
			System.out.println("Issues with Assertion 2 ");
		}
		
		System.out.println("Assertion 2 complete ..");
		
		System.out.println("Ending the test .. ");
		
	}
	
	
}
