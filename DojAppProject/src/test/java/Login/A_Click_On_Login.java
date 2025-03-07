package Login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_Click_On_Login {

	public static void main(String[] args) throws InterruptedException {
				

			WebDriver driver= new ChromeDriver();
			
			driver.get("https://testfrontend-website-ug7w.vercel.app/");
			
			driver.manage().window().maximize();
			
	
		
			//Thread.sleep(3000);
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			//Click Login button
		   driver.findElement(By.xpath("//span[@class='text-red-500 font-semibold']")).click();		

	}

}