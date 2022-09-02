package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _01_LoginSteps {
    DialogContent dc=new DialogContent();


    @Given("Navigate to basqar")
    public void navigateToBasqar() {
        GWD.getDriver().get(" https://magento.softwaretestingboard.com/");
        GWD.getDriver().manage().window().maximize();
    }

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        dc.findAndClick("signIN");
        dc.findAndSend("username","group17@gmail.com");
        dc.findAndSend("password","123456Group");
        dc.findAndClick("button1");
    }

    @Then("User should login successfuly")
    public void userShouldLoginSuccessfuly() {
        dc.findAndContainsText("successMessage","thank");



    }
}
