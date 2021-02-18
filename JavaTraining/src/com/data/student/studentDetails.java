package com.data.student;


import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;


class Student {
	


	private String name;
	private int id;
	private String department;
	private String address;
	private Date dateOfBirth;
	private String phoneNumer;
	

	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(final int id) {
		this.id = id;
	}
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public String toString() {
        return " \n StudentName = " + getName() + ",\n StudentID = " + getId() + ",\n Department = " + getDepartment() + ",\n Address = " +getAddress();
    }


}






public class studentDetails {

	public static void main(String[] args) throws IOException {
		
		final Student student = new Student();

		
		
		
		  Scanner s = new Scanner(new File(".\\configuration\\Read.txt"));
		  String name = s.nextLine();
		  int id = s.nextInt();
		  String department = s.next();
		  String address = s.next();
		  String dateOfBirth = s.next();
		  
		  s.close();
		  
/*		  System.out.println(name);
		  System.out.println(id);
		  System.out.println(department);
		  System.out.println(address);
		  System.out.println(dateOfBirth);
	*/
		 
	    
	     student.setName(name);
	   
	     student.setId(id);
	     student.setDepartment(department);
	     student.setAddress(address);
	 //   student.setDateOfBirth(dateOfBirth);
	    
	     System.out.println(student.toString());
	    
	 
	    
		  
		  
	
	}
}

