package apiTestpackages;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class APIPayload {
	
	public LinkedHashMap<String, Object> employeePayload(String firstname, String lastname, String email) {
		LinkedHashMap<String, Object> data = new LinkedHashMap<String, Object>();
		data.put("first_name", firstname);
		data.put("last_name", lastname);
		data.put("email", email);
		return data;
		
		
	}

}
