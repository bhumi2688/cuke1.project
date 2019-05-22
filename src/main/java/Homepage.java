import org.openqa.selenium.By;

public class Homepage extends Utils {

    LoadProp loadprop = new LoadProp();

    //whhatever action we do we need to write in homepage, and method we need to write
    //Welcome to Store
    By _welcomeMessage = By.xpath("//h2[contains(text(),'Welcome to our store')]");
      //RegisterLink
    By _registerLink = By.xpath("//a[@class='ico-register']") ; //By is variable which stores as xpath

    //click on Currencydropdown
    By _currencydropdown = By.xpath("//select[@aria-label=\"Currency selector\"]"); //selects currency

    //selects currency
    By _selectUSDollarCurrency = By.xpath("//select[@id=\"customerCurrency\"]"); //selects US Dollar currency

    //Click on Book
    By _Books = By.xpath("//a[@href=\"/books\"]");



    //click on RegisterButton
    public void clickonRegisterButton()

    {
        clickElementBy(_registerLink);
    }

    //click on currency
    public void cliclonCurrencydropdown()
    {
        clickElementBy(_welcomeMessage );
        clickElementBy(_currencydropdown);
        clickElementBy(_selectUSDollarCurrency);


    }

    //click on Book
    public void clickonBookLink()
    {
        clickElementBy(_Books );
    }

}
