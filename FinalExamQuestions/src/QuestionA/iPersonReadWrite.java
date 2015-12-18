package QuestionA;

import java.util.Date;

public interface iPersonReadWrite extends iPersonRead {
	public static String setFirstName(String FirstName) {
		return FirstName;
	}
	
	public static String setMiddleName(String MiddleName) {
		return MiddleName;
		
	}
	public static String setLastName(String LastName) {
		return LastName;
		
	}
	public static Date setDOB(Date DOB){
		return DOB;
		
	}
	public static String setAddress(String address){
		return address;
	
	}
	public static String setPhoneNumber(String phone_number){
		return phone_number;
		
	}
	public static String setEmail(String email_address){
		return email_address;
	}

}
