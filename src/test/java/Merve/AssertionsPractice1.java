package Merve;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsPractice1 {

@Test
    public void Practice1(){

//    Initialize WebDriver
//    Maximize the browser window to ensure all elements are visible.

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Navigate to the URL: 'https://magento.softwaretestingboard.com/'.

        driver.get("https://magento.softwaretestingboard.com/");
        String actualTitle= driver.getTitle();
        String ExpectedTitle="Home Page";

         //Verify the Title of Page is “Home Page”
    Assert.assertEquals(actualTitle,ExpectedTitle);

    //  Verify the 'Shop New Yoga' Button is Displayed on the Main Banner
        boolean isDisplayedShopNewYogaButton=driver.findElement(By.xpath("//*[text()='Shop New Yoga']")).isDisplayed();
        Assert.assertTrue(isDisplayedShopNewYogaButton,"Button is not displayed!!!");

    //Click on 'Sale' Tab
    WebElement SaleTab= driver.findElement(By.xpath("//*[text()='Sale']"));
    SaleTab.click();

    //Verify 'Shop Women’s Deals' Button is Displayed

    boolean isDisplayedShopWomensDealsButton=driver.findElement(By.xpath("//*[text()='Shop Women’s Deals']")).isDisplayed();
    Assert.assertTrue(isDisplayedShopWomensDealsButton,"Button is not displayed!!");


//   Close the browser to end the session.
    driver.quit();
    }

}





