package com.epam.tat.page;

import com.epam.tat.model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MainPage extends AbstractPage {
    private final String BASE_URL = "https://shop.by//";

    //@FindBy(id = "Header__Authentication")
    private final By  signInFormButton =By.id("Header__Authentication");



    @FindBy(id = "email-tab")
    private WebElement linkEmailSignIn;

    //@FindBy(id = "LLoginForm_phone")
    private final By  inputPhone=By.id("LLoginForm_phone");

    //@FindBy(id = "LLoginForm_password")
    private final By inputPassword=By.id("LLoginForm_password");

    //@FindBy(xpath = "/html/body/div[9]/div[2]/div/div[2]/form/div[1]/input")
    private final By signInButton=By.xpath("//*[@class=\"Page__ActiveButtonBg Header__ButtonLogIn\"]");

    private final By divName=By.className("menu-name");

    private final Logger logger = LogManager.getRootLogger();
    public MainPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public List<WebElement> getProductOnViewed(){
        return driver.findElements(By.xpath("//*[@id=\"UserSession__CarouselUserSession\"]//div[@class=\"owl-item\"]//span[@itemprop=\"name\"]"));
    }

    public MainPage openSignInWindow(){
        //try {
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
            getSignInFormButton().click();
            logger.info("click");
            //getSignInFormButton().click();

//            new WebDriverWait(driver,WAIT_TIMEOUT_SECONDS)
//                    .until(ExpectedConditions.attributeToBe(By.xpath("/html/body/div[9]"),"display","flex"));
//        }catch (TimeoutException exp){
//            logger.info("exception");
//            getSignInFormButton().click();
//
//        }
        //getSignInFormButton().click();
        //getSignInFormButton().click();
        //linkEmailSignIn.click();
        return this;
    }
    public MainPage signIn(User user)
    {
        getClickableElement(inputPhone).sendKeys(user.getPhone());
        //getPhoneInput().sendKeys(user.getPhone());
        //getPasswordInput().sendKeys(user.getPassword());
        getClickableElement(inputPassword).sendKeys(user.getPassword());
        getClickableElement(signInButton).click();
        //getInputBtn().click();
        logger.info("signIn performed");
        return new MainPage(driver);
    }
    @Override
    public MainPage openPage() {
        driver.navigate().to(BASE_URL);
        return this;
    }



    private WebElement getClickableElement(By element){
        return new WebDriverWait(driver,WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.elementToBeClickable(element));
    }

    public String getUserName(){
        WebElement name=new WebDriverWait(driver,WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.presenceOfElementLocated(divName));
        return name.getText();
    }
    public WebElement getSignInFormButton(){
        return new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.elementToBeClickable(signInFormButton));
    }
}
