package pojoclasses;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EmployeeSerializationDeserialization {
	
	
	
	public static void main(String args[]) throws JsonProcessingException
	{
		//Serialization
		
		Employee employee= new Employee();
		employee.setFirstname("Raam");
		employee.setLastname("Raaj");
		employee.setAge(35);
		employee.setGender("Male");
		employee.setMarriage(true);
		employee.setSalary(150000.00);
		
		ObjectMapper mapper= new ObjectMapper();
		
		String employJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee);
		System.out.println(employJson);
		
//		deserialization
		
		Employee deserializeEmploy = mapper.readValue(employJson, Employee.class);
		
		System.out.println(deserializeEmploy.getAge() + " " + deserializeEmploy.getFirstname());
		
	}

}
