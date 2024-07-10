package Gunay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestNGAssertion2 {
    public static void main(String[] args) {

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.applitools.com/");

//                Enter Username 'admin'
        WebElement element= driver.findElement(By.cssSelector("#username"));
                 element.sendKeys("admin");
//        Enter Password 'qwerty'
        WebElement element1= driver.findElement(By.cssSelector("#password"));
        element1.sendKeys("qwerty");
//        Click Sign In Button
        WebElement element2= driver.findElement(By.cssSelector("#log-in"));
        element2.click();
//        Verify Customer Name "Jack Gomez" is displayed after sign in
         WebElement element3= driver.findElement(By.xpath("//div[@class=\"logged-user-name\"]"));
         String actualText=element3.getText();
         String expectedText="Jack Gomez";
         Assert.assertEquals(actualText,expectedText);
//        Close the browser to end the session.
        driver.quit();

    }
}
