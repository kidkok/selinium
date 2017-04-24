package webDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MercuryTours {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//open Firefox web browser
		WebDriver driver  = new  FirefoxDriver();
		//launch Mercury Website
		driver.get("http://newtours.demoaut.com/");
		//Print the tile of the page
		driver.getTitle();
	
		System.out.println(driver.getTitle ());
		
		//Click REGISTER link
		driver.findElement (By . linkText ("REGISTER")) .click();
		//Enter first name
		driver.findElement(By.name("firstName")) .sendKeys("Kidist");
		//Enter last name
		driver.findElement(By.name("lastName")) .sendKeys("Tegegn");
		
	}

}
