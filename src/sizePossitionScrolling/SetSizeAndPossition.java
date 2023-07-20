package sizePossitionScrolling;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeAndPossition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		//driver.manage().window().minimize();
		
		// To set size of browser
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		Dimension d=new Dimension(100,100);
		driver.manage().window().setSize(d);
		
		

	}

}
