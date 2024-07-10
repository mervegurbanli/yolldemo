package pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RegisterPage {
    private static final Logger LOGGER = LogManager.getLogger(RegisterPage.class);
    public RegisterPage(){
      //  PageFactory.initElements(Driver.getInstance().getDriver(), this);
        LOGGER.info("OhrmHomePage is initialized.");
    }
    @FindBy(xpath = "")
    public WebElement welcomeMessage;

    @FindBy(xpath = "//div[@class='menu']//b")
    public List<WebElement> tabs;

    @FindBy(id  = "menu_pim_viewPimModule")
    public WebElement pimTab;

    @FindBy(id = "menu_admin_UserManagement")
    public WebElement userManagementSubTab;
}
