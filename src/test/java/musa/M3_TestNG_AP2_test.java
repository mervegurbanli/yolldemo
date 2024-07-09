package musa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class M3_TestNG_AP2_test {

    @Test
    public void test() {

//        Initialize WebDriver:
//        Optimize Window for Testing:
//        Navigate to the URL: 'https://demo.applitools.com/'.
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.applitools.com/");

//        Enter Username 'admin'
//        Enter Password 'qwerty'
        WebElement usernameBox = driver.findElement(By.id("username"));
        WebElement passwordBox = driver.findElement(By.id("password"));
        usernameBox.sendKeys("admin");
        passwordBox.sendKeys("qwerty");

//        Click Sign In Button
        WebElement signInButton = driver.findElement(By.id("log-in"));
        signInButton.click();

//        Verify Customer Name "Jack Gomez" is displayed after sign in
        String actualCustomerName = driver.findElement(By.xpath("//div[@class='logged-user-name']")).getText();
        String expectedCustomerName = "Jack Gomez";
        Assert.assertEquals(expectedCustomerName, actualCustomerName);

//      Conclude Testing:
        driver.quit();
    }
}
