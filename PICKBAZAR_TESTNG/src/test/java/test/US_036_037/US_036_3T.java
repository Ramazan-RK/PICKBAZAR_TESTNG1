package test.US_036_037;

import com.aventstack.extentreports.ExtentReports;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_036_3T  {

    WebDriver driver;
    private Object extentTest;
    private ExtentReports extentReports;

    @Test
    public void test02() throws InterruptedException {


        Driver.getDriver().get(ConfigReader.getProperty("url"));

         //  this.extentTest = this.extentReports.createTest("PICKBAZAR TC-036-03");


       // HomePage hp = new HomePage();




    }
}