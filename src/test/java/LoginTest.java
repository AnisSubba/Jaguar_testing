import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class LoginTest {

    public WebDriver driver = new ChromeDriver();

    @Test
    public void loginTest(){
        driver.get("https://wwww.facebook.com");
        System.out.println(driver.getTitle());
        driver.close();
    }

    /**
     * This is demo practise to see if i can get the value and add them together so it's easier later on
     */

    @Test
    public void DemoAddPriceFromTescoPage(){
        System.setProperty("webdriver.chrome.drive", "chromedriver");

        driver.get("https://www.tesco.com/groceries/en-GB/shop/drinks/fizzy-drinks-and-cola/all-cola");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        List<WebElement> cost = driver.findElements(By.cssSelector(".product-list--list-item .price-per-sellable-unit--price .value"));
        cost.forEach((n) -> System.out.println(n.getText()));
        int total = 0;
        for (WebElement i : cost){
            total += Double.parseDouble(i.getText());
        }
        System.out.println("Total: "+total);
        driver.close();
    }

    /**
     * price has £ and , character which cannot be blocker to add with other prices, so create for loop to add as the price goes and remove the character
     * result = hard code the css selector so only 2 same price had been outputted and added
     */

    @Test
    public void DemoMitsubishiCarsTotal(){
        System.setProperty("webdriver.chrome.drive", "chromedriver");

        driver.get("https://www.mitsubishi-motors.co.uk/cars/eclipse-cross");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        List<WebElement> price = driver.findElements(By.cssSelector("#selector-2-tab-4 > div > a > div > p > span"));
        price.forEach((x) -> System.out.println(x.getText().replaceAll("[£,]","")));

        int total = 0;
        for (WebElement i : price){
            total += Integer.parseInt(i.getText().replaceAll("[£,]",""));
        }
        System.out.println("Total: " + total);
        driver.close();
    }

    /**
     *
     */

    @Test
    public void DemoAutoTradeCarsTotal(){
        System.setProperty("webdriver.chrome.drive", "chromedriver");

        driver.get("https://www.autotrader.co.uk/car-search?advertClassification=standard&postcode=HU6%207JH&onesearchad=Used&onesearchad=Nearly%20New&onesearchad=New&advertising-location=at_cars&is-quick-search=TRUE&page=1");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        List<WebElement> price = driver.findElements(By.cssSelector(".search-page__result .vehicle-price"));
        price.forEach((i) -> System.out.println(i.getText().replaceAll("[£,]","")));

        int total = 0;
        for (WebElement a : price){
            total += Integer.parseInt(a.getText().replaceAll("[£,]", ""));
        }
        System.out.println("Total: " + total);
        driver.close();
    }

}
