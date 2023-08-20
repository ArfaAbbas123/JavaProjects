package com.lumen.training;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ScatterReads {
	public static void main(String[] args) throws Exception {
		try (RandomAccessFile randomFile = new RandomAccessFile("demos.txt", "rw");
				//get the channel from the buffer
				FileChannel channel = randomFile.getChannel();){
				//create two buffer
				ByteBuffer buffer1 = ByteBuffer.allocate(2);
				ByteBuffer buffer2 = ByteBuffer.allocate(100);
				
				//create a ByteArray Array
				ByteBuffer[] byteArray = {buffer1,buffer2};
				
				//read from channel into buffer
				channel.read(byteArray);
				System.out.println();
				buffer1.flip();
				buffer2.flip();
				while(buffer1.hasRemaining()) {
					System.out.print((char) buffer1.get());
				}
				System.out.println();
				while(buffer2.hasRemaining()) {
					System.out.print((char) buffer2.get());
				}
		}	
	}

}
