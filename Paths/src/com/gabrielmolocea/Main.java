package com.gabrielmolocea;

import java.io.*;
import java.nio.file.*;

public class Main {

    public static void main(String[] args) {
	   
        Path path = FileSystems.getDefault().getPath("WorkingDirectoryFile.txt");
        printFile(path);
        System.out.println("\n");
        
        Path filePath = FileSystems.getDefault().getPath("files","SubdirectoryFile.txt");
        printFile(filePath);
        
        System.out.println("\n");
        filePath = Paths.get("F:\\Udemy-JavaPrograms\\UUdemy-JavaPrograms\\OutThere.txt");
        printFile(filePath);
    }
    
    private static void printFile(Path path) {
        try(BufferedReader fileReader = Files.newBufferedReader(path)) {
            String line;
            while ((line = fileReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
