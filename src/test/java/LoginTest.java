import Pages.AutomationSite;
import com.google.common.primitives.Ints;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static jdk.vm.ci.meta.JavaKind.Int;

public class LoginTest {

    public WebDriver driver = new ChromeDriver();
    private AutomationSite automationSite;


    @Test
    public void loginTest(){
        driver.get("https://wwww.facebook.com");
        System.out.println(driver.getTitle());
        driver.close();
    }

    @Test
    public void CheckoutPageGetTotal(){
        System.setProperty("webdriver.chrome.drive", "chromedriver");

        automationSite.getJaguar().goToJaguarPage().clickTheDemoPage();

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
        cost.forEach((n) -> System.out.println(Double.parseDouble(n.getText())));
        int total = 0;
        for (WebElement i : cost){
            total += Double.parseDouble(i.getText());
        }
        System.out.println("Total: "+total);
    }



}
