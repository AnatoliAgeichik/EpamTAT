package com.epam.tat.test;

import com.epam.tat.page.ListProductPage;
import com.epam.tat.util.IntegerUtil;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SortItemPageTest extends CommonCondition {

    @Test
    public void sortMinPriceTest(){

        List<WebElement> productsPrice= new ListProductPage(driver,"https://shop.by/telefony_mobilnye/").openPage()
                .sortCheapPrice()
                .getProductsPrice();

        boolean flag=true;

        for (int i=1;i<productsPrice.size();++i){
            System.out.println(productsPrice.get(i).getText());

            if(IntegerUtil.parsePrice(productsPrice.get(i).getText()) < IntegerUtil.parsePrice(productsPrice.get(i - 1).getText())){
                flag=false;
            }
        }
        Assert.assertTrue(flag);
    }

    @Test
    public void sortMaxPriceTest(){

        List<WebElement> productsPrice= new ListProductPage(driver,"https://shop.by/telefony_mobilnye/").openPage()
                .sortExpencivePrice()
                .getProductsPrice();

        boolean flag=true;

        for (int i=1;i<productsPrice.size();++i){
            System.out.println(productsPrice.get(i).getText());

            if(IntegerUtil.parsePrice(productsPrice.get(i).getText()) > IntegerUtil.parsePrice(productsPrice.get(i - 1).getText())){
                flag=false;
            }
        }
        Assert.assertTrue(flag);
    }
    @Test
    public void sortMaxSaleTest(){

        List<WebElement> productsPrice= new ListProductPage(driver,"https://shop.by/telefony_mobilnye/").openPage()
                .sortSale()
                .getProductsSale();

        boolean flag=true;

        for (int i=1;i<productsPrice.size();++i){
            System.out.println(productsPrice.get(i).getText());
            if(productsPrice.get(i).getText().equals("")){
                i++;
                continue;
            }

            if(IntegerUtil.parsePrice(productsPrice.get(i).getText()) > IntegerUtil.parsePrice(productsPrice.get(i - 1).getText())){
                flag=false;
            }
        }
        Assert.assertTrue(flag);
    }
}
