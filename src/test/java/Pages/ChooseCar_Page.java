package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class ChooseCar_Page {
    private WebDriver driver;

    private By ModelCar = By.cssSelector(".model-filter-carousel .checkbox-values");

    public ChooseCar_Page(WebDriver driver){
        this.driver = driver;
    }

    public ChooseCar_Page SelectCarModel(){
        List<WebElement> allModel = driver.findElements(ModelCar);
        Random rand = new Random();
        int randomCarModel = rand.nextInt(allModel.size());
        allModel.get(randomCarModel).click();
        return this;
    }
}
