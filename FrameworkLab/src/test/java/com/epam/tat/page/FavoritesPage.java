package com.epam.tat.page;

import com.epam.tat.wait.CustomWait;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class FavoritesPage extends AbstractPage {
    private final Logger logger = LogManager.getRootLogger();
    private final String BASE_URL = "https://shop.by/management/bookmarks/";


    private By productLocator;
    private List<WebElement> productList;

    @FindBy(xpath = "//div[@class=\"delete-button\"]")
    private WebElement deleteButton;


    protected FavoritesPage(WebDriver driver) {
        super(driver);
    }

    public FavoritesPage deleteProduct(){
        deleteButton.click();
        CustomWait.waitForPageLoaded(driver);
        return this;
    }

    public Boolean isProductOnPage(String name){
        productList=  driver.findElements(By.id("favourites-content"));
        name="Смартфон Apple iPhone 11 64Gb Black";

        productLocator = By.xpath("//*[text()='"+name+"']");
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
    public FavoritesPage openPage() {
        driver.navigate().to(BASE_URL);
        logger.info("Favorites page opened");
        CustomWait.waitForPageLoaded(driver);
        return this;
    }

}