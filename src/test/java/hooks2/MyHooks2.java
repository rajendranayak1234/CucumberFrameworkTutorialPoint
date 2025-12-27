package hooks2;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Utils2.ConfigReader;
import factory2.DriverFactory2;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class MyHooks2 {
WebDriver driver;

@Before
public void setup()
{
	Properties prop=ConfigReader.initializeProperties();
	DriverFactory2.intializeBrowser(prop.getProperty("browser"));
	driver=DriverFactory2.getDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get(prop.getProperty("url"));
	
}
@After
public void tearDown(Scenario Scenario)
{
	String ScenarioName = Scenario.getName().replaceAll("","_");
	byte[] scrScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	Scenario.attach(scrScreenshot, "image/png",ScenarioName );
	
	driver.quit();
}
}

