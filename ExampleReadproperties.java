package basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ExampleReadproperties {
  @Test
  public void VerifyReadProperties() throws Exception {
	  
	  File file = new File(".\\src\\Configurationproperties\\configuration");
	  FileInputStream fi = new FileInputStream(file);
	  Properties prop = new Properties();
	  prop.load(fi);
	  
	  Object browser = prop.getProperty("Browser");
	  System.out.println(browser);
	  System.out.println(prop.getProperty("url"));
	  System.out.println("username");
	  System.out.println("password");
  fi.close();
  }
}
