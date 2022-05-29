package com.CyberKings.pages;

import com.CyberKings.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){PageFactory.initElements(Driver.get(),this);}

}
