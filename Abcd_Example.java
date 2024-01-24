package basics;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Abcd_Example {
	WebDriver driver;
	WebDriverWait wait;
	Actions action;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Abcd_Example s = new Abcd_Example();
		s.openurl();
		s.login();
	}
	public void openurl(){
		System.setProperty("webbrowser.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Selenium28\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.shaadi.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		wait = new WebDriverWait(driver, Duration.ofSeconds(60  ));
		action = new Actions(driver);
		
	}
	public void login() throws Exception {
	driver.findElement(By.xpath("//label[text()=\"I'm looking for a\"]/following-sibling::div/div/div[1]")).click();
	driver.findElement(By.xpath("//div[text()='Man']")).click();
	Thread.sleep(1000);
	action.sendKeys(Keys.PAGE_DOWN).build().perform();
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='aged']/following-sibling::div/div[@class='PreferenceForm_ageFrom__9vfhF']/div/div/div[@class='Dropdown-placeholder is-selected']")));
	driver.findElement(By.xpath("//label[text()='aged']/following-sibling::div/div[@class='PreferenceForm_ageFrom__9vfhF']/div/div/div[@class='Dropdown-placeholder is-selected']")).click();
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='25']")));
	driver.findElement(By.xpath("//div[text()='25']")).click();
	driver.findElement(By.xpath("//div[text()='to']/following-sibling::div/div/div/div[@class='Dropdown-placeholder is-selected']")).click();
	driver.findElement(By.xpath("//div[text()='29']")).click();
	driver.findElement(By.xpath("//label[text()='of religion']/following-sibling::div/div/div[@class='Dropdown-placeholder is-selected']")).click();
	driver.findElement(By.xpath("//div[text()='Hindu']")).click();
	driver.findElement(By.xpath("//label[text()='and mother tongue']/following-sibling::div/div/div[contains(@class,'is-selected')]")).click();
	driver.findElement(By.xpath("//div[text()=\"More\"]/following-sibling::div[text()='Telugu']")).click();
	
	}

}
