import org.junit.Assert;
import org.openqa.selenium.By;

public class RegistrationSuccessMessagepage extends Utils {

    LoadProp loadProp = new LoadProp();


    By _RegisterSuccessPage = By.xpath("//div[@class=\"result\"]");




    public void usercanSeeRegisterSuccessMessage()
    {
        getTextFromElement(_RegisterSuccessPage );
    }

   public void verifyUserSeeRegistrationSuccessMessage(By actual ,String expected) {

       Assert.assertEquals("Your registration completed","Registration success page");
    }


}
