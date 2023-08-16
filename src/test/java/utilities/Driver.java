package utilities;

import io.appium.java_client.windows.WindowsDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class Driver {
    private Driver() {
        //SingletonPattern tekli kullanım demektir bu CLass dan başka obje oluşturulmasını engellemek için kullanılır
    }

    public static WebDriver driver;

    /*
    static WebDriver driver2;

    public static WebDriver getDriver() {
        if (driver == null) {

            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability("app", "C:\\Ucms\\Ucs.Ucms26.Designer 2.6.144.3\\Ucs.Ucms26.Designer.exe");
            try {
                driver = new WindowsDriver(new URL("http://127.0.0.1:4723"), cap) {
                };
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
            //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));
        }
        return driver;
    }
    public static WebDriver getDriver2() {
        if (driver2 == null) {
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability("app", "C:\\Ucms\\WDE-BaseModule\\InteractionWorkspace.exe");
            try {
                driver2 = new WindowsDriver(new URL("http://127.0.0.1:4723"), cap) {
                };
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
            //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));
        }
        return driver2;
    }
    @After
    public void tearDown() {
        //driver.quit();
    }
    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
    public static void quitDriver2() {
        if (driver2 != null) {
            driver2.quit();
            driver2 = null;
        }
    }

     */
    public static WebDriver getDriver() {
        if (driver == null) {

            switch (ConfigReader.getProperty("app")) {

                case "wde":
                    DesiredCapabilities cap = new DesiredCapabilities();
                    cap.setCapability("app", "C:\\Ucms\\WDE_BaseModule\\InteractionWorkspace.exe");


                    try {
                        driver = new WindowsDriver(new URL("http://127.0.0.1:4723/"), cap) {
                        };
                    } catch (MalformedURLException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case "designer":
                    DesiredCapabilities capabilities = new DesiredCapabilities();
                    capabilities.setCapability("app", "C:\\Ucms\\Ucs.Ucms26.Designer 2.6.144.3\\Ucs.Ucms26.Designer.exe");
                    try {
                        driver = new WindowsDriver(new URL("http://127.0.0.1:4723/"), capabilities) {

                        };
                    } catch (MalformedURLException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;

                case"edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;

            }

            //driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.close();
            //driver = null;
        }
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}


