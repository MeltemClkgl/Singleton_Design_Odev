package singleton_driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SingletonDriver {


    private  static SingletonDriver sd=new SingletonDriver();

    static private WebDriver driver;//null

    private SingletonDriver(){

        ChromeOptions options=new ChromeOptions();;
        driver=WebDriverManager.chromedriver().avoidShutdownHook().capabilities(options).create();
       driver.get("https://www.aircanada.com");
       driver.close();

        System.out.println("Singleton driver object cerated.");
    }

   public static WebDriver getInstance(){

       if(driver==null)
        sd=new SingletonDriver();
        return driver ;



   }


}

