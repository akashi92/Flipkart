package Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TakeScreeShot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	      WebDriver driver= new FirefoxDriver();
	      driver.get("https://www.flipkart.com/");
	      driver.findElement(By.xpath("//button[.='✕']")).click();
	      Thread.sleep(3000);
	      TakesScreenshot ts=(TakesScreenshot)driver;
	      File src = ts.getScreenshotAs(OutputType.FILE);
	      File dst=new File("D://Flipkart.jpeg");
	      FileUtils.copyFile(src, dst);
	}

}
