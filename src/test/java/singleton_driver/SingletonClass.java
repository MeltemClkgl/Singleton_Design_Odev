package singleton_driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class SingletonClass {

    static private WebDriver driver;
    static private SingletonClass singletonClass;

    private SingletonClass()
    {
        EdgeOptions options=new EdgeOptions();
        options.addArguments("--start-maximized");
        driver= WebDriverManager.edgedriver().avoidShutdownHook().capabilities(options).create();
        driver.get("https://www.google.com");
    }
    public static SingletonClass getSingletonClass(){
        if(singletonClass==null){
            singletonClass=new SingletonClass();
        }
       return singletonClass;
    }
    static public WebDriver getDriver(){
        return driver;
    }


}

