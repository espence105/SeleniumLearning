/**
 * Created by Eric on 11/27/2014.
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firstTest  {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        String baseUrl = "http://newtours.dmoaut.com";
        String expectedTitle ="Welcome: Mercury Tours";
        String actualTitle = "";

        driver.get(baseUrl);

        actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle))
            System.out.println("Correct");
        else
            System.out.println("Incorrect");

        driver.close();
        System.exit(0);
    }

}
