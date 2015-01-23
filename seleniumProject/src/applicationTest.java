/**
 * Created by Eric on 1/22/2015.
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class applicationTest {
    public static void main(String[] Args){
        WebDriver driver = new FirefoxDriver();
        String webUrl = "https://10.73.57.253";
        driver.get(webUrl);

        driver.findElement(By.cssSelector("txtFirstName"));


        driver.close();



    }
}
