package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reg {
	@Test
	public void RegisterUser() {
		 WebDriverManager.chromedriver().setup();
		  WebDriver driver3 = new ChromeDriver();
	       driver3.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	       driver3.get("http://magento.com");
	       driver3.findElement(By.xpath("//*[@id=\"block-header\"]/ul/li[9]/a/span[1]/div")).click();
	       driver3.findElement(By.id("register")).click();
	       driver3.findElement(By.id("firstname")).sendKeys("Kay");
	       driver3.findElement(By.id("lastname")).sendKeys("KK");
	       driver3.findElement(By.id("email_address")).sendKeys("kv@gmail.com");
	       
	       Select type = new Select(driver3.findElement(By.id("company_type")));

	       type.selectByVisibleText("Analyst/Media");
	       
	       Select type1 = new Select(driver3.findElement(By.id("individual_role")));
	       type1.selectByValue("technical/developer");
	       
	       Select type2 = new Select(driver3.findElement(By.id("country")));
	       type2.selectByValue("US");
       
	       driver3.findElement(By.id("password")).sendKeys("TalkTalk@#$90#");
	       driver3.findElement(By.name("password_confirmation")).sendKeys("TalkTalk@#$90#");
	       if (!driver3.findElement(By.id("agree_terms")).isSelected())
	       {
	       driver3.findElement(By.id("agree_terms")).click();
	       }
	       //driver3.quit();
	}

}
