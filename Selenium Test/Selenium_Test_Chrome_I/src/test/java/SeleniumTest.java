import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ifkv=AVQVeyzXO7QMTyzt3OIgGJsf6QyAILqJsgpTAWxgMqq0mmM1UWGddJziJHxegBgpZfT51fxwx7QKWQ&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S302929306%3A1697440904989560&theme=glif");
        driver.manage().window().maximize();
        driver.findElement(By.id("identifierId")).sendKeys("test@gmail.com");
        Thread.sleep(2000);
        String get = driver.getTitle();
        String opt = "gmail";
        driver.close();
        if(get.equalsIgnoreCase(opt)){
            System.out.println("Test Success!");
        } else{
            System.out.println("Test Failed!");
        }
    }
}
