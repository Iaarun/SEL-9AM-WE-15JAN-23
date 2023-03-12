package collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArraylistDemo {
	
	public static void main(String[] args) {
		ArraylistDemo ad = new ArraylistDemo();
		ad.iterateoverlist();
	}
	public void wrapperclassdemo() {
		int a = 10;
		//autoboxing
		Integer i = a;
		Integer i1 = new Integer(a);
		
		//unboxing
		int b = i1;
		
	}
	
	public void arrayListbasic() {
		
//		ArrayList<Integer> li1 = new ArrayList<Integer>();
		//initial capacity of list is 16 loadfactor 0.75
		ArrayList<String> li = new ArrayList<String>(5);
		
		//to add data use add function
		li.add("test1");
		li.add("test2");
		li.add("test3");
		li.add("test4");
		
		System.out.println(li);
		System.out.println(li.size());
		System.out.println(li.get(3));
		li.add("test5");
		System.out.println(li);
		li.add(0, "test0");
		System.out.println(li);
		li.set(0, "TEST0");
		li.set(3, "TEST0");
		System.out.println(li);
		System.out.println(li.isEmpty());
		System.out.println(li.contains("TEST0"));
		System.out.println(li.indexOf("TEST0"));
		System.out.println(li.lastIndexOf("TEST0"));
		
		System.out.println(li.subList(1, 5));
		
		li.remove(0);
		li.remove("TEST0");
		
		
ArrayList<String> li1 = new ArrayList<String>(5);
		
		//to add data use add function
		li1.add("user1");
		li1.add("user2");
		li1.add("user3");
		
		
		li.addAll(0,li1);
		System.out.println(li);
		li.removeAll(li1);
		System.out.println(li);
		
	
		
	}

	public void iterateoverlist() {
        ArrayList<String> li = new ArrayList<String>(5);
		li.add("test1");
		li.add("test2");
		li.add("test3");
		li.add("test4");
		li.add("test4");
		li.add("test4");
		
		System.out.println("====Iterate using for loop==== ");
		
		for(int i=0 ; i<=li.size()-1; i++) {
			System.out.print(li.get(i)+" ");
		}
		System.out.println();
		System.out.println("====Iterate using enhance for loop==== ");
		for(String a: li) {
			System.out.print(a+" ");
		}
		
		System.out.println();
		System.out.println("====Iterate using enhance for each function with lambda operator==== ");
		
		li.forEach(ele->{
			System.out.print(ele+" ");
		});
		
		System.out.println();
		System.out.println("====Iterate using stream api==== ");
	      
//		ArrayList<String> uli = new ArrayList<>();
//		for(String x: li) {
//			if(!uli.contains(x)) {
//				uli.add(x);
//			}
//		}
//		System.out.println(uli);
//		List<String> uli1 = new ArrayList<>();
//		uli1= li.stream().distinct().collect(Collectors.toList());
//		System.out.println(uli1);
		
		li.stream().forEach(ele->{
			System.out.print(ele+" ");
		});
		
		System.out.println();
		System.out.println("====Iterate using iterator==== ");
		
		 Iterator<String> it= li.iterator();
		 while(it.hasNext()) {
			System.out.print(it.next()+" "); 
		 }
		 
		 System.out.println();
		System.out.println("====Iterate using list iterator==== ");
		
		ListIterator<String> lit=  li.listIterator(0);
		
		while(lit.hasPrevious()) {
			System.out.print(lit.previous()+" ");
		}
		System.out.println();
		while(lit.hasNext()) {
			System.out.print(lit.next()+" ");
		}
	}
}
