import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CurrencyPage extends Utils {

LoadProp loadProp = new LoadProp() ;

//click on Book Products
By _JaneAusten = By.xpath("//a[@href=\"/pride-and-prejudice\"]");

//click on Euro
    By _EuroCurrency = By.xpath("//select[@id='customerCurrency']");

    //click on sort currency
    By _SortCurreny = By.xpath("//select[@id='customerCurrency']");

    //click on USDollar
    By _USDollar = By.xpath("//select[@id='customerCurrency']");

//will click on selected Book
public void userSelectsBookandCurrency()
{
    clickElementBy(_JaneAusten );
    clickElementBy(_EuroCurrency);
    clickElementBy(_SortCurreny);
    clickElementBy(_USDollar);
}
  //check for USDollar

    boolean present = false ;

List<WebElement> activeList = driver.findElements(By.className("actual-price"));
//get text of$ value
    for (WebElement element : activeList){
        String str = element.getText();
        for(int i=0; i<str.length();i++ ){
            char ch = str.charAt(i);
            if(ch=='$'){
                present = true;

            }
        }
        if(present == true) {
            System.out.println("$" + "is present in the array list");
        }else{
            System.out.println("The $ is not present in the array list");
        }
    }




}
