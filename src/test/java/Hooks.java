import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import static org.apache.commons.io.FileUtils.copyFile;

public class Hooks extends BasePage  {

      BrowserSelector browserSelector = new BrowserSelector();
    static String timeStamp = new SimpleDateFormat("dd.MM.yy.HH.mm.ss").format(new Date());



    @Before
    public void setUpBrowser(){
    browserSelector.setUpBrowser();
    driver.manage().timeouts().implicitlyWait(20,TimeUnit.MILLISECONDS);
    driver.manage().window().fullscreen();
    driver.get("http://demo.nopcommerce.com/");

}

@After
public void closeBrowser(Scenario scenario) throws IOException {
    if(scenario.isFailed()) {
        String screenshotName = scenario.getName().replaceAll("[.,:;?!]", "") + timeStamp + ".png";
        try {
            //This take screenshot from driver
            File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            //Building up a destination path to save screenshot
            //Also make sure to make a folder of screenshot with in cucumber-report folder
            File destinationpath = new File(System.getProperty("user.dir") + "src\\Screenshot" + screenshotName);
            //copy taken screenshot from source location to destination location
            copyFile(sourcePath, destinationpath);
            scenario.write("!!!!!!!!!.....Scenario Failed .......!!!!!!!!!! please see attached screenshot for the error/issue");
            //attach the screenshot to our report
            scenario.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png");
        } catch (IOException e) {
        }

    }
       driver.close();
}
}
