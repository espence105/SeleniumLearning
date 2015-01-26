/**
 * Created by Eric on 1/22/2015.
 */
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class applicationTest {
    public static void main(String[] Args){
        WebDriver driver = new FirefoxDriver();
        String webUrl = "http://dev01.cc.ausrc.org/DriverApplication.aspx";
        driver.get(webUrl);

        findASPElement("txtFirstName", driver).sendKeys("Eric");

        driver.close();
    }
    private static WebElement findASPElement(String elementName, WebDriver driver){
        WebElement test =  driver.findElement(By.xpath("//input[contains(@id,'"+elementName+"' )]"));
        return test;

    }
}
