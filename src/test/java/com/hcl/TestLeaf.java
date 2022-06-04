package com.hcl;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class TestLeaf
{
    @Test(priority = 1)
    public void edit()
    {
        System.out.println("Doing edit button");

        WebDriver driver = getWebDriver();

        //sleep for 2 seconds
        sleep(1000);

        //Clicking edit button
        WebElement editButton = driver.findElement(By.cssSelector("img[alt='Edit / Text Fields']"));
        editButton.click();

        //Entering email
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("ahmedsherwani@yahoo.com");

        //Append and text
        WebElement appendText = driver.findElement(By.xpath("//div[@id='contentblock']/section[@class='innerblock']/div[2]//input[@value='Append ']"));
        appendText.clear();
        appendText.sendKeys("   Hello!");

        //Get default text entered
        WebElement defaultText = driver.findElement(By.name("username"));
        defaultText.clear();
        defaultText.sendKeys("Typing in something");

        //Clearing the text
        WebElement clearText = driver.findElement(By.cssSelector("div:nth-of-type(4) > .row > .columns.large-6.small-12 > input[name='username']"));
        clearText.clear();
        clearText.sendKeys("Cleared the text!");

        System.out.println("Cannot confirm if the edit field is disabled");

        //sleep for 2 seconds
        sleep(1000);

        //Quit WebDriver
        quit(driver);

    }

    @Test(priority = 2)
    public void button()
    {
        System.out.println("Doing button");

        //Opening the web page
        WebDriver driver = getWebDriver();

        //Clicking button
        WebElement clickButton = driver.findElement(By.linkText("Button"));
        clickButton.click();

        //Clicking button to go to homepage
        WebElement homePage = driver.findElement(By.id("home"));
        homePage.click();

        //Clicking button again(Number 2)
        WebElement clickButtonTwo = driver.findElement(By.linkText("Button"));
        clickButtonTwo.click();

        //Find position of button (x,y)
        WebElement xAndy = driver.findElement(By.id("position"));
        xAndy.click();


        //Find button color
        WebElement buttonColor = driver.findElement(By.id("position"));
        buttonColor.click();

        //Find the height and width
        WebElement heightWidth = driver.findElement(By.id("position"));

        //Sleep
        sleep(1000);

        //Quit driver
        quit(driver);

    }

    @Test(priority = 3)
    public void hyperLink()
    {
        System.out.println("Doing hyperlink");

        WebDriver driver = getWebDriver();

        //Clicking hyperlink page
        WebElement hyperLinkPage = driver.findElement(By.cssSelector("li:nth-of-type(3) > .maxheight.wp-categories-link > .wp-categories-title"));
        hyperLinkPage.click();

        sleep(3000);

        //Clicking homepage
        WebElement homePage = driver.findElement(By.linkText("Go to Home Page"));
        homePage.click();

        sleep(2000);

        driver.navigate().back();

        //Clicking "Find where am supposed to go without clicking me"
        WebElement findMe = driver.findElement(By.linkText("Find where am supposed to go without clicking me?"));
        findMe.click();

        driver.navigate().back();

        sleep(2000);

        //Verify I am broken
        WebElement verify = driver.findElement(By.linkText("Verify am I broken?"));
        verify.click();

        sleep(2000);

        driver.navigate().back();

        //Going to home page again
        WebElement homePageTwo = driver.findElement(By.cssSelector("div:nth-of-type(4) > .row > .columns.large-6.small-12 > a"));
        homePageTwo.click();

        driver.navigate().back();

        //Clicking on hidden link
        WebElement hideLink = driver.findElement(By.xpath("//div[@id='contentblock']/section[@class='innerblock']/div[5]//a[@href='#']"));
        hideLink.click();

        //Quit driver
        quit(driver);

    }

    @Test(priority = 4)
    public void images()
    {
        System.out.println("Doing image");

        WebDriver driver = getWebDriver();

        //Clicking the image link on the page
        WebElement imagePage = driver.findElement(By.cssSelector("img[alt='Images']"));
        imagePage.click();

        //Clicking the house icon
        WebElement houseIcon = driver.findElement(By.xpath("//div[@id='contentblock']/section[@class='innerblock']/div[1]//img[@src='../images/home.png']"));
        houseIcon.click();

        sleep(1000);

        driver.navigate().back();

        //Cannot do I am broken page

        sleep(1000);

        //Clicking the keyboard icon
        WebElement keyboardIcon = driver.findElement(By.xpath("//div[@id='contentblock']/section[@class='innerblock']/div[3]//img[@src='../images/keyboard.png']"));
        keyboardIcon.click();

        //Quit driver
        quit(driver);

    }

    @Test(priority = 5)
    public void dropDownMenu()
    {
        System.out.println("Doing the drop down menu");

        WebDriver driver = getWebDriver();

        //Clicking the dropdown menu icon
        WebElement dropDownIcon = driver.findElement(By.xpath("//div[@id='content']/div[1]//ul[@class='wp-categories-list']//a[@href='pages/Dropdown.html']/img[@alt='ListBox']"));
        dropDownIcon.click();

        //Selecting first box
        WebElement firstBox = driver.findElement(By.xpath("//*[@id=\"dropdown1\"]/option[2]"));
        firstBox.click();

        //Selecting second box
        WebElement secondBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/select/option[3]"));
        secondBox.click();

        //Selecting third box
        WebElement thirdBox = driver.findElement(By.xpath("//*[@id=\"dropdown3\"]/option[4]"));
        thirdBox.click();

        //Selecting fourth box
        WebElement fourthBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/select/option[5]"));
        fourthBox.click();

        //Selecting fifth box
        WebElement fifthBox = driver.findElement(By.xpath("//div[@id='contentblock']/section[@class='innerblock']/div[5]/select"));
        fifthBox.click();
        fifthBox.sendKeys("Loadrunner");
        fifthBox.click();

        //Selecting sixth box
        WebElement sixthBox = driver.findElement(By.cssSelector("div:nth-of-type(6) > select > option[value='1']"));
        sixthBox.click();

        sleep(2000);

        //Quit Driver
        driver.quit();
    }

    @Test(priority = 6)
    public void radioButton()
    {
        System.out.println("Doing the radio button");

        WebDriver driver = getWebDriver();

        //Clicking the radio button icon
        WebElement radioButtonIcon = driver.findElement(By.cssSelector("img[alt='Radio Button']"));
        radioButtonIcon.click();

        //Clicking first radio button
        WebElement firstButton = driver.findElement(By.id("yes"));
        firstButton.click();

        //Clicking second radio button
        WebElement secondButton = driver.findElement(By.cssSelector("div:nth-of-type(2) > .row > .columns.large-6.small-12 > input:nth-of-type(1)"));
        secondButton.click();

        //Clicking third radio button
        WebElement thirdButton = driver.findElement(By.xpath("//div[@id='contentblock']/section[@class='innerblock']/div[3]/div/div/input[1]"));
        thirdButton.click();

        sleep(1000);

        //Quit driver
        quit(driver);

    }

    @Test(priority = 7)
    public void checkBox()
    {
        System.out.println("Doing checkbox icon");

        WebDriver driver = getWebDriver();

        //Clicking checkbox icon
        WebElement checkBoxIcon = driver.findElement(By.cssSelector("li:nth-of-type(7) > .maxheight.wp-categories-link > .wp-categories-title"));
        checkBoxIcon.click();

        //Select the languages that I know
        WebElement javaBox = driver.findElement(By.cssSelector("div:nth-of-type(1) > input:nth-of-type(1)"));
        javaBox.click();

        WebElement sqlBox = driver.findElement(By.xpath("//div[@id='contentblock']/section[@class='innerblock']/div[1]/input[3]"));
        sqlBox.click();

        WebElement cPlusPlusBox = driver.findElement(By.cssSelector("div:nth-of-type(1) > input:nth-of-type(5)"));
        cPlusPlusBox.click();

        //Uncheck Selenium Box
        WebElement uncheckBox = driver.findElement(By.xpath("//div[@id='contentblock']/section[@class='innerblock']/div[2]/input[@type='checkbox']"));
        uncheckBox.click();

        //DeSelect only checked
        WebElement unSelect = driver.findElement(By.cssSelector("div:nth-of-type(3) > input:nth-of-type(1)"));
        unSelect.click();

        WebElement selectChecked = driver.findElement(By.xpath("//div[@id='contentblock']/section[@class='innerblock']/div[3]/input[2]"));
        selectChecked.click();

        //Select all below checkboxes
        WebElement optionOne = driver.findElement(By.cssSelector("div:nth-of-type(4) > input:nth-of-type(1)"));
        optionOne.click();

        WebElement optionFour = driver.findElement(By.xpath("//div[@id='contentblock']/section[@class='innerblock']/div[4]/input[4]"));
        optionFour.click();


        sleep(2000);

        //Quit driver
        quit(driver);
    }

    @Test(priority = 8)
    public void table()
    {
        System.out.println("Doing table");

        WebDriver driver = getWebDriver();

        //Clicking table link
        WebElement tableLink = driver.findElement(By.cssSelector("img[alt='Table']"));
        tableLink.click();

        //Check marking vital task
        WebElement learnLocators = driver.findElement(By.cssSelector("tr:nth-of-type(2) > td:nth-of-type(3) > input[name='vital']"));
        learnLocators.click();

        WebElement interactWithElementsOne = driver.findElement(By.xpath("//div[@id='contentblock']/section[@class='innerblock']//table/tbody/tr[3]//input[@name='vital']"));
        interactWithElementsOne.click();

        WebElement interactWithElementsTwo = driver.findElement(By.cssSelector("tr:nth-of-type(4) > td:nth-of-type(3) > input[name='vital']"));
        interactWithElementsTwo.click();

        WebElement interactWithElementsThree = driver.findElement(By.cssSelector("tr:nth-of-type(5) > td:nth-of-type(3) > input[name='vital']"));
        interactWithElementsThree.click();

        WebElement handleExceptions = driver.findElement(By.xpath("/html//div[@id='contentblock']/section[@class='innerblock']//table/tbody/tr[6]/td[3]/input[@name='vital']"));
        handleExceptions.click();

        sleep(2000);

        //Quit driver
        quit(driver);
    }

    @Test
    public void alert()
    {
        System.out.println("Doing alerts");

        WebDriver driver =  getWebDriver();

        //Clicking alert icon
        driver.findElement(By.cssSelector("img[alt='Alert']")).click();

        //Clicking first alert button
        WebElement alertOne = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button"));
        alertOne.click();

        sleep(3000);

        String message = driver.switchTo().alert().getText();

        System.out.println(message);

        driver.switchTo().alert().accept();

        //Doing the second alert box
        WebElement confirmBox = driver.findElement(By.xpath("//div[@id='contentblock']/section[@class='innerblock']/div[2]//button[.='Confirm Box']"));
        confirmBox.click();

        sleep(2000);

        driver.switchTo().alert().dismiss();

        //Doing the third alert box to enter inside the text box
        WebElement promptBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
        promptBox.click();

        driver.switchTo().alert().sendKeys("Hello");
        driver.switchTo().alert().accept();

        sleep(3000);

        //Quit driver
        quit(driver);
    }

    @Test
    public void frame()
    {
        System.out.println("Doing frames");

        WebDriver driver = getWebDriver();

        //Clicking the frame page
        driver.findElement(By.cssSelector("img[alt='Frame']")).click();

        //Clicking the first one
        driver.switchTo().frame(0);
        driver.findElement(By.id("Click")).click();
        driver.switchTo().defaultContent();// This for exiting the frame

        sleep(5000);

        //Nested frame
       WebElement ele = driver.findElement(By.xpath("//iframe[@src=\"page.html\"]"));

       driver.switchTo().frame(ele);
       driver.switchTo().frame("frame2");
       driver.findElement(By.id("Click1")).click();

       sleep(5);

        //Quit driver
        quit(driver);
    }

    @Test
    public void window()
    {
        System.out.println("Doing window");

        WebDriver driver = getWebDriver();

        //Clicking the window page
        driver.findElement(By.cssSelector("img[alt='Windows']")).click();

        //Open Home Page
        System.out.println(driver.getTitle());

        driver.findElement(By.id("home")).click();

      Set<String> windowHandle = driver.getWindowHandles();

        Iterator<String> iterator = windowHandle.iterator();

       String w1 = iterator.next();

       String w2 = iterator.next();

       driver.switchTo().window(w2);
       System.out.println(driver.getTitle());

       sleep(3);

       //If you want to switch  back to the first window do   driver.switchTo().window(w1);

       //Quit Driver
        quit(driver);

       System.out.println(w1);
       System.out.println(w2);
    }

    @Test
    public void calendar()
    {
        System.out.println("Doing calender");

        WebDriver driver = getWebDriver();

        //Clicking calender page
        driver.findElement(By.cssSelector("img[alt='Calendar']")).click();

        //Putting in date for calendar
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("document.getElementById('datepicker').value = '25/05/2022' ");

        sleep(3000);

        //Quit driver
        quit(driver);
    }

    @Test
    public void draggable()
    {
        System.out.println("Doing draggable");

        WebDriver driver = getWebDriver();

        //Clicking the draggable page
        driver.findElement(By.cssSelector("img[alt='Draggable']")).click();

        //Playing with draggable
       WebElement ele = driver.findElement(By.id("draggable"));

        Actions act = new Actions(driver);

        act.dragAndDropBy(ele,250,350).build().perform(); // You need to use a build and perform for the action class

        sleep(3000);

        //Quit driver
        quit(driver);
    }

    @Test
    public void droppable()
    {
        System.out.println("Doing droppable");

        WebDriver driver = getWebDriver();

        //Clicking droppable page
        driver.findElement(By.cssSelector("img[alt='drop']")).click();

        //Play with droppable
        WebElement ele = driver.findElement(By.id("draggable"));
        WebElement ele1 = driver.findElement(By.id("droppable"));

        Actions act = new Actions(driver);

        act.dragAndDrop(ele,ele1).build().perform();// You need to use a build and perform for the action class

        sleep(4000);

        //Quit driver
        quit(driver);
    }



    private void quit(WebDriver driver) {
        //Close browser
        driver.quit();
    }

    private WebDriver getWebDriver() {
        
        //Create driver
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe" );
        WebDriver driver = new ChromeDriver();

        //Maximize browser window

        driver.manage().window().maximize();

        //Open Test page
        String url = "http://leafground.com/";
        driver.get(url);

        System.out.println("Page is open.");
        return driver;
    }

    private void sleep(long m)
    {
        try {
            Thread.sleep(m);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
