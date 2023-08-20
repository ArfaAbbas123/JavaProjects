package com.lumen.training;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class GatheredWrite {
	public static void main(String[] args) throws Exception{
		//create the file
		try(RandomAccessFile randomFile = new RandomAccessFile("demos.txt", "rw");
				//get the channel from file
			FileChannel channel = randomFile.getChannel();){
			
			//create the buffer
			ByteBuffer buffer1= ByteBuffer.allocate(20);
			ByteBuffer buffer2= ByteBuffer.allocate(100);
			
			//add message and buffer is in write mode
			buffer1.put("First data is out".getBytes());
			buffer2.put("Second data still waiting".getBytes());
			//create a ByteBuffer Array
			ByteBuffer[] byteArray = {buffer1,buffer2};
			buffer1.flip();
			buffer2.flip();
			//read from buffer into channel
			channel.write(byteArray);
			System.out.println();
			
		}
		
	}

}
