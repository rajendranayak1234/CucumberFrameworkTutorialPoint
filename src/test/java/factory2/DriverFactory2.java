package factory2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory2 {
static WebDriver driver=null;
public static WebDriver intializeBrowser(String browserName)
{
	if(browserName.equals("chrome"))
	{
		driver=new ChromeDriver();
	}
	else if(browserName.equals("firefox"))
	{
		driver=new FirefoxDriver();
	}
	else if (browserName.equals("edge"))
	{
		driver=new EdgeDriver();
	}
	else if(browserName.equals("safari"))
	{
		driver=new SafariDriver();
	}
	return driver;
}
public static WebDriver getDriver()
{
	return driver;
}
}
