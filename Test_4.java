import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_4 {
	static WebDriver driver;
	public void contactus() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\se_driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.thesparksfoundationsingapore.org/");
		driver.manage().window().maximize();
		Thread.sleep(3000);	
		//8.test case for checking contact us
		driver.findElement(By.xpath("//a[contains(text(),\"Contact Us\")]")).click();
		//9.test case for navigating to linkedin page of sparks foundation
		driver.findElement(By.xpath("//a[@href=\"https://www.linkedin.com/groups/10379184/\"]")).click();
}
	
	public static void main(String[] args) throws InterruptedException {
		Test_4 obj = new Test_4();
		obj.contactus();	
		driver.close();
	}
}

