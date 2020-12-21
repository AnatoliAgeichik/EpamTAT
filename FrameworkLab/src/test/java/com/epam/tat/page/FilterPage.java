package com.epam.tat.page;

import com.epam.tat.wait.CustomWait;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class FilterPage extends AbstractPage {

    private final Logger logger = LogManager.getRootLogger();
    private final String BASE_URL = "https://shop.by/velosipedy/";


    @FindBy(xpath = "//label[@data-ga=\"Stels\"]")
    private WebElement labelStels;
    //private By labelSteels=new By.ByXPath("//label[@data-ga=\"Stels\"]");

    @FindBy(xpath = "//label[@data-ga=\"Горный\"]")
    private WebElement labelMountainType;

    //private By labelMountainType=new By.ByXPath("//label[@data-ga=\\\"Горный\\\"]");

    @FindBy(xpath = "//label[@data-ga=\"Женский\"]")
    private WebElement labelWomenType;
    //private By labelWomenType=new By.ByXPath("//label[@data-ga=\\\"Женский\\\"]");
    @FindBy(xpath = "//label[@data-ga=\"Сталь\"]")
    private WebElement labelSteelMaterial;
    //private By labelSteelMaterial=new By.ByXPath("//label[@data-ga=\"Сталь\"]");

    @FindBy(xpath = "//label[@data-ga=\"Двухкоронная\"]")
    private WebElement labelTwoSided;

    //private By labelTwoSided=new By.ByXPath("//label[@data-ga=\"Двухкоронная\"]");


    @FindBy(xpath = "//span[@class=\"ModelFilter__TxtBtnFormBlock\"]")
    private WebElement resultButton;

    //private By resultButton=new By.ByXPath("//span[@class=\"ModelFilter__TxtBtnFormBlock\"]");



    public FilterPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public FilterPage setSteelModel(){
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        labelStels.click();
        return this;
    }
    public FilterPage setWomenType(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()",labelWomenType);
        return this;
    }
    public FilterPage setSteelMaterial(){
        //driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()",labelSteelMaterial);
        return this;
    }
    public FilterPage setTwoSides(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()",labelTwoSided);
        return this;
    }

    public FilterPage appledFilter(){
        CustomWait.waitForPageLoaded(driver);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()",resultButton);
        CustomWait.waitForPageLoaded(driver);
        return this;
    }

    public Boolean isProductOnPage(String dataModel){

        By productLocator = By.xpath("//a[@data-model='"+dataModel+"']");
        try{
            new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                    .until(ExpectedConditions.presenceOfElementLocated(productLocator));
        }catch (TimeoutException e){
            logger.info("Product not found");
            return false;
        }
        return true;
    }

    @Override
    public FilterPage openPage() {
        driver.navigate().to(BASE_URL);
        logger.info("Filter page opened");
        CustomWait.waitForPageLoaded(driver);
        return this;
    }
    private WebElement getClickableElement(By element){
        return new WebDriverWait(driver,WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.elementToBeClickable(element));
    }
    private WebElement getPresentElement(By element){
        return new WebDriverWait(driver,WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.presenceOfElementLocated(element));
    }


}
