package PageCTShop;

import BaseCTShop.BaseTestCTShop;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class PageTestCTShop extends BaseTestCTShop {

    public PageTestCTShop(){

        PageFactory.initElements(driver,this);

    }

    @FindBy(id = "firstname")
    WebElement imeInputField;
    @FindBy(id = "is_subscribed")
    WebElement newsLetterCheckbox;
    @FindBy(id = "lastname")
    WebElement prezimeInputField;
    @FindBy(id = "email_address")
    WebElement emailInputField;
    @FindBy(id = "pravnolice")
    WebElement selectDropDown;
    @FindBy(id = "password")
    WebElement passwordInputField;
    @FindBy(id = "confirmation")
    WebElement passwordConfirmationInputField;
    @FindBy(css = ".button.btn.btn-primary.btn-continue.pull-right.btn-lg")
    WebElement ButtonField;

    @FindBy(className = "ub-emb-close")
    WebElement bannerField;
    @FindBy(id = "firma")
    WebElement firmaInputField;
    @FindBy(id = "pib")
    WebElement pibInputField;
    @FindBy(css = ".alert.alert-success")
    WebElement successfulRegistrationMessage;

    public PageTestCTShop sendKeysImeInputField(String testIme){
        wdWait.until(ExpectedConditions.visibilityOf(imeInputField));
        imeInputField.clear();
        imeInputField.sendKeys(testIme);
        return this;
    }

    public PageTestCTShop clickNewsLetterCheckbox(){
        wdWait.until(ExpectedConditions.visibilityOf(newsLetterCheckbox));
        if (newsLetterCheckbox.isSelected()){
            newsLetterCheckbox.click();

        }
        return this;
    }
    public PageTestCTShop sendKeysprezimeInputField(String testPrezime){
        wdWait.until(ExpectedConditions.visibilityOf(prezimeInputField));
        prezimeInputField.clear();
        prezimeInputField.sendKeys(testPrezime);
        return this;
    }
    public PageTestCTShop sendKeysemailInputField(String testEmail){
        wdWait.until(ExpectedConditions.visibilityOf(emailInputField));
        emailInputField.clear();
        emailInputField.sendKeys(testEmail);
        return this;
    }
    public PageTestCTShop selectDropDownDa(){
        Select pravnoLice = new Select(selectDropDown);
        wdWait.until(ExpectedConditions.visibilityOf(selectDropDown));
        pravnoLice.selectByVisibleText("Da");
        return this;
    }
    public PageTestCTShop sendKeysPasswordInputField(String testPassword){
        wdWait.until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.clear();
        passwordInputField.sendKeys(testPassword);
        return this;
    }
    public PageTestCTShop sendKeysPasswordConfirmationInputField(String testConfirmation){
        wdWait.until(ExpectedConditions.visibilityOf(passwordConfirmationInputField));
        passwordConfirmationInputField.clear();
        passwordConfirmationInputField.sendKeys(testConfirmation);
        return this;
    }
    public PageTestCTShop clickButtonField(){
        wdWait.until(ExpectedConditions.elementToBeClickable(ButtonField));
        ButtonField.click();
        return this;
    }
    public void clickBannerField(){
        wdWait.until(ExpectedConditions.elementToBeClickable(bannerField));
        bannerField.click();
    }
    public PageTestCTShop sendKeysFirmaInputField(String testFirma){
        wdWait.until(ExpectedConditions.visibilityOf(firmaInputField));
        firmaInputField.clear();
        firmaInputField.sendKeys(testFirma);
        return this;
    }
    public PageTestCTShop sendKeysPibInputField(String testPib){
        wdWait.until(ExpectedConditions.visibilityOf(pibInputField));
        pibInputField.clear();
        pibInputField.sendKeys(testPib);
        return this;
    }

    public boolean successfulRegistrationMessageIsDisplayed() {
        wdWait.until(ExpectedConditions.visibilityOf(successfulRegistrationMessage));
        return successfulRegistrationMessage.isDisplayed();
    }

    public String successfulRegistrationMessageGetText() {
        wdWait.until(ExpectedConditions.visibilityOf(successfulRegistrationMessage));
        return successfulRegistrationMessage.getText();
    }
}
