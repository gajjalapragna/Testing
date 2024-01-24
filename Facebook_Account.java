package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Selenium28\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Amrutha");
		driver.findElement(By.name("lastname")).sendKeys("Gangula");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Gangula@123");
		driver.findElement(By.name("reg_email__")).sendKeys("7674970539");
		new Select(driver.findElement(By.id("day"))).selectByIndex(5);
		new Select(driver.findElement(By.id("month"))).selectByValue("5");
		new Select(driver.findElement(By.id("year"))).selectByVisibleText("2001");
		//driver.findElement(By.xpath("//input[@type=\"radio\"]")).click();
		driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input[@type='radio']")).click();
		driver.findElement(By.name("websubmit")).click();
 }
}
