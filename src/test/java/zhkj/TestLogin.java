package zhkj;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestLogin {

  @Test
	public void testLogin() throws Exception {		
	    System.setProperty("webdriver.chrome.driver", ".\\src\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("http://www.baidu.com");
		wd.findElement(By.id("u1")).findElement(By.name("tj_login")).click();
		Thread.sleep(2000);
	    /*wd.findElement(By.cssSelector(".tang-pass-footerBar p#TANGRAM__PSP_10__footerULoginBtn")).click();*/
		wd.findElement(By.id("TANGRAM__PSP_10__footerULoginBtn")).click();
		wd.findElement(By.name("userName")).sendKeys("15803855631");
		wd.findElement(By.name("password")).sendKeys("md15238783879");
		wd.findElement(By.id("TANGRAM__PSP_10__submit")).click();
		Thread.sleep(6000);
		wd.findElement(By.id("TANGRAM__36__button_send_mobile")).click();
		Thread.sleep(25000);
		wd.findElement(By.id("TANGRAM__36__button_submit")).click();
		Thread.sleep(2000);
		assertTrue(wd.findElement(By.id("s_username_top")).findElement(By.className("user-name")).getText().contains("怒斩戮杀王"));
	}
}
