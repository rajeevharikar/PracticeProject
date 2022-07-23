package pojoclasses;

import java.util.List;

public class NestedPOJO {
	
	private String companyName;
	private String companyHOCity;
	private String companyCEO;
	private List<String> supportedSalaryBanks;
	private List<Integer> pincodesOfCityOffice;
	private List<Employee> employlist;
	private List<Contractors> contractorslist;
	private CompanyPFDeails pfdetails;
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyHOCity() {
		return companyHOCity;
	}
	public void setCompanyHOCity(String companyHOCity) {
		this.companyHOCity = companyHOCity;
	}
	public String getCompanyCEO() {
		return companyCEO;
	}
	public void setCompanyCEO(String companyCEO) {
		this.companyCEO = companyCEO;
	}
	
	public List<String> getSupportedSalaryBanks() {
		return supportedSalaryBanks;
	}
	
	public void setSupportedSalaryBanks(List<String> supportedSalaryBanks)
	{
		this.supportedSalaryBanks=supportedSalaryBanks;
	}
	
	public List<Integer> getPincodesOfCityOffice()
	{
		return pincodesOfCityOffice;
	}
	
	public void setPincodesOfCityOffice(List<Integer> pincodesOfCityOffice) {
		this.pincodesOfCityOffice= pincodesOfCityOffice;
		
	}
	
	public List<Employee> getEmploylist()
	{
		return employlist;
	}
	
	public void setEmploylist(List<Employee> employlist) {
		this.employlist=employlist;
	}
	public List<Contractors> getContractorslist() {
		return contractorslist;
	}
	public void setContractorslist(List<Contractors> contractorslist) {
		this.contractorslist = contractorslist;
	}
	public CompanyPFDeails getPfdetails() {
		return pfdetails;
	}
	public void setPfdetails(CompanyPFDeails pfdetails) {
		this.pfdetails = pfdetails;
	}
	
	
	

}
