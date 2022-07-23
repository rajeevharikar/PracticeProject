package httpmethods;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;


public class RequestSpec {
	
	RequestSpecification requestspec;
	
	@BeforeClass
	public void setspecifications()
	{
		requestspec= RestAssured.given()
	    .baseUri("")
	    .basePath("")
	    .accept(ContentType.JSON)
	    .auth().oauth("", "", "", "");
	}
	
	
	@Test
	public void getAllBookings()
	{
		RestAssured.given().spec(requestspec)
		.when()
		.get("")
		.then()
		.statusCode(200);
	}
	@Test
	public void gettestbooking()
	{
		RestAssured.given(requestspec)
		.when()
		.get("")
		.then()
		.statusCode(200);
	}
	
	
	@Test(description="using request spec builder")
	public void gettestbooking1()
	{
		RequestSpecBuilder specbuilder= new RequestSpecBuilder();
				specbuilder.setBaseUri("");
				specbuilder.setBasePath("");
				specbuilder.setAuth(null);
				RequestSpecification specification = specbuilder.build();
				
				
				RestAssured.given()
				.spec(specification).get();
		
		
	}


}
