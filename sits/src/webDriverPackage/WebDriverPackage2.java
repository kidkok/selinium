package webDriverPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverPackage2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		// Step 1 Launch web browser
		WebDriver browser = new FirefoxDriver();
		
		// Step 2 Enter https:// www.google.com and click on the Enter Button
		browser.get(" https: //www.google.com/" );
		
 		// Step 3 Enter "Herndon VA" and click on search button search
		
		
		// browser.findElement (By. name ("q")). sendkeys (" Herndon VA");
		
		
	}

}
