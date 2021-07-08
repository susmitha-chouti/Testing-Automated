import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test_2 {

	static WebDriver driver;
	public void checkjoinus() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\se_driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.thesparksfoundationsingapore.org/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//3.test case for checking join us, why join us 
		
		driver.findElement(By.xpath("//a[contains(text(),'Join Us')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Why Join Us')]")).click();
		//4.test case for contact details
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scrollBy(0,750)");
		WebElement join = driver.findElement(By.xpath("//p[contains(text(),\"We will get in touch with you on the contact provided\")]"));
		if(join.isDisplayed()) {
			System.out.println("contact form is checked");
		}
	}
	//5.test case for submitting the my details
	public void contact() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name=\"Name\"]")).sendKeys("Chouti Susmitha");
		driver.findElement(By.xpath("//input[@name=\"Email\"]")).sendKeys("susmithasusmi986@gmail.com");
		//driver.findElement(By.xpath("//select[@class=\"form-control\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value=\"Submit\"]")).click();
		
	}
	public static void main(String[] args) throws InterruptedException {
		Test_2 obj = new Test_2();
		obj.checkjoinus();
		obj.contact();
		driver.close();
	}

}
