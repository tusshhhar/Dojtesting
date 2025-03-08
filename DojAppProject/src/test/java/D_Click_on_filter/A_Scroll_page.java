package D_Click_on_filter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class A_Scroll_page {
	
		public static void main(String[] args) throws InterruptedException {
				
				WebDriver driver= new ChromeDriver();
				
				driver.get("https://testfrontend-website-ug7w.vercel.app/");
				
				driver.manage().window().maximize();
				

	//Scroll page
		   	           JavascriptExecutor js = (JavascriptExecutor) driver;
		   	        
		   	           Thread.sleep(3000);
		   	        // Scroll down by 1000 pixels
		   	        js.executeScript("window.scrollBy(0,1000)");
		   
		   	    
		   	    
		   	    
	}

}
