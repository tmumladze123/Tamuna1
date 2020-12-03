import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class tamuna1 {


    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver chromedriver = new ChromeDriver();
        chromedriver.get("http://the-internet.herokuapp.com");
        chromedriver.findElement(By.linkText("Forgot Password")).click();
        WebElement enteremail = chromedriver.findElement(By.id("email"));
        enteremail.click();
        enteremail.sendKeys(new CharSequence[]{"Tamarchik@gmail.com"});
        WebElement teri_password = chromedriver.findElement(By.className("radius"));
        teri_password.click();
        chromedriver.close();
        chromedriver.quit();
    }


}
