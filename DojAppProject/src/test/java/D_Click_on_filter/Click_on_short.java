package D_Click_on_filter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class Click_on_short {

	public static void main(String[] args) throws InterruptedException {
						
						WebDriver driver= new ChromeDriver();
						
						driver.get("https://testfrontend-website-ug7w.vercel.app/");
						
						driver.manage().window().maximize();
				   
				   	        JavascriptExecutor js = (JavascriptExecutor) driver;
				   	        
				   	        
				   	        // Scroll down by 1000 pixels
				   	     Thread.sleep(3000);
				   	        js.executeScript("window.scrollBy(0,1000)");
				   	        
				   	   
				   	  // Click on sort
				   	   Thread.sleep(3000);
				   	  driver.findElement(By.xpath("//span[@class='text-sm font-medium text-[#575757]']")).click();
				   
				   	 // Click on High to low
				      Thread.sleep(3000);
				   	  driver.findElement(By.xpath("//li[normalize-space()='Price: High to Low']")).click();
				   
				  
				  
			}

		}
