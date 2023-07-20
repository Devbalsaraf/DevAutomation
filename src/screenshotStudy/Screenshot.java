package screenshotStudy;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// To take screenshot, We need to type caste takesScreenshot interface to driver webdriver interface
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		String rs = RandomString.make(3);
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\Screeenshot\\testcase "+rs+".png");
		FileHandler.copy(src, dest);
		driver.close();

	}

}
