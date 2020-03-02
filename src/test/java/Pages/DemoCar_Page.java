package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoCar_Page {

    private WebDriver driver;
    private String DemoCarPageURL = "https://jaguar.rockar.com/approved-used?acceptedFinance=false";

    private By nextstepButton = By.cssSelector("#car-finder > div.navigation-buttons-wrapper.col-12 > div.navigation-outer-container > button:nth-child(2)");
    private By cookieButton = By.cssSelector(".popup-continue");

    public DemoCar_Page(WebDriver driver){
        this.driver = driver;
    }

    public DemoCar_Page goToWebsite(){
        driver.navigate().to(DemoCarPageURL);
        return this;
    }

    public DemoCar_Page ClickTheNextButton(){
        driver.findElement(nextstepButton).click();
        return this;
    }

    public DemoCar_Page ClickTheContinueButton(){
        driver.findElement(cookieButton).click();
        return this;
    }
}
