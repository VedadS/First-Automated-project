package TestCTShop;

import BaseCTShop.BaseTestCTShop;
import PageCTShop.PageTestCTShop;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FailedRegistrationWithNoName extends BaseTestCTShop {

    PageTestCTShop pageTestCTShop;
    Random random = new Random();
    String testIme = "123" + random.nextInt(9999999);
    String testPrezime = "asdfgh" + random.nextInt(9999);
    String testEmail = testIme + "@111hds.nnsdr";
    String testFirma = testIme + random.nextInt(999);
    String testPib = String.valueOf(100000000 + random.nextInt(999999999));
    String testPassword = testIme;
    String testConfirmation = testIme;

    @Before
    public void setUpTest(){

        pageTestCTShop = new PageTestCTShop();

    }

    @Test
    public void failedRegistrationWithNoName(){
        pageTestCTShop

                .sendKeysprezimeInputField(testPrezime)
                .sendKeysemailInputField(testEmail)
                .selectDropDownDa()
                .sendKeysFirmaInputField(testFirma)
                .sendKeysPibInputField(testPib)
                .sendKeysPasswordInputField(testPassword)
                .sendKeysPasswordConfirmationInputField(testConfirmation)
                .clickButtonField();
        //assertTrue(pageTestCTShop.successfulRegistrationMessageIsDisplayed());
       // assertEquals("Hvala na registraciji. Molimo proverite email i aktivirajte Vaš nalog.",pageTestCTShop.successfulRegistrationMessageGetText());

    }
}

