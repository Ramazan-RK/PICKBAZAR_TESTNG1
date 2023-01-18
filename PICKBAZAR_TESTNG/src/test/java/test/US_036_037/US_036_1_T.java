package test.US_036_037;


import com.aventstack.extentreports.ExtentReports;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReports;

public class US_036_1_T extends TestBaseReports {





    @Test
    public void test01() throws InterruptedException {


        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest = extentReports.createTest("PICKBAZAR TC-036-1");
        System.out.println("github project");

        HomePage hp=new HomePage();
        hp.joinButton.click();
        Thread.sleep(3000);
       // hp.emailButton.clear();
       // hp.emailButton.sendKeys(ConfigReader.getProperty("email"));
      //  hp.passwordButton.clear();
      //  hp.passwordButton.sendKeys(ConfigReader.getProperty("password"));
        hp.loginButton.click();
        Thread.sleep(3000);

        hp.GroceryTab.click();
        Thread.sleep(3000);
        hp.clothing.click();
        hp.productImage.click();
        hp.renk.click();
        hp.size.click();
        hp.avatar.click();
        Actions actions=new Actions(Driver.getDriver());
        actions.keyDown(Keys.ESCAPE).keyUp(Keys.ESCAPE).perform();
        hp.login2.click();
        hp.myWishlist.click();













































    }

}
