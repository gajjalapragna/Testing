 package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Outlook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Selenium28\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://signup.live.com/signup?lcid=1033&wa=wsignin1.0&rpsnv=15&ct=1690874256&rver=7.0.6737.0&wp=MBI_SSL&wreply=https%3a%2f%2foutlook.live.com%2fowa%2f%3fnlp%3d1%26signup%3d1%26RpsCsrfState%3dae20fe42-e3ae-16bc-41a2-de1d3e62e50e&id=292841&CBCXT=out&lw=1&fl=dob%2cflname%2cwld&cobrandid=90015&lic=1&uaid=0fc916f0b7d742c99282e4e520b0782a");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("MemberName")).sendKeys("AmruthaGangula");
		driver.findElement(By.id("iSignupAction")).click();
		driver.findElement(By.name("Password")).sendKeys("Amrutha@20");
		driver.findElement(By.id("iSignupAction")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Amrutha");
		driver.findElement(By.name("LastName")).sendKeys("Gangula");
		driver.findElement(By.id("iSignupAction")).click();
	}

}


