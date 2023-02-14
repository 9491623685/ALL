package Java;
import java.util.*;

import javax.swing.Spring;
class Student{
	String name;
	int rollno;
	String branch;
}
class Stud1 extends Student
{
	Stud1(String name,int rollno,String branch){
	    this.name=name;
		this.rollno=rollno;
		this.branch=branch;
	}
	
	void printdetails() {
		System.out.println("name="+name);
		System.out.println("rollno="+rollno);
		System.out.println("branch="+branch);
	}
	
public static class Add {
	public static void main(String[] args) {
		Stud1 c=new Stud1("kajal",208,"EEE");
		c.printdetails();
	}
}

}
