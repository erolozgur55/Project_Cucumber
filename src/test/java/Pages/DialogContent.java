package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent{

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(linkText="//*[text()='Sign In']")
    private WebElement signIN;

    @FindBy(id="[id='email']")
    private WebElement email;

    @FindBy(name="[name='login[password]']")
    private WebElement password;

    @FindBy(xpath="(///button[@class='action login primary']")
    private WebElement button1;
    @FindBy(xpath="//*[text()='Welcome, group17 techno!']")
    private WebElement successMessage;


    WebElement myElement;
    public void findAndSend(String strElement, String value){
        switch (strElement)
        {

            case "email" : myElement =email; break;
            case "password" : myElement =password; break;


        }

        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement){
        switch (strElement)
        {

            case "signIN" : myElement =signIN; break;
            case "button1" : myElement =button1; break;


        }

        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
               case "successMessage" : myElement =successMessage; break;
        }

        verifyContainsText(myElement,text);
    }


}
