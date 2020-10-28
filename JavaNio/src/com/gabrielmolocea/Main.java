package com.gabrielmolocea;

import javafx.beans.binding.*;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;


public class Main {
    
    public static void main(String[] args) {
    
        try {
            Pipe pipe = Pipe.open();
            
            Runnable writer = new Runnable() {
                @Override
                public void run() {
                    try {
                        Pipe.SinkChannel sinkChannel = pipe.sink();
                        ByteBuffer buffer = ByteBuffer.allocate(56);
                        
                        for (int i = 0; i < 10; i++) {
                            String currentTime = "The time is: " + System.currentTimeMillis();
                            
                            buffer.put(currentTime.getBytes());
                            buffer.flip();
                            
                            while (buffer.hasRemaining()) {
                                sinkChannel.write(buffer);
                            }
                            buffer.flip();
                            Thread.sleep(100);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            };
            
            Runnable reader = new Runnable() {
                @Override
                public void run() {
                    try {
                        Pipe.SourceChannel sourceChannel = pipe.source();
                        ByteBuffer buffer = ByteBuffer.allocate(56);
                        
                        for (int i = 0; i < 10; i++) {
                            int bytesRead = sourceChannel.read(buffer);
                            byte[] timesString = new byte[bytesRead];
                            buffer.flip();
                            buffer.get(timesString);
                            System.out.println("Reader Thread: " + new String(timesString));
                            buffer.flip();
                            Thread.sleep(100);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            };
            
            new Thread(writer).start();
            new Thread(reader).start();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    
//        try (FileOutputStream binFile = new FileOutputStream("data.dat");
//             FileChannel binChannel = binFile.getChannel()) {
//
//            ByteBuffer buffer = ByteBuffer.allocate(100);
//
            // Chaining multiple .put to a single buffer
//            byte[] outputBytes = "Hello World!".getBytes();
//            byte[] outputBytes2 = "Nice to meet you".getBytes();
//            buffer.put(outputBytes).putInt(245).putInt(-98765).put(outputBytes2).putInt(1000);
//            buffer.flip();


//            // Writhing to buffer
//            byte[] outputBytes = "Hello World!".getBytes();
//            buffer.put(outputBytes);
//            long int1Pos = outputBytes.length;
//
//            buffer.putInt(245);
//            long int2Pos = int1Pos + Integer.BYTES;
//
//            buffer.putInt(-98765);
//            // Adding new text vale and numeric value to file -> "data.dat"
//            byte[] outputBytes2 = "Nice to meet you".getBytes();
//            buffer.put(outputBytes2);
//            long int3Pos = int2Pos + Integer.BYTES + outputBytes2.length;
//
//            buffer.putInt(1000);
//            buffer.flip();
//            //Write to FileChannel
//            binChannel.write(buffer);
//
//            // Reading with buffer in a single buffer
//
//            RandomAccessFile randomAccessFile = new RandomAccessFile("data.dat", "rwd");
//            FileChannel channel = randomAccessFile.getChannel();
//
//            /*
//              Allocating to readBuffer(ByteBuffer) a Integer space
//              Then we start in reverse order with int3Pos
//              and read from channel
//             */
//            ByteBuffer readBuffer = ByteBuffer.allocate(Integer.BYTES);
//            channel.position(int3Pos);
//            channel.read(readBuffer);
//            readBuffer.flip();
//            System.out.println("int3 = " + readBuffer.getInt());
//
//            // Second integer to read (int2Pos)
//            readBuffer.flip();
//            channel.position(int2Pos);
//            channel.read(readBuffer);
//            readBuffer.flip();
//            System.out.println("int2 = " + readBuffer.getInt());
//
//            // Last integer to read (int1Pos)
//            readBuffer.flip();
//            channel.position(int1Pos);
//            channel.read(readBuffer);
//            readBuffer.flip();
//            System.out.println("int1 = " + readBuffer.getInt());
//
//
//            RandomAccessFile copyFile = new RandomAccessFile("datacopy.dat", "rw");
//            FileChannel copyChannel = copyFile.getChannel();
//            // When using transferFrom 3 parameters are mandatory to input
//            // 1. Channel that we are using
//            // 2. Start position. In this case we start form 0
//            // 3. End position. In this case channel size
//            channel.position(0);
//            //long numTransferred = copyChannel.transferFrom(channel, 0, channel.size());
//            long numTransferred = channel.transferTo(0, channel.size(), copyChannel);
//            System.out.println("Num transferred = " + numTransferred);
//
//            channel.close();
//            randomAccessFile.close();
//            copyChannel.close();

//
//            // Writing in a random order
//            byte[] outputStream = "Hello, Word!".getBytes();
//            long str1Pos = 0;
//            long newInt1Pos = outputStream.length;
//            long newInt2Pos = newInt1Pos + Integer.BYTES;
//            byte[] outputStream2 = "Nice to meet you".getBytes();
//            long str2Pos = newInt2Pos + Integer.BYTES;
//            long newInt3Pos = str2Pos + outputStream2.length;
//
//            ByteBuffer intBuffer = ByteBuffer.allocate(Integer.BYTES);
//            intBuffer.putInt(245);
//            intBuffer.flip();
//            binChannel.position(newInt1Pos);
//            binChannel.write(intBuffer);
//
//            intBuffer.flip();
//            intBuffer.putInt(-98765);
//            intBuffer.flip();
//            binChannel.position(newInt2Pos);
//            binChannel.write(intBuffer);
//
//            intBuffer.flip();
//            intBuffer.putInt(1000);
//            intBuffer.flip();
//            binChannel.position(newInt3Pos);
//            binChannel.write(intBuffer);
//
//            binChannel.position(str1Pos);
//            binChannel.write(ByteBuffer.wrap(outputStream));
//            binChannel.position(str2Pos);
//            binChannel.write(ByteBuffer.wrap(outputStream2));
//
//            ByteBuffer readBuffer = ByteBuffer.allocate(100);
//            channel.read(readBuffer);
//            // flip() method is used in this case for switching form writhing to reading
//            readBuffer.flip();
//            byte[] inputString = new byte[outputBytes.length];
//            readBuffer.get(inputString);
//            System.out.println("inputString = " + new String(inputString));
//            System.out.println("int1 = " + readBuffer.getInt());
//            System.out.println("int2 = " + readBuffer.getInt());
//            byte[] inputString2 = new byte[outputBytes2.length];
//            readBuffer.get(inputString2);
//            System.out.println("inputString2 = " + new String(inputString2));
//            System.out.println("int3 = " + readBuffer.getInt());
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
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
