package httpmethods;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Getcall {
	
	public static void main(String[] args) {
		
		
//		RequestSpecification spec = RestAssured.given();
//		
//		spec.baseUri("https://qa.ecom.capillary.in");
//		
//		spec.basePath("developerapi/Carts/Cart/6c57599f-2c43-4c82-806a-e07c3410f5d3");
//		
//		spec.auth().oauth("8NRQNCMW","BQ5Q98DOPDLD3MBASW3BXGEI","","");
//		spec.accept(ContentType.JSON);
//		spec.header("AccessToken","karoy5sxvgpx0iuevczaofwf");
//		Response response = spec.get();
//		
//		String str = response.asString();
//		System.out.println(str);
		
		
		
		Response response = RestAssured.given()
		.baseUri("https://restful-booker.herokuapp.com")
		.when()
		.basePath("/booking")
		.header("","")
		.accept("")
		.queryParam("", "")
		.auth().oauth("", "", "", "")
		.log().all()
		.get();
		
		String str = response.asString();
		System.out.println(str);
		
		response.then().body("bookingid[2]", Matchers.equalTo(2));	
		
	}

}
