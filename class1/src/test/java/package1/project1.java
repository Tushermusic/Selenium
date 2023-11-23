package package1;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import dev.failsafe.internal.util.Assert;
//import org.junit.Test;
//import static org.junit.Assert.assertEquals;


public class project1 {


	public static  void main(String[] args) {
		
		//initialization
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://trytestingthis.netlify.app/");
		driver.manage().window().maximize();
		
		//radiobutton
		
		WebElement radiobutton = driver.findElement(By.id("male"));
		radiobutton.click();
		
		///checklist
		WebElement checklistbutton = driver.findElement(By.id("moption"));
		checklistbutton.click();
		
		//driver.findElement(By.id("user-name")).sendKeys("standard_user");
		//driver.findElement(By.id("password")).sendKeys("secret_sauce");
		//driver.findElement(By.id("login-button")).click();
		
		//type_1
		
//		String ExpectedTitle = "Swag Labs";
//		String Actualtitle = driver.getTitle();
//		System.out.println(Actualtitle);
//		
//		if(Actualtitle.equals(ExpectedTitle)) 
//		{
//			System.out.println("Titile Match");
//		}
//		else {
//			System.out.println("Titile Dosen't Match");
//		}
		//type  2
		
//		String ExpectedTitle = "Swag Labsss";
//		String ActualTitle = driver.getTitle();
//		assertEquals(ActualTitle,ExpectedTitle);
		
		
		
    }


		
	}

	
	
