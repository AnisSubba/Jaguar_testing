package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class jaguar_page {

    private WebDriver driver;

    private String jaguarPageUrl = "https://jaguar.rockar.com/";
    private By jaguar_Demo_Page = By.linkText("https://jaguar.rockar.com/approved-used?acceptedFinance=false");

    public jaguar_page(WebDriver driver) {
        this.driver = driver;
    }

    public jaguar_page goToJaguarPage(){
        driver.navigate().to(jaguarPageUrl);
        return this;
    }

    public jaguar_page clickTheDemoPage(){
        driver.findElement(jaguar_Demo_Page).click();
        return this;
    }

}
