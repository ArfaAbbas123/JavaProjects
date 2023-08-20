package com.io.serial;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
class Emp{}

public class DeSerialDemo {
	
	public static void main(String[] args) {
//		Student student=new Student();
//		student.setStudentName("Arfa");
//		student.setStudentId(101);
//		student.setDepartment("CSE");
		
		//DESERIALIZE 
		try(FileInputStream fileInputStream=new FileInputStream("Stud.ser");
			ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);){
			
			Student student = (Student)objectInputStream.readObject();
			System.out.println(student);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
