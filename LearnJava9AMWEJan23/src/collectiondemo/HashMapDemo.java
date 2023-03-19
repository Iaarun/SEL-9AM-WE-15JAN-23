package collectiondemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMapDemo hd = new HashMapDemo();
		hd.hashmapiterate();
	}
	
	public void hashmapBasic() {
		HashMap<Integer, String> hmap = new HashMap<>();
		hmap.put(101, "User1");
		hmap.put(102, "User2");
		hmap.put(103, "User3");
		hmap.put(104, "User4");
		
		System.out.println(hmap);
		
		System.out.println(hmap.get(104));
		System.out.println(hmap.getOrDefault(105, "User5"));
		System.out.println(hmap.size());
		
		 System.out.println(hmap.containsKey(105));
		 System.out.println(hmap.containsValue("User4"));
		 
		 hmap.putIfAbsent(105, "test4");
		 System.out.println(hmap);
		 
	//	System.out.println(hmap.remove(105));
		System.out.println(hmap.remove(104, "test4"));
		 
		HashMap<Integer, String> hmap1 = new HashMap<>();
		hmap1.put(201, "User1");
		hmap1.put(202, "User2");
		hmap1.put(203, "User3");
		hmap1.put(204, "User4");
		
		hmap.putAll(hmap1);
		
		System.out.println(hmap);
		
	}

	
	public void hashmapiterate() {
		HashMap<Integer, String> hmap1 = new HashMap<>();
		hmap1.put(201, "User1");
		hmap1.put(202, "User2");
		hmap1.put(203, "User3");
		hmap1.put(204, "User4");
		
	 	System.out.println("===Iterate over keys===");
	 	
	 	for(int x: hmap1.keySet()) {
	 		System.out.print(x+" ");
	 	}
	 	
	 	System.out.println();
	 	System.out.println("===Iterate over Value===");
	 	
	 	for(String x: hmap1.values()) {
	 		System.out.print(x+" ");
	 	}
	 	System.out.println();
	 	System.out.println("===Iterate over key Value pair===");
	 	
		
	 	for(Entry<Integer, String> entry: hmap1.entrySet()) {
	 		System.out.println(entry.getKey()+">>"+entry.getValue());
	 	}
	 	
	 	System.out.println();
	 	System.out.println("===Iterate using for each with lambda===");
		
	 	hmap1.forEach((k,v)-> {
	 		System.out.println(k+"||"+v);
	 	});
	 	
	 	System.out.println();
	 	System.out.println("===Iterate using stream===");
	 	hmap1.entrySet().stream().forEach(x->{
	 		System.out.println(x.getKey()+"|"+x.getValue());
	 	});
	 	
	 	System.out.println();
	 	System.out.println("===Iterate using iterator===");
	 	
	    Iterator<Entry<Integer, String>> it=	hmap1.entrySet().iterator();
	    while(it.hasNext()) {
	         Entry x= it.next();
	         System.out.println(x.getKey()+">>"+x.getValue());
	    }
	 	
		
	}
}
