package testNgpackages;

import org.testng.annotations.DataProvider;

public class MyData {
	@DataProvider(name="data")
	public Object[][] getLogindata() {
		
		Object[][] data = new Object[1][2];
		data[0][0]="cbatest7@gmail.com";
		data[0][1]=123456;
		
		return data;
		
	}

}
