package setup;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Actions action;
	public File file;
	public FileInputStream fi;
	public Properties prop;
	
	public void openurl(String url) throws Exception{
		file = new File(".\\src\\Configurationproperties\\configuration");
		fi = new FileInputStream(file);
		prop = new Properties();
		prop.load(fi);
		
		String path = System.getProperty("user.dir");
		System.out.println("path: "+path);
		String browser = prop.getProperty("Browser");
		if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", path+"\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", path+"\\drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
	
			
		}
	
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		action = new Actions(driver);
	}
}
		