package con.axone.devintest.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class JUnitDemo {

	//Login
	//book ticket
	//check status
	//cancel ticket
	//logout
	
	//gets run only once at the beginning of the class being run.
	@BeforeClass
	public static void loadTestData(){
		//remove all records from DB
		//Data setup - Add a ticket which is going to be used for check status
		//Data setup - Add a ticket which is going to be used for cancel
		System.out.println("Loading Test Data");
	}
	
	//gets run before each test
	@Before
	public void login(){
		System.out.println("Logging in...");
	}
	
	@Test
	public void C_bookTicket(){
		System.out.println("Booking a ticket");
	}
	
	@Test
	public void B_checkStatus(){
		System.out.println("Checking status");
	}
	
	@Test 
	public void A_cancel(){
		System.out.println("Cancelling a ticket");
	}
	
	//gets run after each test
	@After
	public  void logout(){
		System.out.println("Logging out...");
	}
	

	//gets run only once at the end of execution of this class
	@AfterClass
	public static void tidyUp(){
		System.out.println("Deleting records from the last run");
	}
	
}
