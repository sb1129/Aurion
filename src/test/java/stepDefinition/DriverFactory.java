package stepDefinition;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import util.PropertyReader;

public class DriverFactory {

    protected static WebDriver driver;

    public  DriverFactory() {
        initialize();
    }

    public void initialize() {
        if (driver == null)
            createNewDriverInstance();
    }

    private void createNewDriverInstance() {
        String browser = new PropertyReader().readProperty("browser");
        if (browser.equals("chrome")) {
            driver = new ChromeDriver();
        } 
        /*else if(browser.equals("firefox")){
        	driver=new FirefoxDriver();
        }
        
        else if(browser.equals("IE")){
        	driver=new IEDriver();
        }*/
        else {
            System.out.println("I cannot read browser type");
        }
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void destroyDriver() {
        driver.quit();
        driver = null;
    }
}
