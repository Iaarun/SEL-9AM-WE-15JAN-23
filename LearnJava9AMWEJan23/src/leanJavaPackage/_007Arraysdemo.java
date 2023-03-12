package leanJavaPackage;

import java.util.Arrays;
import java.util.Scanner;

public class _007Arraysdemo {
	public static void main(String[] args) {
		_007Arraysdemo ad = new _007Arraysdemo();
		ad.twodimentionalArray();
	}
	
	public void createArraywithuserInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		int []arr = new int[size];
		
		System.out.println("Enter "+size+ " data in array");
		for(int i=0; i<=size-1; i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	public void arrayDemo() {
		// datatype[] identifier= new datatype[size];
		//declaration of array
		int  arr[] ;
		//initialization of array
		arr= new int [1000];
		
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		Arrays.fill(arr, 100);
		System.out.println(Arrays.toString(arr));
		
		System.out.println(arr.length);
		
	   System.out.println(arr[0]);
	   System.out.println(arr[2]);
	   //store data into array
	   arr[0]=70;
	   arr[1]=32;
	   arr[2]=45;
	   arr[3]=20;
	   arr[4]=21;
	   System.out.println(Arrays.toString(arr));
	//  System.out.println(arr[5]);
	  Arrays.sort(arr);
	  System.out.println(Arrays.toString(arr));
	  
	  //iterate using for loop
	  for(int i=0; i<=arr.length; i++) {
		  System.out.println(arr[i]);
	  }
	  System.out.println("====");
	  //enhance for loop
	  for(int ele:arr) {
		  System.out.println(ele);
	  }
	  
	}
	
	public void findlargestofArray() {
		 int [] arr = {0,15,545,84,54};
		 
		 int largestele=Integer.MIN_VALUE;
		 for(int i=0; i<arr.length; i++) {
			 if(arr[i]>largestele) {
				 largestele=arr[i];
			 }
		 }
		 
		 System.out.println(largestele);
	}
	
	public void sumofallElementsofArray() {
		int [] arr = {10,20,30,40};
		int sum=0;
		
		for (int i =0 ; i<arr.length; i++) {
			sum =sum+arr[i];
		}
		
		System.out.println(sum);
	}

	
	public void twodimentionalArray() {
		int arr[][] = new int[3][3];
		
		System.out.println(arr);
		
	System.out.println(Arrays.toString(arr));
	
	System.out.println(arr.length);
	System.out.println(arr[0].length);
	
	arr[0][0]=10;
	arr[0][1]=11;
	arr[0][2]=12;
	arr[1][0]=21;
	arr[1][1]=22;
	arr[1][2]=23;
	arr[2][0]=31;
	arr[2][1]=32;
	arr[2][2]=33;
	
	for(int i=0; i<arr.length; i++) {
		for(int j=0; j<arr[0].length; j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println(); 
		
	}
	}
}
