package Gunay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestNGAssertion1 {

    public static void main(String[] args) throws InterruptedException {

//          1.      Verify the Title of Page is “Home Page”
//        2.Verify the 'Shop New Yoga' Button is Displayed on the Main Banner
//       3. Click on 'Sale' Tab
//        4.Verify 'Shop Women’s Deals' Button is Displayed


//        Conclude Testing:
//        Close the browser to end the session.
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://magento.softwaretestingboard.com/");
     // 1.
        String pageTitle=driver.getTitle();
        Thread.sleep(2000);
       // Assert.assertEquals(pageTitle,"Home Page");
        Assert.assertTrue(pageTitle.equals("Home Page"),"true");

        //2
        WebElement element1= driver.findElement(By.xpath("//span[@class=\"action more button\"]"));
        Assert.assertTrue( element1.isDisplayed(),"false");

      //  3.
        WebElement element2= driver.findElement(By.xpath("//*[@id=\"ui-id-8\"]"));
      element2.click();

      //4
        WebElement element3 = driver.findElement(By.xpath("//span[text()=\"Shop Women’s Deals\"]"));
       boolean element3IsDisplayed= element3.isDisplayed();
        Assert.assertTrue(element3IsDisplayed,"true");

     driver.quit();

    }
}
