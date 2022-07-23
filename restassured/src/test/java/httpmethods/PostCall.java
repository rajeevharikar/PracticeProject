package httpmethods;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PostCall {
	
	public static void main(String[] args) {
		
		
		RequestSpecification spec = RestAssured.given();
		
		spec.accept(ContentType.JSON);
		spec.body("");
		Response response = spec.post("{{awsurl}}/developerapi/Carts/AddCartItems/{{merchantId}}");
	
		String reponsebody= response.asString();
		
		response.then().statusCode(200);
		
		/*reponse time*/
		
		long timetaken = response.time();
		
		System.out.println(timetaken);
		
		ValidatableResponse valresponse = response.then();
		
		valresponse.time(Matchers.lessThan(1000L));
	}

}
