package com.zerobank.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    private Driver() {

    }

    private static WebDriver driver;

    public static WebDriver get() {
        // Test
        if (driver == null) {
            // this line will tell which browser should open based on the value from properties file
            String browser = ConfigurationReader.get("browser");
            switch (browser) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
                    break;
                case "chrome-headless":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
                case "chrome-ssl":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setAcceptInsecureCerts(true));
                    break;
                case "chrome-old":
                    ChromeOptions options = new ChromeOptions();
                    options.setBinary("C:\\Users\\rehan\\Downloads\\Win_619326_chrome-win\\chrome-win\\chrome.exe");
                    options.setAcceptInsecureCerts(true);
                    WebDriverManager.chromedriver().driverVersion("73.0.3683.68").setup();
                    driver = new ChromeDriver(options);
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "firefox-headless":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver(new FirefoxOptions().setHeadless(true));
                    break;
                case "ie":
                    if (!System.getProperty("os.name").toLowerCase().contains("windows"))
                        throw new WebDriverException("Your OS doesn't support Internet Explorer");
                    WebDriverManager.iedriver().setup();
                    driver = new InternetExplorerDriver();
                    break;

                case "edge":
                    if (!System.getProperty("os.name").toLowerCase().contains("windows"))
                        throw new WebDriverException("Your OS doesn't support Edge");
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;

                case "safari":
                    if (!System.getProperty("os.name").toLowerCase().contains("mac"))
                        throw new WebDriverException("Your OS doesn't support Safari");
                    WebDriverManager.getInstance(SafariDriver.class).setup();
                    driver = new SafariDriver();
                    break;
            }

        }

        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}

/*
    I believe it's not very cool to create new driver in every class.
    So what if we will have one central place, that will create driver.
    In this way, every test will use same driver. We will make process of drive switch match easier.
    In OOP we have Design Patterns.
    It's a proven solution for specific task.
    One of the most popular design pattern for webDriver in selenium is Singleton.
    Singleton - means single object of something for entire project.
    What's the point? this object will be static and we can ensure that all tests use same driver object. So we can create test suits.
    Also, whenever we need to use driver, we will just call it from Driver class. And it's gonna be same driver for everyone.
    Otherwise, new webDriver object = new browser.
    With this design, driver will be sharable and easy to access.
    What are the conventions of singleton pattern?
        - private static instance
        - private constructor (to prevent class instantiation)
        - public getter that returns private static instance
                        class Driver{
                            //only one private static instance
                            private static WebDriver driver;
                            //to prevent class instantiation
                            private Driver(){
                            }
                            public static WebDriver get(){
                            //if object was not created yet - create it
                                if(driver==null){
                                    driver = new ChromeDriver();
                                }
                                return driver;
                            }
                        }
 */