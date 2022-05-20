package TestCTShop;

import BaseCTShop.BaseTestCTShop;
import PageCTShop.PageTestCTShop;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.interactions.Action;

import java.util.Random;

public class SuccesfullregistrationCTShopTest extends BaseTestCTShop {

    PageTestCTShop pageTestCTShop;
    Random random = new Random();
    String testIme = "oprst" + random.nextInt(9999);
    String testPrezime = "asdfgh" + random.nextInt(9999);
    String testEmail = testIme + "@hds.sdr";
    String testFirma = testIme + random.nextInt(999);
    String testPib = String.valueOf(100000000 + random.nextInt(999999999));
    String testPassword = testIme;
    String testConfirmation = testIme;


    @Before
    public void setUpTest(){

        pageTestCTShop = new PageTestCTShop();

    }

    @Test
    public void succesfullRegistrationTest(){
        pageTestCTShop
                .sendKeysImeInputField(testIme)
               // .clickNewsLetterCheckbox()
                .sendKeysprezimeInputField(testPrezime)
                .sendKeysemailInputField(testEmail)
                .selectDropDownDa()
                .sendKeysFirmaInputField(testFirma)
                .sendKeysPibInputField(testPib)
                .sendKeysPasswordInputField(testPassword)
                .sendKeysPasswordConfirmationInputField(testConfirmation)
                .clickButtonField();
        assertTrue(pageTestCTShop.successfulRegistrationMessageIsDisplayed());
        assertEquals("Hvala na registraciji. Molimo proverite email i aktivirajte Vaš nalog.",pageTestCTShop.successfulRegistrationMessageGetText());

    }
}
