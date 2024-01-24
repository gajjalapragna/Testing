package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Testoutlook  {
    WebDriver driver;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Testoutlook t1 = new Testoutlook();
		t1.openURL();
		t1.register();
		
	}
	public void openURL() {
		String path = System.getProperty("user.dir");
		System.out.println("path:"+ path);
		
		System.getProperty("webdriver.chrome.driver",path+"\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://signup.live.com/signup?lcid=1033&wa=wsignin1.0&rpsnv=15&ct=1690965253&rver=7.0.6737.0&wp=MBI_SSL&wreply=https%3a%2f%2foutlook.live.com%2fowa%2f%3fnlp%3d1%26signup%3d1%26RpsCsrfState%3d66e2ed84-3ff5-b054-7f3d-b9cec3ac9edd&id=292841&CBCXT=out&lw=1&fl=dob%2cflname%2cwld&cobrandid=90015&lic=1&uaid=200c91f11a884a5a9221cd579a41d706");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	public void register() throws Exception {
		driver.findElement(By.id("MemberName")).sendKeys("AmruthaGangula");
		driver.findElement(By.id("iSignupAction")).click();
		driver.findElement(By.id("PasswordInput")).sendKeys("Amrutha@20");
		driver.findElement(By.id("ShowHidePasswordCheckbox")).click();
		driver.findElement(By.id("iSignupAction")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Amrutha");
		driver.findElement(By.id("LastName")).sendKeys("Gangula");
		driver.findElement(By.id("iSignupAction")).click();
		new Select(driver.findElement(By.id("Country"))).selectByIndex(4);
		Thread.sleep(1000);
		new Select(driver.findElement(By.id("Country"))).selectByVisibleText("India");
		Thread.sleep(1000);
		new Select(driver.findElement(By.id("BirthMonth"))).selectByValue("6");
		Thread.sleep(1000);
		new Select(driver.findElement(By.id("BirthDay"))).selectByVisibleText("20");
		driver.findElement(By.id("BirthYear")).sendKeys("2001");
		driver.findElement(By.id("iSignupAction")).click();
	
	}
  }
