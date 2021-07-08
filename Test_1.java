import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_1{

	static WebDriver driver;
	public void launch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\se_driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.thesparksfoundationsingapore.org/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	//1.test case for verification of title
	public void checkName() {
		WebElement name= driver.findElement(By.xpath("//div[@class=\"top-header-agile\"]//a[contains(text(),\"The Sparks Foundation\")]"));
		if(name.isDisplayed()) {
			System.out.println("name is verified succesfully");
		}
		else {
			System.out.println("name is not verified");
		}
		
	}
	//2.test case for verification of logo
	public void checklogo() {
		WebElement logo= driver.findElement(By.xpath("//img[@src=\"/images/logo_small.png\"]"));
		if(logo.isDisplayed()) {
			System.out.println("logo is verified succesfully");
		}
		else {
			System.out.println("logo is not verified");
		}
	}
	public static void main(String[] args) throws InterruptedException {
		Test_1 obj=new Test_1();
		obj.launch();
		obj.checkName();
		obj.checklogo();
		driver.close();
	}

}
