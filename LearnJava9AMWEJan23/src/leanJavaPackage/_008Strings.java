package leanJavaPackage;

public class _008Strings {
	public static void main(String[] args) {
		_008Strings st = new _008Strings();
		st.stringbasics();
	}

	public void stringbasics() {
		// using string literals
		String str = "Java";
		String str1 = "Java";

		// using new keyword
		String str2 = new String("Java");
		String str3 = new String("JAVA");

		System.out.println(str.length());// 4
		System.out.println(str.charAt(0));// first character
		System.out.println(str.charAt(str.length() - 1));// last character

		System.out.println(str.equals(str3));
		System.out.println(str.equalsIgnoreCase(str3));

		str = "Java";
		String ldata = str.toLowerCase();
		System.out.println(ldata);
		String udata = str.toUpperCase();
		System.out.println(udata);
		// System.out.println(str);

		String nstr = str.concat(" Test");
		System.out.println(nstr);

		System.out.println(str3.compareToIgnoreCase(str));
		
		str ="  this is java    ";
		
		System.out.println(str.indexOf("i"));
		System.out.println(str.lastIndexOf("ja"));
		
	System.out.println(str.contains("jv"));
	System.out.println(str.startsWith("this"));
	System.out.println(str.endsWith("this"));
	System.out.println(str.length());
	System.out.println(str.trim().length());
	
	System.out.println(str.replace("is", "test"));
	
//	str = " ";
	//System.out.println(str.isBlank());
	System.out.println(str.isEmpty());
	
	char[] carr= str.toCharArray();
	for(char x: carr) {
		System.out.print(x+",");
	}
	System.out.println();
	str ="this is java";
	System.out.println(str.substring(4));
	System.out.println(str.substring(4, 7));
	
	String[] sarr=str.split(" ");
	
	for(String x: sarr) {
		System.out.println(x);
	}
	
	// abcxyz@gmail.com      abcxyz
      String email = "abcxyz123@outlook.com";
      
     System.out.println(email.split("@")[0]);
    System.out.println(email.substring(0, email.indexOf("@")));
    System.out.println(email.replace(email.substring(email.indexOf("@")), ""));

	}
	
	
}
