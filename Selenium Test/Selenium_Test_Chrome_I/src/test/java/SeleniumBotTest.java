import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBotTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.nike.com/it/t/scarpa-dunk-low-retro-dd36JB/DD1391-103");

        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement rejectCookie = driver.findElement(By.className("nds-btn dialog-actions-decline-btn css-19davq0 ex41m6f0 btn-primary-dark  btn-lg"));
        rejectCookie.click();
        Thread.sleep(2000);

        driver.findElement(By.id("skuAndSize__26450152")).click();
        Thread.sleep(2000);

        WebElement addToCartBtn = driver.findElement(By.className("ncss-btn-primary-dark btn-lg add-to-cart-btn"));
        addToCartBtn.click();
        Thread.sleep(2000);

        WebElement goToShopBtn = driver.findElement(By.className("pre-nav-design-icon"));
        goToShopBtn.click();
        Thread.sleep(2000);

    }
}