import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

public class NegativeTests {

    @Test
    public void OpenCreatingTab() {

        System.setProperty("webdriver.chrome.driver", "C://Users//Жозефович//IdeaProjects//SeleniumIde//lib//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com.ua/" + "/?gws_rd=ssl");
        driver.findElement(By.id("gb_70")).click();
        driver.findElement(By.id("account-chooser-link")).click();
        driver.findElement(By.id("account-chooser-add-account")).click();
        driver.findElement(By.cssSelector("#link-signup > a")).click();



    }

    @Test
    public void EmptyFields() {

        System.setProperty("webdriver.chrome.driver", "C://Users//Жозефович//IdeaProjects//SeleniumIde//lib//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://accounts.google.com/" + "/SignUp?continue=https%3A%2F%2Fwww.google.com.ua%2F%3Fgws_rd%3Dssl&hl=uk");
        driver.findElement(By.id("lastname-placeholder")).click();
        // assertEquals("Це поле не може бути порожнім.", driver.findElement(By.id("errormsg_0_FirstName")).getText());


        //   driver.close();
    }

    @Test
    public void NameWithSymbols() {

        System.setProperty("webdriver.chrome.driver", "C://Users//Жозефович//IdeaProjects//SeleniumIde//lib//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://accounts.google.com/" + "/SignUp?continue=https%3A%2F%2Fwww.google.com.ua%2F%3Fgws_rd%3Dssl&hl=uk");
        driver.findElement(By.id("FirstName")).clear();
        driver.findElement(By.id("FirstName")).sendKeys("qatest&^%");
        driver.findElement(By.id("lastname-placeholder")).click();
        driver.findElement(By.id("lastname-placeholder")).click();
        driver.findElement(By.id("LastName")).clear();
        driver.findElement(By.id("LastName")).sendKeys("qatest");
        driver.findElement(By.id("submitbutton")).click();

    }

    @Test
    public void LoginName() {

        System.setProperty("webdriver.chrome.driver", "C://Users//Жозефович//IdeaProjects//SeleniumIde//lib//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://accounts.google.com/" + "/SignUp?continue=https%3A%2F%2Fwww.google.com.ua%2F%3Fgws_rd%3Dssl&hl=uk");
        driver.findElement(By.id("GmailAddress")).click();
        driver.findElement(By.id("GmailAddress")).clear();
        driver.findElement(By.id("GmailAddress")).sendKeys("qa");
       // assertEquals("Можна використовувати літери, цифри та крапки.", driver.findElement(By.id("bubble-7")).getText());
        driver.findElement(By.id("GmailAddress")).click();
        driver.findElement(By.id("submitbutton")).click();
      //  assertEquals("Використовуйте таку кількість символів: 6–30.", driver.findElement(By.id("errormsg_0_GmailAddress")).getText());

    }

    @Test
    public void PasswordEmpty () {

        System.setProperty("webdriver.chrome.driver", "C://Users//Жозефович//IdeaProjects//SeleniumIde//lib//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://accounts.google.com/" + "/SignUp?continue=https%3A%2F%2Fwww.google.com.ua%2F%3Fgws_rd%3Dssl&hl=uk");
        driver.findElement(By.id("submitbutton")).click();
     //   assertEquals("Це поле не може бути порожнім.", driver.findElement(By.id("errormsg_0_Passwd")).getText());

    }

    @Test
    public void PasswordDifferent () {

        System.setProperty("webdriver.chrome.driver", "C://Users//Жозефович//IdeaProjects//SeleniumIde//lib//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://accounts.google.com/" + "/SignUp?continue=https%3A%2F%2Fwww.google.com.ua%2F%3Fgws_rd%3Dssl&hl=uk");
        driver.findElement(By.id("Passwd")).click();
        driver.findElement(By.id("PasswdAgain")).clear();
        driver.findElement(By.id("PasswdAgain")).sendKeys("qazwsxedc11");
        assertTrue(driver.findElement(By.id("errormsg_0_PasswdAgain")).getText().matches("^exact:Ці паролі не збігаються\\. Повторити спробу[\\s\\S]$"));

    }
    @Test
    public void IncorrectDateOfBirth () {

        System.setProperty("webdriver.chrome.driver", "C://Users//Жозефович//IdeaProjects//SeleniumIde//lib//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://accounts.google.com/" + "/SignUp?continue=https%3A%2F%2Fwww.google.com.ua%2F%3Fgws_rd%3Dssl&hl=uk");
        driver.findElement(By.id("BirthDay")).clear();
        driver.findElement(By.id("BirthDay")).sendKeys("1");
        driver.findElement(By.cssSelector("div.goog-menuitem-content")).click();
        driver.findElement(By.id("BirthYear")).clear();
        driver.findElement(By.id("BirthYear")).sendKeys("2017");
        driver.findElement(By.id("BirthDay")).clear();
        driver.findElement(By.id("BirthDay")).sendKeys("32");
        assertEquals("Схоже, дата не правильна. Введіть справжню дату народження.", driver.findElement(By.id("errormsg_0_BirthYear")).getText());

    }
    //      driver.close();
}