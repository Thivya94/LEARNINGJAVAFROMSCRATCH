package ControlStatements;

import java.util.Scanner;

public class practicePrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practicePrograms ifcs=new practicePrograms();
		ifcs.checkPositiveOrNegative();
		ifcs.findGreatest();
		String value=ifcs.findWeekday();
		System.out.println(value);
		ifcs.forlabel();
		ifcs.foreachvalidation();
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
	public void forlabel() {
		firstloop:
		for(int i=0;i<=10;i++) {
			System.out.println(i);
			secondloop:
				for(int j=0;j<=10;j++) {
					System.out.println(j);
					if(j==3) {
						continue firstloop;
					}
					if(j==1) {
						continue secondloop;
					}
					if(j==2) {
						break secondloop;
					}
							
				}
			
		}
	}
	
	public void foreachvalidation() {
		String[] names= {"latha","liya","shreya","surya","preetha","ishwarya","ashwin"};
		for(String name : names){
			System.out.println(name);
		}
		char[] letters= {'a','e','i','o','u'};
		for(char letter:letters) {
			System.out.println(letter);
		}
		Scanner sc=new Scanner(System.in);
		String[] getvaluesfromuser= {sc.next(),sc.next(),sc.next(),sc.next()};
		for(String values:getvaluesfromuser) {
			System.out.println(values);
		}
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
