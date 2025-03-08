package D_Click_on_filter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
public class Click_on_filter {

	public static void main(String[] args) throws InterruptedException {
		
						
						WebDriver driver= new ChromeDriver();
						
						driver.get("https://testfrontend-website-ug7w.vercel.app/");
						
						driver.manage().window().maximize();
						
				   	        JavascriptExecutor js = (JavascriptExecutor) driver;
				   	        
				   	        // Scroll down by 1000 pixels
				   	        js.executeScript("window.scrollBy(0,1000)");

				   	  // Click on Filter
				   	 	Thread.sleep(3000);   
				   	      driver.findElement(By.xpath("//h1[normalize-space()='Filter']")).click();
					   	    
				   	// Click on High to Low
//				   	   Thread.sleep(3000);   
//				   	      driver.findElement(By.xpath("//input[@value='Rating: High to Low']")).click();
				   	      
				   	// Click on Low to High
					   	   Thread.sleep(3000);   
					   	      driver.findElement(By.xpath("//input[@value='Cost: Low to High']")).click();
					   	
				  	   	// Click on apply
				   	   Thread.sleep(3000);  
				   	 driver.findElement(By.xpath("	//button[@class='bg-red-500 text-white px-4 py-2 rounded']")).click();

				   
				   	    
				   	 

	}

}
