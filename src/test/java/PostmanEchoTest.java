import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTest {

    @Test
    public void postTheBody() {
        given()
                .baseUri("https://postman-echo.com")
                .body("Привет")
                .contentType("text/plain; charset=UTF-8")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("Привет"));

    }
}

