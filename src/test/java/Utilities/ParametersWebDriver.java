package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ParametersWebDriver {

    private static ThreadLocal<WebDriver> threadDriver=new ThreadLocal<>();
    private static ThreadLocal<String> threadBrowserName=new ThreadLocal<>();

    public static WebDriver getDriver()
    {
        Locale.setDefault(new Locale("EN"));
        System.setProperty("user.language", "EN");

        Logger.getLogger("").setLevel(Level.SEVERE);
        System.setProperty(org.slf4j.simple.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "Error");

        if (threadBrowserName.get() == null)
            threadBrowserName.set("chrome");

        if (threadDriver.get() == null) {
            switch (threadBrowserName.get()){
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    threadDriver.set(new FirefoxDriver());
                    break;
                case "safari":
                    WebDriverManager.safaridriver().setup();
                    threadDriver.set(new SafariDriver());
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    threadDriver.set(new EdgeDriver());
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--remote-allow-origins=*");
                    threadDriver.set(new ChromeDriver(options));
            }
        }

        return threadDriver.get();
    }

    public static void quitDriver()
    {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (threadDriver.get() != null)
        {
            threadDriver.get().quit();
            WebDriver driver=threadDriver.get();
            driver =null;
            threadDriver.set(driver);
        }
    }

    public static void waits(int millis)
    {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void setThreadBrowserName(String browserName) {
        ParametersWebDriver.threadBrowserName.set(browserName);
    }

    public static String getThreadBrowserName() {
       return ParametersWebDriver.threadBrowserName.get();
    }

}
