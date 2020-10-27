package com.gabrielmolocea;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.charset.*;
import java.nio.file.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        try (FileOutputStream binFile = new FileOutputStream("data.dat");
             FileChannel binChannel = binFile.getChannel()) {
            
            ByteBuffer buffer = ByteBuffer.allocate(100);
            
            // Chaining multiple .put to a single buffer
//            byte[] outputBytes = "Hello World!".getBytes();
//            byte[] outputBytes2 = "Nice to meet you".getBytes();
//            buffer.put(outputBytes).putInt(245).putInt(-98765).put(outputBytes2).putInt(1000);
//            buffer.flip();


//            // Writhing to buffer
            byte[] outputBytes = "Hello World!".getBytes();
            buffer.put(outputBytes);
            long int1Pos = outputBytes.length;
            
            buffer.putInt(245);
            long int2Pos = int1Pos + Integer.BYTES;
            
            buffer.putInt(-98765);
            // Adding new text vale and numeric value to file -> "data.dat"
            byte[] outputBytes2 = "Nice to meet you".getBytes();
            buffer.put(outputBytes2);
            long int3Pos = int2Pos + Integer.BYTES + outputBytes2.length;
            
            buffer.putInt(1000);
            buffer.flip();
            //Write to FileChannel
            binChannel.write(buffer);
            
            // Reading with buffer in a single buffer
            
            RandomAccessFile randomAccessFile = new RandomAccessFile("data.dat", "rwd");
            FileChannel channel = randomAccessFile.getChannel();
            
            ByteBuffer readBuffer = ByteBuffer.allocate(100);
            channel.read(readBuffer);
            // flip() method is used in this case for switching form writhing to reading
            readBuffer.flip();
            byte[] inputString = new byte[outputBytes.length];
            readBuffer.get(inputString);
            System.out.println("inputString = " + new String(inputString));
            System.out.println("int1 = " + readBuffer.getInt());
            System.out.println("int2 = " + readBuffer.getInt());
            byte[] inputString2 = new byte[outputBytes2.length];
            readBuffer.get(inputString2);
            System.out.println("inputString2 = " + new String(inputString2));
            System.out.println("int3 = " + readBuffer.getInt());
            
            
//            ByteBuffer buffer = ByteBuffer.allocate(outputBytes.length);
//            buffer.put(outputBytes);
//            buffer.flip();
//
//            int numBytes = binChannel.write(buffer);
//            System.out.println("numBytes written was: " + numBytes);
//
//            // Adding a int value to data.dat
//            ByteBuffer intBuffer = ByteBuffer.allocate(Integer.BYTES);
//            intBuffer.putInt(245);
//            intBuffer.flip();
//            numBytes = binChannel.write(intBuffer);
//            System.out.println("numBytes written was: " + numBytes);
//            // Adding another value to data.dat
//            intBuffer.flip();
//            intBuffer.putInt(-98765);
//            intBuffer.flip();
//            numBytes = binChannel.write(intBuffer);
//            System.out.println("numBytes written was: " + numBytes);
//
////            /**
////             * Read form data.dat file using Random access file class in IO
////             */
////            Reading String from data.dat file
////
////            RandomAccessFile randomAccessFile = new RandomAccessFile("data.dat", "rwd");
////            byte[] bytesArray = new byte[outputBytes.length];
////            randomAccessFile.read(bytesArray);
////            System.out.println(new String(bytesArray));
////            Reading int values from data.dat
////
////            long int1 = randomAccessFile.readInt();
////            long int2 = randomAccessFile.readInt();
////            System.out.println(int1);
////            System.out.println(int2);
////
//            /**
//             * Reading from data.dat file using NIO
//             */
//            RandomAccessFile randomAccessFile = new RandomAccessFile("data.dat", "rwd");
//            FileChannel channel = randomAccessFile.getChannel();
//            outputBytes[0] = 'a';
//            outputBytes[1] = 'b';
//            buffer.flip();
//            long numBytesRead = channel.read(buffer);
//            if (buffer.hasArray()) {
//                System.out.println("byte buffer  = " + new String(buffer.array()));
////                System.out.println("byte buffer =  " + new String(outputBytes));
//            }
////          AbsolutRead
//            intBuffer.flip();
//            numBytes = channel.read(intBuffer);
//            System.out.println(intBuffer.getInt(0));
//            intBuffer.flip();
//            numBytes = channel.read(intBuffer);
//            intBuffer.flip();
//            System.out.println(intBuffer.getInt(0));
//            System.out.println(intBuffer.getInt());
//
////            RelativeRea
////            intBuffer.flip();
////            numBytesRead = channel.read(intBuffer);
////            intBuffer.flip();
////            System.out.println(intBuffer.getInt());
////            intBuffer.flip();
////            numBytesRead = channel.read(intBuffer);
////            intBuffer.flip();
////            System.out.println(intBuffer.getInt());
//            channel.close();
//            randomAccessFile.close();
//
////            System.out.println("outputBytes = " + new String(outputBytes));
//
        
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
