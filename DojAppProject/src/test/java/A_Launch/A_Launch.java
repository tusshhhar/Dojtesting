package A_Launch;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_Launch {
	
	public static void main(String[] args) {
		

	WebDriver driver= new ChromeDriver();
	
	driver.get("https://testfrontend-website-ug7w.vercel.app/");
	
	driver.manage().window().maximize();
	
   }
}