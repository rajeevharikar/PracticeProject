package utils;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

public class VerifyimageActive {
	
	public static Boolean verifyimageActive(String url) throws IOException {
		
		HttpClient client = HttpClientBuilder.create().build();
		
		HttpGet request= new HttpGet(url);
		HttpResponse response = client.execute(request);
		
		if(response.getStatusLine().getStatusCode()!=200) {
			
			return false;
		
	}else
	{
		return true;
	}
	}
}
