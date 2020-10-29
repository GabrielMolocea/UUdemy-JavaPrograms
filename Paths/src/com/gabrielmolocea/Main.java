package com.gabrielmolocea;

import java.io.*;
import java.nio.file.*;

public class Main {

    public static void main(String[] args) {
	   
        Path path = FileSystems.getDefault().getPath("WorkingDirectoryFile.txt");
        printFile(path);
        System.out.println("\n");
        
        //Path filePath = FileSystems.getDefault().getPath("files","SubdirectoryFile.txt");
        
        //Order of the arguments are very important -> Wrong order of the arguments ca cause to show like:
        //SubdirectoryFile.txt\\files for example.
        Path filePath = Paths.get(".","files","SubdirectoryFile.txt");
        printFile(filePath);
        
        System.out.println("\n");
        filePath = Paths.get("F:\\Udemy-JavaPrograms\\UUdemy-JavaPrograms\\OutThere.txt");
        //Example of how to write absolute path different and get the same result
        //filePath = Paths.get("D:\\", "Examples", "OutThere.txt");
        printFile(filePath);
        
        // Getting the absolut path
        filePath = Paths.get(".");
        System.out.println(filePath.toAbsolutePath());
        Path path2 = FileSystems.getDefault().getPath(".","files","..","files","SubdirectoryFile.txt");
        System.out.println(path2.normalize().toAbsolutePath());
        printFile(path2.normalize());
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
