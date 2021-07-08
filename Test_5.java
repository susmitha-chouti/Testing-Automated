import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_5 {
	static WebDriver driver;
	public void getlinks() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\se_driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.thesparksfoundationsingapore.org/");
		driver.manage().window().maximize();
		Thread.sleep(3000);	
		//10.test case for checking links and software & app
		driver.findElement(By.xpath("//a[contains(text(),\"LINKS\")]")).click();
		driver.findElement(By.xpath("//a[contains(text(),\"Software & App\")]")).click();
		
		//11.test case for printing the links in software & app page
		List<WebElement> links= driver.findElements(By.tagName("a"));
		for(WebElement allLinks : links) {
			System.out.println(allLinks.getText()+"-"+allLinks.getAttribute("href"));
		}
	}
	public static void main(String[] args) throws InterruptedException {
		Test_5 obj = new Test_5();
		obj.getlinks();	
		driver.close();

	}

}
