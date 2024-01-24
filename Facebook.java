package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\user\\eclipse-workspace\\Selenium28\\drivers\\msedgedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("firstname")).sendKeys("Gangisetti");
		driver.findElement(By.name("lastname")   ).sendKeys("Kudipudi");
		driver.findElement(By.name("reg_email__")).sendKeys("gangisetti@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Gangi@123");
		new Select(driver.findElement(By.id("day"))).selectByValue("7");
		new Select(driver.findElement(By.id("month"))).selectByIndex(6);
		new Select(driver.findElement(By.id("year"))).selectByVisibleText("1999");
		 

	}

}
