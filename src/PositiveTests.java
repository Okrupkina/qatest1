
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class PositiveTests {

    @Test
    public void OpenCreatingTabpositive() {

        System.setProperty("webdriver.chrome.driver", "C://Users//Жозефович//IdeaProjects//SeleniumIde//lib//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com.ua/" + "/?gws_rd=ssl");
        driver.findElement(By.id("gb_70")).click();
        driver.findElement(By.id("account-chooser-link")).click();
        driver.findElement(By.id("account-chooser-add-account")).click();
        driver.findElement(By.cssSelector("#link-signup > a")).click();



    }
    @Test
    public void CretingProfileWithCorrectData() {

        System.setProperty("webdriver.chrome.driver", "C://Users//Жозефович//IdeaProjects//SeleniumIde//lib//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com.ua/" + "/SignUp?continue=https%3A%2F%2Fwww.google.com.ua%2F%3Fgws_rd%3Dssl&hl=uk");
        driver.findElement(By.id("GmailAddress")).click();
        driver.findElement(By.id("Passwd")).click();
        driver.findElement(By.id("Passwd")).clear();
        driver.findElement(By.id("Passwd")).sendKeys("qazwsxedcrfv");
        driver.findElement(By.id("PasswdAgain")).clear();
        driver.findElement(By.id("PasswdAgain")).sendKeys("qazwsxedcrfv");
        driver.findElement(By.id("submitbutton")).click();
        driver.findElement(By.id("Passwd")).click();
        driver.findElement(By.id("Passwd")).clear();
        driver.findElement(By.id("Passwd")).sendKeys("poilkjmnb");
        driver.findElement(By.id("PasswdAgain")).clear();
        driver.findElement(By.id("PasswdAgain")).sendKeys("poilkjmnb");
        driver.findElement(By.id("submitbutton")).click();
        driver.findElement(By.xpath("//div[@id='tos-button-div']/input")).click();
        driver.findElement(By.id("submitbutton")).click();
        driver.findElement(By.id("iagreebutton")).click();
        driver.findElement(By.id("signupidvinput")).clear();
        driver.findElement(By.id("signupidvinput")).sendKeys("0990982072");
        driver.findElement(By.id("next-button")).click();
        driver.findElement(By.id("verify-phone-input")).clear();
        driver.findElement(By.id("verify-phone-input")).sendKeys("167018");
        driver.findElement(By.name("VerifyPhone")).click();


    }

    @Test
    public void IncorretLogin() {

        System.setProperty("webdriver.chrome.driver", "C://Users//Жозефович//IdeaProjects//SeleniumIde//lib//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com.ua/" + "/?gws_rd=ssl");
        driver.findElement(By.id("gb_70")).click();
        driver.findElement(By.id("Passwd")).clear();
        driver.findElement(By.id("Passwd")).sendKeys("poilkjmnbqaz");
        driver.findElement(By.id("signIn")).click();
      //  assertEquals("Введені електронна адреса та пароль не збігаються.", driver.findElement(By.id("errormsg_0_Passwd")).getText());

    }

    @Test
    public void CorrectPasswordEntering() {

        System.setProperty("webdriver.chrome.driver", "C://Users//Жозефович//IdeaProjects//SeleniumIde//lib//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com.ua/" + "/?gws_rd=ssl");
        driver.findElement(By.id("gb_70")).click();
        driver.findElement(By.id("Passwd")).clear();
        driver.findElement(By.id("Passwd")).sendKeys("poilkjmnb");
        driver.findElement(By.id("signIn")).click();
        driver.findElement(By.cssSelector("span.gb_3a.gbii")).click();

    }

    @Test
    public void OpenMail() {

        System.setProperty("webdriver.chrome.driver", "C://Users//Жозефович//IdeaProjects//SeleniumIde//lib//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com.ua/" + "/?gws_rd=ssl&pli=1");
        driver.findElement(By.cssSelector("a.gb_b.gb_Rb")).click();
        driver.findElement(By.linkText("Gmail")).click();
        driver.findElement(By.xpath("//button[@id='close-button']")).click();

    }

    @Test
    public void OpenPhoto() {

        System.setProperty("webdriver.chrome.driver", "C://Users//Жозефович//IdeaProjects//SeleniumIde//lib//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://mail.google.com/" + "/?gws_rd=ssl&pli=1");
        driver.findElement(By.cssSelector("a.gb_b.gb_Rb")).click();
        driver.findElement(By.linkText("Gmail")).click();
        driver.findElement(By.xpath("//button[@id='close-button']")).click();

    }

    @Test
    public void SendEMail() {

        System.setProperty("webdriver.chrome.driver", "C://Users//Жозефович//IdeaProjects//SeleniumIde//lib//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://photos.google.com/" + "/");
        driver.findElement(By.cssSelector("a.gb_b.gb_Rb")).click();
        driver.findElement(By.cssSelector("#gb23 > span.gb_3")).click();
        driver.findElement(By.xpath("//div[2]/div/div/div/div[2]/div/div/div/div/div")).click();
        driver.findElement(By.id(":9m")).click();
        driver.findElement(By.id(":9m")).clear();
        driver.findElement(By.id(":9m")).sendKeys("okrupkina@gmail.com");
        driver.findElement(By.id(":ab")).click();
        driver.findElement(By.id(":ab")).click();
        driver.findElement(By.id(":8w")).click();

    }


    @Test
    public void Logout() {

        System.setProperty("webdriver.chrome.driver", "C://Users//Жозефович//IdeaProjects//SeleniumIde//lib//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://mail.google.com/" + "/mail/?tab=qm#inbox");
        driver.findElement(By.cssSelector("span.gb_3a.gbii")).click();
        driver.findElement(By.id("gb_71")).click();

    }

    //      driver.close();
}

