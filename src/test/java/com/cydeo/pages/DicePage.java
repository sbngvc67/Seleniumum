package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DicePage {

    public DicePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "typeaheadInput")
    public WebElement keywordBox;

    @FindBy(id = "google-location-search")
    public WebElement zipCodeBox;

    @FindBy(xpath = "//*[@id=\"cmpwelcomebtnyes\"]/a")
    public WebElement accept;



}
