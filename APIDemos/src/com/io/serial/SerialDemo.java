package com.io.serial;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerialDemo {
	public static void main(String[] args) {
		Student student = new Student();
		student.setStudentName("Arfa");
		student.setStudentId(10);
		student.setDepartment("CSE");
		
		//serialize 
		try(FileOutputStream fileOutputStream = new FileOutputStream("stud.ser");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);){
			
			objectOutputStream.writeObject(student);
		}catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
	}

}
