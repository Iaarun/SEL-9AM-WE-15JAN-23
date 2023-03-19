package collectiondemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSetDemo hd = new HashSetDemo();
		hd.listtoset();
	}

	public void hashSetBasic() {
	//	HashSet<String> hset = new HashSet<>();
		TreeSet<String> hset = new TreeSet();
		hset.add("ctest1");
		hset.add("test2");
		hset.add("test7");
		hset.add("atest8");
		hset.add("test3");
		hset.add("Test4");
		hset.add("test5");
		hset.add("test6");
		hset.add("test5");
		hset.add("test6");
		

		System.out.println(hset);
		System.out.println(hset.size());
		System.out.println(hset.remove("test1"));
		System.out.println(hset);
		System.out.println(hset.contains("test1"));
//		hset.clear();
//		System.out.println(hset);
		
	}
	
	public void iterateOverHashSet() {
		TreeSet<String> hset = new TreeSet();
		hset.add("ctest1");
		hset.add("test2");
		hset.add("test7");
		hset.add("atest8");
		hset.add("test3");
		hset.add("Test4");
		hset.add("test5");
		hset.add("test6");
		hset.add("test5");
		hset.add("test6");
		
		System.out.println("====Iterate using enhance for loop====");
		for(String x: hset) {
			System.out.print(x+" ");
		}
		
		System.out.println();
		System.out.println("====Iterate using foreach with lambda operator====");
		
		hset.forEach(x->{
			System.out.print(x+" ");
		});
		
		System.out.println();
		System.out.println("====Iterate using stream api====");
		
		hset.stream().forEach(x->{
			System.out.print(x+" ");
		});
		
		System.out.println();
		System.out.println("====Iterate using iterator====");
		
		  Iterator<String> it=    hset.iterator();
		  
		  while(it.hasNext()) {
			  System.out.print(it.next());
		  }
		  
		
	}
	
	public void listtoset() {
		 ArrayList<String> li = new ArrayList<String>(5);
			li.add("test1");
			li.add("test2");
			li.add("test3");
			li.add("test4");
			li.add("test4");
			li.add("test4");
			
			System.out.println(li);
			
		List<String>dli=	li.stream().distinct().collect(Collectors.toList());
		System.out.println(dli);
		
		LinkedHashSet<String> dset = new LinkedHashSet<>(li);
		System.out.println(dset);
			
	}

}
