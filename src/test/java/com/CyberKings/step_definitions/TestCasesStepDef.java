package com.CyberKings.step_definitions;

import com.CyberKings.pages.KicchiPage;
import com.CyberKings.utilities.BrowserUtils;
import com.CyberKings.utilities.ConfigurationReader;
import com.CyberKings.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TestCasesStepDef {
    KicchiPage kicchiPage = new KicchiPage();

    @Given("Go to url")
    public void go_to_url() {
        Driver.get().get(ConfigurationReader.get("url"));
        BrowserUtils.waitFor(2);
    }
    @When("Click on Generate Random Number button")
    public void click_on_generate_random_number_button() {
        kicchiPage.generateRandomNumber.click();
    }
    @Then("Verify that the number is a random")
    public void verify_that_the_number_is_a_random() {
        String firstNum = kicchiPage.generatedNumber.getText();
        kicchiPage.generateRandomNumber.click();
        String secondNum = kicchiPage.generatedNumber.getText();
        Assert.assertNotEquals("Not randomly",firstNum,secondNum);
    }
    @Then("Verify that the number is a three digit")
    public void verify_that_the_number_is_a_three_digit() {
        Assert.assertEquals("It is not three digit",3,kicchiPage.generatedNumber.getText().length());
    }
    @Then("Verify that the number is a positive number")
    public void verify_that_the_number_is_a_positive_number() {
        String positive = kicchiPage.generatedNumber.getText();
        int i = Integer.parseInt(positive);
        Assert.assertTrue("It is not positive",i>0);
    }

    @Then("Type the generated number into the textbox below the number")
    public void type_the_generated_number_into_the_textbox_below_the_number() {
        kicchiPage.textBox.sendKeys(kicchiPage.generatedNumber.getText());
    }
    @Then("Click on the Verify number button")
    public void click_on_the_verify_number_button() {
        kicchiPage.verifyNumber.click();
    }
    @Then("Verify that a green check image is displayed")
    public void verify_that_a_green_check_image_is_displayed() {
        Assert.assertTrue("It is not success",kicchiPage.greenImg.isDisplayed());
    }
    @Then("Type a different number from the generated number into the text box below the number")
    public void type_a_different_number_from_the_generated_number_into_the_text_box_below_the_number() {
        String generatedNum = kicchiPage.generatedNumber.getText();
        int a = Integer.parseInt(generatedNum);
        a = a+1;
        String str = String.valueOf(a);
        kicchiPage.textBox.sendKeys(str);
    }
    @Then("Verify that a red cross image is displayed")
    public void verify_that_a_red_cross_image_is_displayed() {
        Assert.assertTrue("It is not failure",kicchiPage.redImg.isDisplayed());
    }
}
