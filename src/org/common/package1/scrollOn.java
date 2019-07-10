package org.common.package1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class scrollOn {
	
	  public static void main(String[] args) throws InterruptedException {  
                
	        System.setProperty("webdriver.gecko.driver",".\\exefiles\\geckodriver.exe" );  
	              
	        // Initialize Gecko Driver using Desired Capabilities Class  
	            DesiredCapabilities capabilities = DesiredCapabilities.firefox();  
	            capabilities.setCapability("marionette",true);  
	            WebDriver driver= new FirefoxDriver();
	          
	        // Launch Website  
	        driver.navigate().to("https://www.samsung.com/in/");   
	        
	  
	        //Scroll down the webpage by 4500 pixels  
	        JavascriptExecutor js = (JavascriptExecutor)driver;  
	        
	        for(int i=1;i<5;i++)
	        {
	        Thread.sleep(3000);
	        js.executeScript("scrollBy(0, 500)");  
	        }  
	        
	        for(int i=1;i<6;i++)
	        {
	        	Thread.sleep(3000);
	        	js.executeScript("scrollBy(0, -400)");
	        }
		  

}
}
