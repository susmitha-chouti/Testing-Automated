import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_3 {
	static WebDriver driver;
	public void aboutus() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\se_driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.thesparksfoundationsingapore.org/");
		driver.manage().window().maximize();
		Thread.sleep(3000);	
		//6.test case for checking About us, guiding principles and display them 
		driver.findElement(By.xpath("//a[contains(text(),\"About Us\")]")).click();
		driver.findElement(By.xpath("//a[contains(text(),\"Guiding Principles\")]")).click();
		WebElement guide =driver.findElement(By.xpath("//span[contains(text(),\"Guiding Principles based on our Goals, Mission and Core Values\")]"));
		if(guide.isDisplayed()) {
			System.out.println("Guding Principles displayed");
		}
	}
	//7.test case for checking advisor information
	public void advisor() {
		driver.findElement(By.xpath("//div[@class=\"col-md-3 agile-blog-sidebar\"]//a[contains(text(),\"Advisors and Patrons\")]")).click();
		WebElement adv= driver.findElement(By.xpath("//span[contains(text(),\"Advisors\")]"));
		if(adv.isDisplayed()) {
			System.out.println("Advsior information is displayed");
		}
	}
	public static void main(String[] args) throws InterruptedException {
		Test_3 obj = new Test_3();
		obj.aboutus();
		obj.advisor();
		driver.close();

	}

}
