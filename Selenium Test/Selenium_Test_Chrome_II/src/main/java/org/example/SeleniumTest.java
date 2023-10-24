package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {
        // Imposta il percorso del driver Chrome
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        // Inizializza il driver di Chrome
        WebDriver driver = new ChromeDriver();
        //Accedo alla home del sito
        driver.get("http://127.0.0.1:5000/");
        // Attendi per alcuni secondi per vedere il risultato
        try {
            Thread.sleep(3000); // 3 secondi di attesa
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Test di Login Prima di effettuare la registrazione:
        driver.get("http://127.0.0.1:5000/log_in");
        WebElement usernameInput = driver.findElement(By.name("email"));
        WebElement passwordInput = driver.findElement(By.name("pass"));
        WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
        usernameInput.sendKeys("marioRossi@gmail.com");
        passwordInput.sendKeys("password");
        // Attendi per alcuni secondi per vedere il risultato
        try {
            Thread.sleep(3000); // 3 secondi di attesa
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        loginButton.click();
        // Attendi per alcuni secondi per vedere il risultato
        try {
            Thread.sleep(3000); // 3 secondi di attesa
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Test di Registrazione:
        driver.get("http://127.0.0.1:5000/registration");
        // Trova gli elementi di input e il pulsante di registrazione
        WebElement nameInput = driver.findElement(By.name("name"));
        WebElement surnameInput = driver.findElement(By.name("surname"));
        WebElement emailInput = driver.findElement(By.name("email"));
        WebElement passwordsInput = driver.findElement(By.name("password"));
        WebElement phoneInput = driver.findElement(By.name("phone"));
        WebElement registrationButton = driver.findElement(By.xpath("//button[@type='submit']"));
        // Compila i campi con dati di registrazione
        nameInput.sendKeys("Mario");
        surnameInput.sendKeys("Rossi");
        emailInput.sendKeys("marioRossi@gmail.com");
        passwordsInput.sendKeys("password");
        phoneInput.sendKeys("3333333333");
        // Attendi per alcuni secondi per vedere il risultato
        try {
            Thread.sleep(3000); // 3 secondi di attesa
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Fai clic sul pulsante di registrazione
        registrationButton.click();
        // Attendi per alcuni secondi per vedere il risultato
        try {
            Thread.sleep(3000); // 3 secondi di attesa
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //Inserire ora il test di login con le credenziali appena registrate;
        // Test di Login dopo aver effettuato la registrazione:
        driver.get("http://127.0.0.1:5000/log_in");
        WebElement usernameInput2 = driver.findElement(By.name("email"));
        WebElement passwordInput2 = driver.findElement(By.name("pass"));
        WebElement loginButton2 = driver.findElement(By.xpath("//input[@type='submit']"));

        usernameInput2.sendKeys("marioRossi@gmail.com");
        passwordInput2.sendKeys("password");

        // Attendi per alcuni secondi per vedere il risultato
        try {
            Thread.sleep(3000); // 3 secondi di attesa
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        loginButton2.click();
        driver.quit();
    }
}
