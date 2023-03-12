package collectiondemo;

import java.util.HashSet;

public class HashSetDemo {
	
	public static void main(String[] args) {
		HashSetDemo hd = new HashSetDemo();
		hd.hashSetBasic();
	}
	
	public void hashSetBasic() {
	     HashSet<String> hset = new HashSet<>();
	     hset.add("test1");
	     hset.add("test2");
	     hset.add("test3");
	     hset.add("test4");
	     
	     System.out.println(hset);
	   System.out.println(hset.size());
	   
	}

}
