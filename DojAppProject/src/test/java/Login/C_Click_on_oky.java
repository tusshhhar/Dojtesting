package Login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_Click_on_oky {
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://testfrontend-website-ug7w.vercel.app/");
		
		driver.manage().window().maximize();
		

	
		//Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Click Login button
	   driver.findElement(By.xpath("//span[@class='text-red-500 font-semibold']")).click();		

	   		//Enter the number
	   	    WebElement num=driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter Mobile No.')])[2]"));
	   	   // num.sendKeys("9999999999");
	   	  //  num.sendKeys("aaaaaaaaaa");
	   	 num.sendKeys("123456789");
	   		
	   	//Click on Login btn 
	   	    driver.findElement(By.xpath("(//button[contains(text(),'Login')])[2]")).click();

	   	    Thread.sleep(3000);
	   	    
	   	//Click on oky button
	   	    driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
	   	    
	   	    
	   	    
}
}
