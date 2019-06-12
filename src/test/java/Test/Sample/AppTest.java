package Test.Sample;



import org.apache.log4j.*;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	
	private static Logger log=LogManager.getLogger(AppTest.class.getName());
	
	
	public static void main(String args[]) {
		
		log.error("hello");
		
		System.out.println("hi");
		
	}
    
}
