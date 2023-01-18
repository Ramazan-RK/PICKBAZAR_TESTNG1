package test.US_036_037;

import com.aventstack.extentreports.ExtentReports;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;



/*
1)Kullanıcı URL ye gidilecek
2)Kullanıcı ürün seçer
3)Kullanıcı Renk butonunu seçer
4)Kullanıcı beden seçimi yapar
5)Kullanıcı ödeme sayfasına gider
 */

public class US_036_2_T {

    WebDriver driver;
    private Object extentTest;
    private ExtentReports extentReports;

    @Test
    public void test02() throws InterruptedException {


        Driver.getDriver().get(ConfigReader.getProperty("url"));

        this.extentTest = this.extentReports.createTest("PICKBAZAR TC-036-02");


        HomePage hp = new HomePage();

        hp.joinButton.click();hp.emailButton.clear();
        hp.emailButton.sendKeys(ConfigReader.getProperty("email"));
        Thread.sleep(3000);


        hp.passwordButton.clear();
        hp.passwordButton.sendKeys(ConfigReader.getProperty("password"));
        Thread.sleep(3000);

       hp.loginButton.click();
       Thread.sleep(3000);

        hp.GroceryTab.click();
        hp.clothing.click();
        hp.productImage.click();

       //hp.color.click();
       // hp.size.click();
        //hp.addToShoppingCart.click();

        Actions actions=new Actions(Driver.getDriver());
        actions.keyDown(Keys.ESCAPE).keyUp(Keys.ESCAPE).perform();

       // hp.ödeme.click();






    }
}