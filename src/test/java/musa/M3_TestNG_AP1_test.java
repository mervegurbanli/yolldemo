package musa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class M3_TestNG_AP1_test {

    @Test
    public void test(){
//        Initialize WebDriver:
//        Optimize Window for Testing:
//        Navigate to the URL: 'https://magento.softwaretestingboard.com/'.
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://magento.softwaretestingboard.com/");

//        Verify the Title of Page is “Home Page”
        String expectedPageTitle = "Home Page";
        String actualPageTitle = driver.getTitle();
        Assert.assertEquals(expectedPageTitle, actualPageTitle);

//        Verify the 'Shop New Yoga' Button is Displayed on the Main Banner
        WebElement shopNewYogaButton = driver.findElement(By.xpath("//*[@class='action more button']"));
        Assert.assertTrue(shopNewYogaButton.isDisplayed());

//        Click on 'Sale' Tab
        WebElement saleTab = driver.findElement(By.id("ui-id-8"));
        saleTab.click();

//        Verify 'Shop Women’s Deals' Button is Displayed
        WebElement shopWomenDealsButton = driver.findElement(By.xpath("//*[@class='more button']"));
        Assert.assertTrue(shopWomenDealsButton.isDisplayed());

//        Conclude Testing:
        driver.quit();

    }
}
