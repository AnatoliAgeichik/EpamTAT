package com.epam.tat.page;

import com.epam.tat.wait.CustomWait;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CartPage extends AbstractPage {
    private final Logger logger = LogManager.getRootLogger();
    private final String BASE_URL = "https://shop.by/cart/";

    @FindBy(xpath = "//a[@class=\"ShopItemList__AddToCart Page__ActiveButtonBg order-button\"]")
    private WebElement orderPageButton;

    public CartPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public List<WebElement> getProductsInCart(){
        return driver.findElements(By.xpath("//div[@class=\"ModelList__NameBlock\"]"));
    }

    public OrderPage openOrderPage(){
        orderPageButton.click();
        CustomWait.waitForPageLoaded(driver);
        return new OrderPage(driver);
    }

    @Override
    protected AbstractPage openPage() {
        return null;
    }
}
