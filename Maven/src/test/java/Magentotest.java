

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Magentotest {
	@Test
public void test() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("https://magento.com");
	Welcome w =new Welcome(driver);
	w.clickOnMyAccount();
	Login l=new Login(driver);
	l.typeEmail("kundansinghmahisour@gmail.com");
	l.typePassword("Welcome@123");
	l.clickOnLogin();
	Home h=new Home(driver);
	h.clickOnLogOut();
	driver.quit();
	
}
}
