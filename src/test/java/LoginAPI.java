import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginAPI {

    @Test
    public void test_login() {
        RestAssured.baseURI = "https://saruwata-uat.azurewebsites.net/Account";

        RequestSpecification httprequest = RestAssured.given();

        JSONObject params = new JSONObject();
        params.put("Email", "dilani+100mimobimedia.com");
        params.put("Password", "Test@123");

        httprequest.header("Content-Type", "application/json");
        httprequest.body(params.toJSONString());

        Response response = httprequest.request(Method.POST, "/Login");

        int code = response.getStatusCode();
        System.out.println("Status code is : " + code);
        Assert.assertEquals(code, 200);


        String txt = response.getStatusLine();
        System.out.println("Status Line is : " + txt);
        Assert.assertEquals(txt, "HTTP/1.1 200 OK");


    }
}
