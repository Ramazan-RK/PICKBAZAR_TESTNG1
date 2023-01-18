package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(partialLinkText = "Become a Seller")
   public WebElement sellerButton;

    @FindBy(xpath = "//button[text()='Join']")

    public WebElement joinButton;

    @FindBy(id = "email")
    public WebElement emailButton;

    @FindBy(id="password")
    public WebElement passwordButton;

    @FindBy(xpath = "//button[starts-with(text(),'Login')]")

    public WebElement loginButton;
    @FindBy(xpath ="//span[text()='Grocery'])[1]")
    public WebElement GroceryTab;
////span[@class='whitespace-nowrap'])[1]

     @FindBy(id = "headlessui-menu-item-15")
      public WebElement clothing;

    @FindBy(xpath = "//img[@alt='Solid Notch Lapel Single Button Long Sleeve Blazer']")
     public WebElement productImage;

   @FindBy(xpath = "//span[@class='h-full w-full rounded-full border border-border-200']")
    public WebElement renk;

   @FindBy(xpath = "//div[@class='cursor-pointer whitespace-nowrap rounded border-border-]")
          // "200 bg-gray-50 px-4 py-3 text-sm text-heading transition-colors border']")

  public WebElement size;
   @FindBy(className = "h-5 w-5 text-accent")
    public WebElement avatar;
    @FindBy(id = "headlessui-menu-button-8")
    public WebElement login2;

    @FindBy(id="headlessui-menu-item-29")public WebElement myWishlist;

    //************************************************************************************************




















}
