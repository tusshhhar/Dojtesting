package OTP;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_Enter_otp {

	public static void main(String[] args) throws InterruptedException {
			
			WebDriver driver= new ChromeDriver();
			
			driver.get("https://testfrontend-website-ug7w.vercel.app/");
			
			driver.manage().window().maximize();
			

		
			
Thread.sleep(3000);				
//Click Login button
		   driver.findElement(By.xpath("//span[@class='text-red-500 font-semibold']")).click();		

Thread.sleep(3000);
//Enter the number
		   	    WebElement num=driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter Mobile No.')])[2]"));
		   	    num.sendKeys("9999999999");
		   	    
Thread.sleep(3000); 		   		
//Click on Login btn 
		   	    driver.findElement(By.xpath("(//button[contains(text(),'Login')])[2]")).click();

Thread.sleep(3000);  
//Click on oky button
		   	    driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		   	    
Thread.sleep(3000);
//Enter otp
		 driver.findElement(By.xpath("(//input[@id='otp-input-0'])[2]")).sendKeys("123456");

Thread.sleep(3000);
//Click on submit button
		 
		 driver.findElement(By.xpath("(//button[contains(text(),'Submit')])[2]")).click();
		   
Thread.sleep(3000);
//Click on oky button
	   	    driver.findElement(By.xpath("//button[@class=\"swal2-confirm swal2-styled\"]")).click();
	}

}
