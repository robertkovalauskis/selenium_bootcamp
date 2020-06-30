package classTests.day1.activities;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObject.day1.ChapterOnePage;

public class Activity2 {
    WebDriver driver;

    @Before
    public void setDriver() {
        String userdirLib =  System.getProperty("user.dir") + "\\lib\\";
        System.setProperty("webdriver.chrome.driver", userdirLib + "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://book.theautomatedtester.co.uk/");
    }


    @Test
    public void practiceWithWebElement() {

        ChapterOnePage homePage = new ChapterOnePage(driver);
        homePage.setTextBox("Hello World!");


        //find element "Chapter 1" and  click on it
        WebElement chapter1 = driver.findElement(By.xpath("//a[contains(text(), 'Chapter1')]"));
        chapter1.click();

        // clear text from text box
        WebElement textBox = driver.findElement(By.cssSelector("[id='html5div']"));
        textBox.clear();

        //  and send text to same text box
        textBox.sendKeys("Test123");

        //from element "Click this link to launch another window" print out text
        WebElement text = driver.findElement(By.xpath("//div[@class='mainbody']"));
        System.out.println(text.getText());

        //from "Verify button" get attribute ( any you like) and print out
        driver.findElement(By.id("verifybutton")).getAttribute("value");

        //from header " Selenium: Beginners Guide" get cssValue color also print out it
        driver.findElement(By.className("mainheading")).getCssValue("color");
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }

}
