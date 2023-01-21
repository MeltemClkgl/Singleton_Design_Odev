package run;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class InstanceTest {

    private static WebDriver driver;
    SoftAssert softAssert;

    @BeforeClass
    void setUpForClass() {
        softAssert = new SoftAssert();
    }

    @BeforeMethod
    void setUp() {
        driver = WebDriverManager.edgedriver().create();
        driver.get("https://www.google.com");
    }

    @Test
    void method01() {
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();

        softAssert.assertEquals(actualTitle, expectedTitle);


        expectedTitle = "Google";

        softAssert.assertEquals(actualTitle, expectedTitle, "Expected title is not matching to actual title");

        softAssert.assertTrue(expectedTitle.equals(actualTitle));
        softAssert.assertTrue(expectedTitle.equals(actualTitle), "Expected title is not matching to actual title");

        System.out.println("method01()done !!!");
    }


    @AfterMethod
    void afterClass() {

        softAssert.assertAll();
    }
}