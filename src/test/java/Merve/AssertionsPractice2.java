package Merve;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsPractice2 {


@Test
    public void Practice2(){

//Create a driver object to interact with the web browser.
//Maximize the browser window to ensure all elements are visible.

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

       //Navigate to the URL: 'https://demo.applitools.com/'.

        driver.get("https://demo.applitools.com/");

        String userName="admin";
        String Password="qwert";

        WebElement UserNameInput=driver.findElement(By.id("username"));
        WebElement PasswordInput=driver.findElement(By.id("password"));
        UserNameInput.sendKeys(userName);
        PasswordInput.sendKeys(Password);

    //Click Sign In Button
        WebElement SignInButton=driver.findElement(By.id("log-in"));
        SignInButton.click();

      //Verify Customer Name "Jack Gomez" is displayed after sign in

        String ExpectedCustomerName="Jack Gomez";
        String ActualCustomerName=driver.findElement(By.xpath("/html/body/div/div[3]/div[1]/div/div/div[2]/div[1]")).getText();

        Assert.assertEquals(ActualCustomerName,ExpectedCustomerName,"failed");

        driver.quit();
    }
}
