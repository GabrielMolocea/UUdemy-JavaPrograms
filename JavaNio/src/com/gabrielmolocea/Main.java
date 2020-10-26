package com.gabrielmolocea;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.charset.*;
import java.nio.file.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	    try(FileOutputStream binFile = new FileOutputStream("data.dat");
            FileChannel binChannel = binFile.getChannel()) {
	        
	        byte[] outputBytes = "Hello World!".getBytes();
            ByteBuffer buffer = ByteBuffer.wrap(outputBytes);
            int numBytes = binChannel.write(buffer);
            System.out.println("numBytes written was: " + numBytes);
            
            ByteBuffer intBuffer = ByteBuffer.allocate(Integer.BYTES);
            intBuffer.putInt(245);
            intBuffer.flip();
            numBytes = binChannel.write(intBuffer);
            System.out.println("numBytes written was: " + numBytes);
        
            intBuffer.flip();
            intBuffer.putInt(-98765);
            intBuffer.flip();
            numBytes = binChannel.write(intBuffer);
            System.out.println("numBytes written was: " + numBytes);
        
//            /**
//             * Read form data.dat file using Random access file class
//             */
//            RandomAccessFile randomAccessFile = new RandomAccessFile("data.dat", "rwd");
//            byte[] bytesArray = new byte[outputBytes.length];
//            randomAccessFile.read(bytesArray);
//            System.out.println(new String(bytesArray));
//
//            long int1 = randomAccessFile.readInt();
//            long int2 = randomAccessFile.readInt();
//            System.out.println(int1);
//            System.out.println(int2);
//
            /**
             * Reading from data.dat file using NIO
             */
            RandomAccessFile randomAccessFile = new RandomAccessFile("data.dat", "rwd");
            FileChannel channel = randomAccessFile.getChannel();
            outputBytes[0] = 'a';
            outputBytes[1] = 'b';
            buffer.flip();
            long numBytesRead = channel.read(buffer);
            if (buffer.hasArray()) {
                System.out.println("byte buffer  = " + new String(buffer.array()));
            }
//          AbsolutRead
            intBuffer.flip();
            numBytes = channel.read(intBuffer);
            System.out.println(intBuffer.getInt(0));
            intBuffer.flip();
            numBytes = channel.read(intBuffer);
            System.out.println(intBuffer.getInt(0));
            
//            RelativeRea
//            intBuffer.flip();
//            numBytesRead = channel.read(intBuffer);
//            intBuffer.flip();
//            System.out.println(intBuffer.getInt());
//            intBuffer.flip();
//            numBytesRead = channel.read(intBuffer);
//            intBuffer.flip();
//            System.out.println(intBuffer.getInt());
            channel.close();
            randomAccessFile.close();
            
//            System.out.println("outputBytes = " + new String(outputBytes));
            
        
        } catch (IOException e) {
	        e.printStackTrace();
        }
    }
}
