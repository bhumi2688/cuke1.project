import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.Random;

import static javafx.scene.input.DataFormat.URL;

public class Registrationpage extends Utils {

    LoadProp loadprop = new LoadProp();

    By _female = By.xpath("//input[@id =\"gender-female\"]");
    By _firstname = By.xpath("//input[@id=\"FirstName\"]");
    By _lastname = By.xpath("//input[@id=\"LastName\"]");
    By _email = By.xpath("//*[@id=\"Email\"]");
    //By _email = By.xpath("//input[@id=\"Email\"]");
    By _password = By.xpath("//input[@id=\"Password\"]");
    By _confirmpassword = By.xpath("//input[@id=\"ConfirmPassword\"]");
    By _registerbutton = By.xpath("//input[@id=\"register-button\"]");

    public void verifyuserisNavigatetoRegisterPage(){
        Assert.assertEquals(URL,"https://demo.nopcommerce.com/register");}

        public void userEnterRegistrationDetails () {

            clickElementBy(_female );
            enterText(_firstname, loadprop.getProperty("firstname"));
            enterText(_lastname, loadprop.getProperty("lastname"));

            enterText(_email, randomDate() +loadprop.getProperty("email"));
            enterText(_password, loadprop.getProperty("password"));
            enterText(_confirmpassword, loadprop.getProperty("confirmpassword"));
            clickElementBy(_registerbutton);

        }




    }
