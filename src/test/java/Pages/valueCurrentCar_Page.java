package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class valueCurrentCar_Page {

    private WebDriver driver;
    private By SkipButton = By.cssSelector(".skip-button");

    public valueCurrentCar_Page(WebDriver driver){
        this.driver = driver;
    }

    public valueCurrentCar_Page clickSkipButton(){
        driver.findElement(SkipButton).click();
        return this;
    }

}
