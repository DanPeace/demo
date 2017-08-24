
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.lang.*;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		// declaration and instantiation of objects/variables
    	System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.18.0-win64\\geckodriver.exe");
    	
		WebDriver driver = new FirefoxDriver();
		
        String baseUrl = "http://demo.guru99.com/selenium/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
		
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed again!");
        } else {
            System.out.println("Test Failed");
        }
       
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
       
        //close Fire fox
        driver.close();
		

 
 
	}

}
