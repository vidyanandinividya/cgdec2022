package wiprofsd.webdev.jwtauth;



import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.apache.http.HttpStatus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.client.RestClientTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import io.restassured.http.ContentType;
import wiprofsd.webdev.model.JWTRequest;

@SpringBootTest
@RunWith(SpringRunner.class)
//@RestClientTest
public class TestEndPointJWT {
	private String body="{ \"username\": \"admin\", \"password\": \"password\"}";
	private String token="";

	
	@Test
	public void TestGetWithJWT()
	{
		JWTRequest req = new JWTRequest("admin","password");
		token=given().log().all()
				.basePath("/authenticate")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(req)
		.when()
		.post()
		.then().log().all()
		.statusCode(HttpStatus.SC_OK)
		.extract().body().jsonPath()
		.get("jwtToken");
		
		Map<String, String> headers=new HashMap<>() {
			

			{
				put("content-type","application/json");
				put("Authorization","Bearer "+token);
			}
		};
		given()
		.log().all()
		.headers(headers)
		.when()
		.get("http://localhost:8080/home")
		.then()
		.log().all()
		.assertThat()
		.statusCode(HttpStatus.SC_OK).log().all();
	}
	
}
