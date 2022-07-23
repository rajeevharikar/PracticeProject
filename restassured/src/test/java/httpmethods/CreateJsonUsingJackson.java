package httpmethods;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.node.ObjectNode;


public class CreateJsonUsingJackson {
	
	public static void main(String[] args) throws JsonProcessingException {
	
		ObjectMapper mapper = new ObjectMapper();
		ObjectNode bookingDetails = mapper.createObjectNode();
		bookingDetails.put("fistname", "raam");
		bookingDetails.put("lastname", "ayodya");
		bookingDetails.put("totalprice", "1000");
		
		//printing the created json
		
//		 String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(bookingDetails);
		
	     
	     
	     ObjectNode datedetails = mapper.createObjectNode();
	     
	     datedetails.put("checkin", "2021-07-01");
	     datedetails.put("checkout", "2021-07-02");
	     
	     bookingDetails.set("bookingdates", datedetails);
	     
	     String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(bookingDetails);
	     
	     System.out.println(json);
	     
	     
	     
	     
	}

}
