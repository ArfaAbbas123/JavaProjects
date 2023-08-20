package com.lumen.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReadLine {

	public static void main(String[] args) {
		InputStreamReader reader = new InputStreamReader(System.in);
		//create an object of BufferedRead
		BufferedReader bufferedreader = new BufferedReader(reader);
		
		try {
			char value = (char)bufferedreader.read();
			System.out.print(value);
			while(value!='q') {
				value = (char)bufferedreader.read();
			 System.out.print
			 (value);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
