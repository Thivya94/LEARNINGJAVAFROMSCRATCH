package ControlStatements;

import java.util.Scanner;

public class practicePrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practicePrograms ifcs=new practicePrograms();
		//ifcs.checkPositiveOrNegative();
		//ifcs.findGreatest();
		String value=ifcs.findWeekday();
		System.out.println(value);
	}
	public void checkPositiveOrNegative() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Provide the number");
		int num=sc.nextInt();
		
		if(num<0) {
			System.out.println(num+ " is negative");
		}
		else {
			System.out.println(num+ " is positive");
		}
		//newly added
		sc.close();
	}
	
	public String findWeekday() {
		Scanner sc=new Scanner(System.in);
		int day=sc.nextInt();
		String dayname="";
		switch(day) {
			case 1:dayname="Sunday";break;
			case 2:dayname="Monday";break;
			case 3:dayname="Tuesday";break;
			case 4:dayname="Wednesday";break;
			case 5:dayname="Thursday";break;
			case 6:dayname="Friday";break;
			case 7:dayname="saturday";break;
			default:dayname= "invalid number";break;
					
			
		}sc.close();
		return dayname;
		
	}
	public void findGreatest() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Provide three numbers");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		
		if(n1>n2) {
			if(n1>n3) {
			System.out.println(n1+" is greatest");}
		}
		if((n2>n1) &&(n2>n3)) {
			System.out.println(n2+" is greatest");
		}
		if((n3>n1) &&(n3>n2)) {
			System.out.println(n3+" is greatest");
		}
	}
	
}
