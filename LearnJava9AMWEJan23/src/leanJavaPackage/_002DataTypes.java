package leanJavaPackage;

public class _002DataTypes {

	public static void main(String[] args) {
		typecasting();
	}

	public static void primitivetype() {
		byte age = 127;
		System.out.println(age);
		System.out.println(Integer.toBinaryString(age));
		short sh = 128;
		System.out.println(sh);
		System.out.println(Integer.toBinaryString(sh));
		
		int salary = 1584515;
		long lg = 458518484515484515l;
		float fl = 215.5415f;
		double db = 1548515.5419489151848;
		
		boolean flag = false;
		
		char ch = '.';
	}
	
	public static void nonPrimitivetype() {
		String name = "A";
	}
	
	public static void typecasting() {
		 byte by = 45;
		 //implicit 
		 
		 int var1 = by;
		 System.out.println(by);
		 System.out.println(var1);
		 //implicit
		 float fl = var1;
		 System.out.println(fl);
		 
		 //explicit
		 double dvar = 181518.0;
		 
		 float fvar= (float)dvar;
		 
		 System.out.println(dvar);
		 System.out.println(fvar);
		 
		 int ivar = (int)fvar;
		 System.out.println(ivar);
		 
	}

}
