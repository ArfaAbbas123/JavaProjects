package com.lumen.training;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileRead {
	public static void main(String[] args) throws Exception {
		//Create buffer with sixe for reading
		ByteBuffer buffer;
		
		//Create the file for reading
	try(RandomAccessFile randomFile= new RandomAccessFile("demos.txt", "rw");
		FileWriter fileWrite = new FileWriter("trial.txt");
		//get the channel from the file
		FileChannel channel = randomFile.getChannel()){
		//create the buffer with size for reading
		buffer = ByteBuffer.allocate(100);
		
		//read from channel and write it to b
		int bytesRead = channel.read(buffer);//buffer is in write mode
		System.out.println(bytesRead);
		
		//flip the Buffer
		buffer.flip();
		//now buffer is in read mode
		while(buffer.hasRemaining()) {
			//get the data this is in bytes. convert to chars
			char c = (char) buffer.get();
			fileWrite.write((char)c);
//			System.out.print(c);
		}
	}
		catch (Exception e) {
			e.printStackTrace();
		}

}}
