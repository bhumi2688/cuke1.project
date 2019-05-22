import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {

    Homepage homepage = new Homepage();
    Registrationpage registrationpage = new Registrationpage();
    RegistrationSuccessMessagepage registrationSuccessMessagepage = new RegistrationSuccessMessagepage();


    @Given("^user is on register page$")
    public void userIsOnRegisterPage()
    {
        homepage.clickonRegisterButton();
    }

    @When("^user enters all registration details$")
    public void userEntersAllRegistrationDetails()
    {
        registrationpage.userEnterRegistrationDetails();
    }

    @Then("^user should be able to register successfully$")
    public void userShouldBeAbleToRegisterSuccessfully()
    {
        //registrationSuccessMessagepage.verifyUserSeeRegistrationSuccessMessage();
    }
    public void userShouldNavigatetoRegistrationSuccessPage()
    {
        registrationSuccessMessagepage.usercanSeeRegisterSuccessMessage() ;
    }


    @Given("^user is on home page$")
    public void userIsOnHomePage() {
        
    }

    @When("^user click on Books$")
    public void userClickOnBooks() {
        
    }

    @And("^user click on change currency$")
    public void userClickOnChangeCurrency() {
    }


    @Then("^user can see products in Dollar value$")
    public void userCanSeeProductsInDollarValue() {
    }
}
