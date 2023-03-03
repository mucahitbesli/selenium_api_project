import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;



public class denemeTest {
    public static void main( String[] args )  {


        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/users/1";
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.get("https://jsonplaceholder.typicode.com/users/1");

        ResponseBody body = response.getBody();

        System.out.println("Response Body is: " + body.asString());

    }
}
