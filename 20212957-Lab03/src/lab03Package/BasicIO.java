package lab03Package;
import java.util.*;

//An exploration of basic input and output.
class BasicIO {
	
	//Reads and processes string input.
	public static void main(String[] args) {
		
		Scanner studin = new Scanner(System.in);
		
		//get first input
		System.out.print("Enter your name: ");
		String name = studin.nextLine();
		
		//get second input
		System.out.print("Enter your age: ");
		int years = studin.nextInt();
		
		//get height
		System.out.print("Enter your height: ");
		int height = studin.nextInt();
		
		//display output on console
		System.out.println("your name is " + name +" and your age is " + years);
		System.out.println("your age is " + years*365 + " days");
		System.out.println("your height is " + height);
		System.out.printf("2021년 9월 17일 현재 %s(%d)의 키는 %dcm 입니다.", name, years, height);
	} //method main

} // class BASIC_IO
