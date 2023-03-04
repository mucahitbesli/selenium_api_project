import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class denemeTest {
    static WebDriver webDriver;
    public static void main( String[] args ) throws InterruptedException {


        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/users/1";
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.get("https://jsonplaceholder.typicode.com/users/1");

        ResponseBody body = response.getBody();

        System.out.println("Response Body is: " + body.asString());

        JsonPath jsonPathEvaluator = response.jsonPath();
        String isim = jsonPathEvaluator.get("name");
        String soyisim = jsonPathEvaluator.get("username");
        String email = jsonPathEvaluator.get("email");


        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();

        webDriver.get("https://dijitalimza.com.tr/Identity/Account/Register");

        webDriver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div/div[3]/div/form/div/div[2]/div/input")).sendKeys(isim);
        Thread.sleep(1000);
        webDriver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div/div[3]/div/form/div/div[3]/div/input")).sendKeys(soyisim);
        Thread.sleep(1000);
        webDriver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div/div[3]/div/form/div/div[4]/div/input")).sendKeys(email);
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
