package objre;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Ele {

    public WebElement drag(WebDriver driver)
    {

       WebElement drag = driver.findElement(By.id("draggable"));
       return drag;
    }

    public WebElement drop(WebDriver driver)
    {
       WebElement drop = driver.findElement(By.id("droppable"));
       return drop;
    }
}
