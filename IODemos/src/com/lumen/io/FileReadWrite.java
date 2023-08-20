package com.lumen.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReadWrite {
	public static void main(String[] args) {
		//FileReader fileReader = new FileReader(demo.text);
		//FileWriter fileWriter = new FileWriter(trial.txt);
		FileWriter fileWriter=null;
		FileReader fileReader=null;
		try {
			fileWriter=new FileWriter("Trial.txt");
			fileReader=new FileReader("demo.txt");
			int num = fileReader.read();
			fileWriter.write((char)num);
			do {
				num=fileReader.read();
				fileWriter.write((char)num);
			}while(num!=-1);
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(fileWriter!=null)
					fileWriter.close();
				if(fileReader!=null)
					fileReader.close();
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}

}
