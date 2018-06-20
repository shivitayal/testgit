package testClass;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
public class Automation {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities = new DesiredCapabilities();
	System.setProperty("webdriver.ie.driver", "C:\\Users\\shitayal\\Downloads\\IEDriverServer_Win32_3.12.0\\IEDriverServer.exe");
	
	capabilities = DesiredCapabilities.internetExplorer();
	capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
	//capabilities.setCapability(CapabilityType.PLATFORM, "Windows 7");
	//capabilities.setCapability("screenResolution", "1280x1024");
	//capabilities.setCapability(CapabilityType.VERSION, "11");
	InternetExplorerDriver driver = new InternetExplorerDriver(capabilities); 
	driver.get("https://www.google.com/");
	login(driver);
	}
	
	public static void login(WebDriver driver)
	{
	driver.findElement(By.xpath("//input[@id = 'lst-ib']")).sendKeys("Shivangi");
	System.out.println("shivangi");
	}
	
}
