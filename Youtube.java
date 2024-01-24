package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {
	WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Youtube s = new Youtube();
			s.automateYoutube();
			s.addaccount();
		}
	public void automateYoutube() {
		String path = System.getProperty("user.dir");
		System.out.println(path);
		System.setProperty("webdriver.chrome.driver",path+"\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	public void addaccount() {
		driver.findElement(By.id("search")).sendKeys("Blinding lights");
		
	}

}
