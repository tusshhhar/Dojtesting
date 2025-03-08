package D_Click_on_filter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class Click_on_short {

	public static void main(String[] args) throws InterruptedException {
						
						WebDriver driver= new ChromeDriver();
						
						driver.get("https://testfrontend-website-ug7w.vercel.app/");
						
						driver.manage().window().maximize();
				   
				   	        JavascriptExecutor js = (JavascriptExecutor) driver;
				   	        
				   	        // Scroll down by 1000 pixels
				   	        js.executeScript("window.scrollBy(0,1000)");
				   	        
				   	     Thread.sleep(3000);
				   	  // Click on sort
				   	     
				  
			
			}

		}
