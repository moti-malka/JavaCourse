package SqlPachage;

public class Emploeey {
	
	
	private String FirstName;
	private String Address;
	private String HomePhone;
	private String City;
	
	public Emploeey(String firstName, String address, String homePhone, String city) {
		FirstName = firstName;
		Address = address;
		HomePhone = homePhone;
		City = city;
	}

	@Override
	public String toString() {
		return "Emploeey name =" + FirstName + '\n'+
				"Emploeey Address =" + Address +'\n'+
				"Emploeey HomePhone=" + HomePhone +'\n'+
				 "Emploeey City="+ City + "";
	}
	
	
	
	

	
}
