package com.lumen.training;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileWrite {
	public static void main(String[] args) {
		try (RandomAccessFile randomFile = new RandomAccessFile("demos.txt", "rw");
			//get the channel from the buffer
			FileChannel channel = randomFile.getChannel();){
			//create the buffer
			ByteBuffer buffer = ByteBuffer.allocate(100);
			
			//add messages and buffer is in write mode
			buffer.put("Welcome to java training!!!!!".getBytes());
			
			//flip the buffer to read mode
			buffer.flip();
			
			//write into channel from buffer
			
			//flip the buffer to write mode
			channel.write(buffer);
			buffer.flip();
			
			//read from channel and write into buffer
			
			channel.read(buffer);
			
			//flip the buffer to read data
			buffer.flip(); //buffer in read mode
			while (buffer.hasRemaining()) {
				char c= (char) buffer.get();
				System.out.print(c);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
 