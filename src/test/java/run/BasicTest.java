package run;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import singleton_driver.SingletonDriver;

public class BasicTest {
    private static WebDriver driver;
    @BeforeTest
    public static void setup(){
        System.out.println("SingletonDriver being tested ");
    }
    @Test
    public static void test(){
        SingletonDriver.getInstance();
        System.out.println("----- Test actual performing ----");
    }

    @AfterTest
    public static void tearDown(){
        System.out.println("Test passed");
    }
    public static WebDriver getDriver(){
        return driver;
    }
}
