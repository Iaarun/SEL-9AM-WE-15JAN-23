package constructorDemo;

import java.util.Scanner;

/*
  default
  non parameterized
  parameterized
 */
public class Box {
	int length;
	int width;
	int height;

	Box(){
		System.out.println("Inside constructor");
	}
	public Box(int length, int width, int height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}

	public static void main(String[] args) {
		 Box box  = new Box();
		 
		 box.length=10;
		 box.width=20;
		 box.height=15;
		 System.out.println(box.length);
		 System.out.println(box.width);
		 System.out.println(box.height);
		 
		 Box box1  = new Box(20, 50, 30);
		 System.out.println(box1.length);
		 System.out.println(box1.width);
		 System.out.println(box1.height);
		 
		 
		 
		 
	}

}
