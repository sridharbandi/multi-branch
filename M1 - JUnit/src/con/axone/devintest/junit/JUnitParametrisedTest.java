package con.axone.devintest.junit;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)

public class JUnitParametrisedTest {
	
	String uName;
	String passwd;
	int type;
	int sum;

	public JUnitParametrisedTest(String uName, String passwd, int type){
		this.uName = uName;
		this.passwd = passwd;
		this.type = type;
	}
	
	
	@Test
	public void login(){
		//code to launch browser
		System.out.println("Logging in with "+ uName +" & "+ passwd + " and " + type);
	}
	
	
	@Parameters
	public static Collection<Object[]> dataSupplier(){
		Object[][] data = new Object[4][3];
		
		data[0][0] = "user1";
		data[0][1] = "pass1";
		data[0][2] = 101;
		
		data[1][0] = "user2";
		data[1][1] = "pass2";
		data[1][2] = 202;
		
		data[2][0] = "user3";
		data[2][1] = "pass3";
		data[2][2] = 303;
		
		data[3][0] = "user4";
		data[3][1] = "pass4";
		data[3][2] = 404;

		return Arrays.asList(data);
		
	}
	
}
