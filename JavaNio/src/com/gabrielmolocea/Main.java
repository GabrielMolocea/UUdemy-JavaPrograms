package com.gabrielmolocea;

import java.io.*;
import java.nio.channels.*;
import java.nio.charset.*;
import java.nio.file.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	    try{
//	        FileInputStream file = new FileInputStream("data.txt");
//            FileChannel channel = file.getChannel();
            Path dataPath = FileSystems.getDefault().getPath("data.txt");
            Files.write(dataPath,"\nLine 7".getBytes(StandardCharsets.UTF_8),StandardOpenOption.APPEND);
            List<String> lines = Files.readAllLines(dataPath);
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
	        e.printStackTrace();
        }
    }
}
