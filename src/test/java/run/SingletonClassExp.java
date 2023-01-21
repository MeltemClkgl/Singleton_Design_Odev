package run;

import singleton_driver.SingletonClass;

public class SingletonClassExp {
    public static void main(String[] args) throws InterruptedException {

     SingletonClass.getDriver().get(Constants.URL);
     Thread.sleep(1000);
     SingletonClass.closeDriver();

    }
}
