package test;

import com.aventstack.extentreports.ExtentReports;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_36_1 {



    WebDriver driver;
    private Object extentTest;
    private ExtentReports extentReports;

    @Test
    public void test01(){


        Driver.getDriver().get(ConfigReader.getProperty("url"));
        this.extentTest = this.extentReports.createTest("PICKBAZAR");
        System.out.println("github project");






    }

}
