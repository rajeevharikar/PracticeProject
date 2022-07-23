package pojoclasses;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonObjectToMap {
	
	
	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		

		String jsonObject = "{\r\n" + "  \"firstName\": \"Animesh\",\r\n" + "  \"lastName\": \"Prashant\"\r\n" + "}";
		
		ObjectMapper mapper = new ObjectMapper();
		
		Map<String, String> parsedObject = mapper.readValue(jsonObject, new TypeReference<Map<String,String>>() {} );
		
		Set<String> setOfAllKeys = parsedObject.keySet();
		Iterator<String> itr = setOfAllKeys.iterator();
		
		while(itr.hasNext()) {
			
		String value = parsedObject.get(itr.next());
			
			System.out.println(value);
		}
		
		for(String keys: setOfAllKeys)
		{
			System.out.println(parsedObject.get(keys));
		}
		
	}
		

}
