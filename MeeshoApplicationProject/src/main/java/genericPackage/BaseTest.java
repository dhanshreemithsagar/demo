package genericPackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Flib implements IautoConstant{
	
	protected static WebDriver driver;
	
	@BeforeMethod
	public void setUp() throws IOException
	{
		Flib flib = new Flib();
		String browserValue = flib.readPropertyData
	}

}
