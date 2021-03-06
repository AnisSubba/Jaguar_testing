package Pages;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class AutomationSite {

    private static WebDriver driver;
    private jaguar_page jaguar;
    private DemoCar_Page demoCar_page;
    private valueCurrentCar_Page valueCurrentCar;
    private ChooseCar_Page chooseCar_page;
    private static final int implicitWaitTime = 15;


    public AutomationSite(WebDriver driver){
        this.driver = driver;
        this.jaguar = new jaguar_page(driver);
        this.demoCar_page = new DemoCar_Page(driver);
        this.valueCurrentCar = new valueCurrentCar_Page(driver);
        this.chooseCar_page = new ChooseCar_Page(driver);
    }

    public jaguar_page getJaguar(){return jaguar;}
    public DemoCar_Page getDemoCar_page(){return demoCar_page;}
    public valueCurrentCar_Page getValueCurrentCar(){return valueCurrentCar;}
    public ChooseCar_Page getChooseCar_page(){return chooseCar_page;}

    public static void setWaitTimeout(int waitTimeout){
        driver.manage().timeouts().implicitlyWait(waitTimeout, TimeUnit.SECONDS);
        setWaitTimeout(implicitWaitTime);
    }
}
