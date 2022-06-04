package func;

import objre.Ele;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Act1
{
    Ele obj = new Ele();

    @Test
    public void f()
    {
        //Create driver
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe" );
        WebDriver driver = new ChromeDriver();

        //Maximize browser window

        driver.manage().window().maximize();

        //Open Test page
        String url = "http://leafground.com/pages/drop.html";
        driver.get(url);

        System.out.println("Page is open.");

        Actions act = new Actions(driver);

         act.dragAndDrop(obj.drag(driver), obj.drop(driver)).build().perform();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //Quit driver
        driver.quit();
    }
}
