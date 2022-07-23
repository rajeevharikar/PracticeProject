package pojoclasses;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CreateNestedJSONFromPOJOClasses {
	
	public static void main(String[] args) throws JsonProcessingException {
		
		NestedPOJO nestedPOJO= new NestedPOJO();
		nestedPOJO.setCompanyName("MSE");
		nestedPOJO.setCompanyHOCity("Benagluru");
		nestedPOJO.setCompanyCEO("Raam");
		
		List<String> bankNames= new ArrayList<String>();
		bankNames.add("HDFC");
		bankNames.add("SBI");
		bankNames.add("ICICI");
		bankNames.add("Canara");
		nestedPOJO.setSupportedSalaryBanks(bankNames);
		
		List<Integer> pincodes= new ArrayList<Integer>();
		pincodes.add(560081);
		pincodes.add(560078);
		pincodes.add(560068);
		nestedPOJO.setPincodesOfCityOffice(pincodes);
		
		Employee raam = new Employee();
		Employee employee= new Employee();
		employee.setFirstname("Raam");
		employee.setLastname("Raaj");
		employee.setAge(35);
		employee.setGender("Male");
		employee.setMarriage(true);
		employee.setSalary(150000.00);

		Employee ganesh = new Employee();
		ganesh.setFirstname("Ganesh");
		ganesh.setLastname("Ganapati");
		ganesh.setAge(35);
		ganesh.setGender("Male");
		ganesh.setMarriage(true);
		ganesh.setSalary(150000.00);
		
		List<Employee> listOfEmployees= new ArrayList<Employee>();
		listOfEmployees.add(raam);
		listOfEmployees.add(ganesh);
		nestedPOJO.setEmploylist(listOfEmployees);
		
		Contractors seema = new Contractors();
		seema.setFirstName("Seema");
		seema.setLastName("Singh");
		seema.setContractFrom("Jan-2019");
		seema.setContractTo("JAN-2025");
		
		Contractors hari = new Contractors();
		hari.setFirstName("Hari");
		hari.setLastName("Prasad");
		hari.setContractFrom("Jan-2017");
		hari.setContractTo("JAN-2030");
		
		List<Contractors> allContractors = new ArrayList<Contractors>();
		allContractors.add(seema);
		allContractors.add(hari);
		nestedPOJO.setContractorslist(allContractors);
		
		CompanyPFDeails companyPFDeails = new CompanyPFDeails();
		companyPFDeails.setPfName("Raaj");
		companyPFDeails.setPfCity("Benagluru");
		companyPFDeails.setPfYear(2012);
		companyPFDeails.setNoOfEmployees(10);
		nestedPOJO.setPfdetails(companyPFDeails);
		
		ObjectMapper mapper= new ObjectMapper();
	       String finalJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(nestedPOJO);
	       
		   System.out.println(finalJson);
	}
	
       
}
