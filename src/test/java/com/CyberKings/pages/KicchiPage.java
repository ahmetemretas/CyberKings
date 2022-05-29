package com.CyberKings.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KicchiPage extends BasePage {

    @FindBy(xpath = "//*[@value='Generate random number']")
    public WebElement generateRandomNumber;

    @FindBy(id = "btnVerifyNumber")
    public WebElement verifyNumber;

    @FindBy(xpath = "//*[@name='verifyText']")
    public WebElement textBox;

    @FindBy(xpath = "(//p)[1]")
    public WebElement generatedNumber;

    @FindBy(xpath = "//img[@src='cyberKingsImages/success.png']")
    public WebElement greenImg;

    @FindBy(xpath = "//img[@src='cyberKingsImages/failure.png']")
    public WebElement redImg;


}
