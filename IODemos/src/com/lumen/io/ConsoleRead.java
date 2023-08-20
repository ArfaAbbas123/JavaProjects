package com.lumen.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleRead {

	public static void main(String[] args) {
		//create an object for converting bytes to characters 
		InputStreamReader reader = new InputStreamReader(System.in);
		//create an object of BufferedRead
		BufferedReader bufferedreader = new BufferedReader(reader);
		String value;
		try {
			value = bufferedreader.readLine();
			System.out.print(value);
			while(!value.equals("stop")) {
				value = bufferedreader.readLine();
			 System.out.print(value);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
