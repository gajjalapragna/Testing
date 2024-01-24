 package basics;

import java.time.Duration; 
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Shadi_com {
 WebDriver driver;
 WebDriverWait wait;
 Actions action;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Shadi_com s = new Shadi_com();
		s.openurl();
		s.login();
	}
	public void openurl(){
		System.setProperty("webbrowser.chrome .driver", "C:\\Users\\user\\eclipse-workspace\\Selenium28\\drivers\\chromedriver.exe");
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
	//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='aged']/following-sibling::div/div[@class='PreferenceForm_ageFrom__9vfhF']/div/div/div[@class='Dropdown-placeholder is-selected']")));
	driver.findElement(By.xpath("//label[text()='aged']/following-sibling::div/div[@class='PreferenceForm_ageFrom__9vfhF']/div/div/div[@class='Dropdown-placeholder is-selected']")).click();
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='25']")));
	driver.findElement(By.xpath("//div[text()='25']")).click();
	driver.findElement(By.xpath("//div[text()='to']/following-sibling::div/div/div/div[@class='Dropdown-placeholder is-selected']")).click();
	driver.findElement(By.xpath("//div[text()='29']")).click();
	driver.findElement(By.xpath("//label[text()='of religion']/following-sibling::div/div/div[@class='Dropdown-placeholder is-selected']")).click();
	driver.findElement(By.xpath("//div[text()='Hindu']")).click();
	driver.findElement(By.xpath("//label[text()='and mother tongue']/following-sibling::div/div/div[contains(@class,'is-selected')]")).click();
	driver.findElement(By.xpath("//div[text()=\"More\"]/following-sibling::div[text()='Telugu']")).click();
	driver.findElement(By.xpath("//button[text()=\"Let's Begin\"]")).click();
	driver.findElement(By.xpath("//span[text()='My Sister']")).click();
	//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@type=\\\"text\\\"]")));
	driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Haripriya");
	driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys("Veluru");
	driver.findElement(By.xpath("//input[@placeholder='DD']")).sendKeys("28");
	driver.findElement(By.xpath("//input[@name='month']")).sendKeys("06");
	driver.findElement(By.xpath("//input[@name='year']")).sendKeys("1998");
	driver.findElement(By.xpath("(//p[text()='Continue'])[1]")).click();
	//vdriver.findElement(By.xpath("//div[text()='Her religion']/following-sibling::div/label/following-sibling::div/div[@id=\"mui-component-select-community\"]/following-sibling::input[@value='Hindu']")).click();
	//driver.findElement(By.xpath("//div[text()='Community']/following-sibling::div/div/label/following-sibling::div/div/following-sibling::input[@value='Telugu']")).click();
	}

}
