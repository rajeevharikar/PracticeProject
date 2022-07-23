package httpmethods;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DefaultRequestSpefication {
	
	@BeforeClass
	public void defaultRequestSpecification()
	{
		RequestSpecification request1 = RestAssured.given()
				.baseUri("")
				.basePath("")
				.queryParam("", "")
				.contentType(ContentType.JSON);
		
		/* setting default request specification it can be over ridden if needed*/
		
		RestAssured.requestSpecification=request1;
	}
	
	@Test
	public void specification1() {
		
		Response respose = RestAssured.when().get();
		
		System.out.println(respose.asString());
	}
	
	@Test
	public void specification2()
	{
		RequestSpecification request2 = RestAssured.given()
				.baseUri("")
				.basePath("")
				.auth().oauth("", "", "", "");
	}

}
