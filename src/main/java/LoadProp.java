import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProp {

    static Properties prop;
    static FileInputStream input;
   static String fileName ="TestDataconfig.properties";
    static String fileLocation = "src\\main\\Resources\\TestData";

    public  String getProperty(String key) {
        prop = new Properties();
        try {
            input = new FileInputStream(fileLocation + fileName  );
            prop.load(input);
            input.close();
        } catch (IOException e) {
            e.printStackTrace();

        }

        return prop.getProperty(key);

    }







}