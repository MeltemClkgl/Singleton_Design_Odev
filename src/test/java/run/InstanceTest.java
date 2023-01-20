package run;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import singleton_driver.SingletonClass;

public class InstanceTest {
    private static WebDriver driver;

    @BeforeMethod
    public static void setup(){
        driver= WebDriverManager.edgedriver().create();
        SingletonClass.getSingletonClass();
        SingletonClass.getDriver();

        System.out.println("SingletonDriver being tested " + driver);
    }
    @Test
    public static void test01(){

        String expectedTitle="google";
        String actualTitle= driver.getTitle();

        Assert.assertEquals(expectedTitle,actualTitle);
        Assert.assertEquals(expectedTitle,actualTitle,"Expected title is matching to actual title");

        Assert.assertTrue(expectedTitle.equals(actualTitle));
        Assert.assertTrue(expectedTitle.equals(actualTitle),"Expected title is not matching to actual title");


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
