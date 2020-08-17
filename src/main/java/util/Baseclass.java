package util;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Baseclass {

	public WebDriver driver;

	public  void getBrowserInstance()  {
	
		
		System.setProperty("webdriver.chrome.driver", "E:\\MyWorkspace\\Assignmentproject\\driver\\chromedriver.exe");
WebDriver	 driver = new ChromeDriver();
		
		/*
  Configreader.getPropertyValue("browser").equals("Chrome");
  System.setProperty("webdriver.chrome.driver", Configreader.getPropertyValue("chromeDriverPath"));
	 driver = new ChromeDriver();
*/	}

	
}


