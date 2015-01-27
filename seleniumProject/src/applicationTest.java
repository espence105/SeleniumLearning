/**
 * Created by Eric on 1/22/2015.
 */
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;


public class applicationTest {

    public static void main(String[] Args){
        WebDriver driver = new FirefoxDriver();
        String webUrl = "http://dev01.cc.ausrc.org/DriverApplication.aspx";
        driver.get(webUrl);
        ArrayList<labels> aspControls = createElementList();

        for (labels l: aspControls){
            findASPElement(l.getLabelName(), driver).sendKeys(l.getKeyInput());
        }


        driver.close();
    }
    private static WebElement findASPElement(String elementName, WebDriver driver){
        WebElement test =  driver.findElement(By.xpath("//input[contains(@id,'"+elementName+"' )]"));
        return test;

    }
    private static ArrayList createElementList(){
        ArrayList<labels> newArray = new ArrayList<labels>();
            newArray.add(new labels("txtFirstName", "Eric"));
            newArray.add(new labels("txtLastName","Spence"));
            newArray.add(new labels("txtEmail", "ejspence@anderson.edu"));
            newArray.add(new labels("txtPhoneNumber","8019438259"));
            newArray.add(new labels("txtSSN","12345678910"));
            newArray.add(new labels("txtPrevAddressOne", "8888 Taft Hill Court Sandy UT, 84093"));
            newArray.add(new labels("txtPrevAddressTwo", "508 Park Avenue Anderson, IN 46012"));
            newArray.add(new labels("txtPrevAddressThree", "1100 East Fifth Street, IN 46012"));
        return newArray;
    }
}
