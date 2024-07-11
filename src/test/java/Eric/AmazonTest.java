//package Eric;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Wait;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import java.time.Duration;
//import java.util.List;
//
//public class AmazonTest {
//    @Test
//    public void amazonTest()
//    {
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.amazon.com");
//        driver.manage().window().maximize();
//        Wait<WebDriver> wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class = 'navFooterLinkCol navAccessibility']//ul//li")));
//        List<WebElement> footerElements = driver.findElements(By.xpath("//div[@class = 'navFooterLinkCol navAccessibility']//ul//li"));
//        int elementCounter = 0;
//        for(WebElement eachElement: footerElements)
//        {
//            System.out.println(eachElement.getText());
//            Assert.assertEquals(eachElement.getText(), AmazonData.amazonData[elementCounter], "The element text verification has failed!");
//            elementCounter++;
//        }
//
//        driver.quit();
//    }
//}
