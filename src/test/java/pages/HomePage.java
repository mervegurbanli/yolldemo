package pages;

import com.github.dockerjava.core.DockerClientBuilder;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HomePage {
    private static final Logger LOGGER = LogManager.getLogger(HomePage.class);
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
        LOGGER.info("OhrmHomePage is initialized.");
    }
    @FindBy(xpath = "//a[@title = 'My Account']")
    public WebElement myAccountDropMenu;

    @FindBy(xpath = "//a[text() = 'Register']")
    public WebElement registerOption;


    @FindBy(id = "menu_admin_UserManagement")
    public WebElement userManagementSubTab;


}
