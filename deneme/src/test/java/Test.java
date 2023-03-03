import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

    static WebDriver webDriver;

    public static void main( String[] args ) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();


        webDriver.get("https://dijitalimza.com.tr/Identity/Account/Register");

        webDriver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div/div[3]/div/form/div/div[2]/div/input")).sendKeys("Romaguer");
        Thread.sleep(1000);
        webDriver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div/div[3]/div/form/div/div[3]/div/input")).sendKeys("Crona");
        Thread.sleep(1000);
        webDriver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div/div[3]/div/form/div/div[4]/div/input")).sendKeys("Sincere@april.biz");
        Thread.sleep(1000);
        webDriver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div/div[3]/div/form/div/div[5]/div/input")).sendKeys("5555555555");
        Thread.sleep(1000);
        webDriver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div/div[3]/div/form/div/div[6]/div/div[1]/input")).sendKeys("1234567890Uu*");
        Thread.sleep(1000);
        webDriver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div/div[3]/div/form/div/div[6]/div/div[2]/input")).sendKeys("1234567890Uu*");
        Thread.sleep(1000);
        webDriver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div/div[3]/div/form/div/div[7]/div/label/span")).click();
        Thread.sleep(1000);
        webDriver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div/div[3]/div/form/div/div[8]/div/button")).click();
        Thread.sleep(2000);
        webDriver.quit();



    }

}
