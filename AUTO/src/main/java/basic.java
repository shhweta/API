import org.junit.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class basic {

    @Test
    public void testresponsecode()
    {
        Response resp=RestAssured.get("https://postman-echo.com/get") ;
        int code = resp.getStatusCode();
        System.out.println("status code is "+code);
        Assert.assertEquals(code,200);
    }

}