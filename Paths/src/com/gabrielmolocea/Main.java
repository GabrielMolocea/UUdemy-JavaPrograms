package com.gabrielmolocea;

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;

public class Main {
    
    public static void main(String[] args) {
        try {

//            //Copy File
//            Path sourceFile = FileSystems.getDefault().getPath("Examples", "file1.txt");
//            Path copyFile = FileSystems.getDefault().getPath("Examples", "file1copy.txt");
//            Files.copy(sourceFile, copyFile, StandardCopyOption.REPLACE_EXISTING);
//
//            // Copy Directory
//            sourceFile = FileSystems.getDefault().getPath("Examples", "Dir1");
//            copyFile = FileSystems.getDefault().getPath("Examples", "Dir4");
//            Files.copy(sourceFile, copyFile, StandardCopyOption.REPLACE_EXISTING);
//
//            // Moving files
//            Path fileToMove = FileSystems.getDefault().getPath("Examples","file1copy.txt");
//            Path destination = FileSystems.getDefault().getPath("Examples", "Dir1", "file1copy.txt");
//            Files.move(fileToMove, destination);
//
//            //Renaming Files
//            Path fileToMove = FileSystems.getDefault().getPath("Examples", "file1.txt");
//            Path destination = FileSystems.getDefault().getPath("Examples", "file1.txt");
//            Files.move(fileToMove,destination);
//
//            // Deleting Files
//            Path fileToDelete = FileSystems.getDefault().getPath("Examples", "Dir1", "file1copy.txt");
//            Files.deleteIfExists(fileToDelete);
//
//            // Creating a file
//            Path fileToCreate = FileSystems.getDefault().getPath("Examples", "file2.txt");
//            Files.createFile(fileToCreate);
//
//            //Creating a Directory
//            Path dirToCreate = FileSystems.getDefault().getPath("Examples","Dir4");
//            Files.createDirectory(dirToCreate);
//
//            // Creating multiply directory
//            Path dirToCreate = FileSystems.getDefault().getPath("Examples", "Dir2\\Dir3\\Dir4\\Dir5\\Dir6");
//            Files.createDirectories(dirToCreate);

            // Getting the size of a file
            Path filePath = FileSystems.getDefault().getPath("Examples\\Dir1", "file1.txt");
            long size = Files.size(filePath);
            System.out.println("Size = " + size);
            System.out.println("Last modified = " + Files.getLastModifiedTime(filePath));
            
            // Getting all the attributes of a file
            BasicFileAttributes attributes = Files.readAttributes(filePath, BasicFileAttributes.class);
            System.out.println("Size = " + attributes.size());
            System.out.println("Last Modified = " + attributes.lastModifiedTime());
            System.out.println("Created = " + attributes.creationTime());
            System.out.println("Is directory = " + attributes.isDirectory());
            System.out.println("Is regular file = " + attributes.isRegularFile());
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        
    }
}
//        Path path = FileSystems.getDefault().getPath("WorkingDirectoryFile.txt");
//        printFile(path);
//        System.out.println("\n");
//
//        //Path filePath = FileSystems.getDefault().getPath("files","SubdirectoryFile.txt");
//
//        //Order of the arguments are very important -> Wrong order of the arguments ca cause to show like:
//        //SubdirectoryFile.txt\\files for example.
//        Path filePath = Paths.get(".","files","SubdirectoryFile.txt");
//        printFile(filePath);
//
//        System.out.println("\n");
//        filePath = Paths.get("F:\\Udemy-JavaPrograms\\UUdemy-JavaPrograms\\OutThere.txt");
//        //Example of how to write absolute path different and get the same result
//        //filePath = Paths.get("D:\\", "Examples", "OutThere.txt");
//        printFile(filePath);
//
//        // Getting the absolut path
//        filePath = Paths.get(".");
//        System.out.println(filePath.toAbsolutePath());
//        Path path2 = FileSystems.getDefault().getPath(".","files","..","files","SubdirectoryFile.txt");
//        System.out.println(path2.normalize().toAbsolutePath());
//        printFile(path2.normalize());
//
//        Path path3  = FileSystems.getDefault().getPath("thisfiledosentexit.txt");
//        System.out.println(path3.toAbsolutePath());
//
//        Path path4 = Paths.get("Z:\\", "abdef", "whatever.txt");
//        System.out.println(path4.toAbsolutePath());
//
//        filePath = FileSystems.getDefault().getPath("files");
//        System.out.println("Exits = " + Files.exists(filePath));
//
//        System.out.println("exits = " + Files.exists(path4));
//
//
//    }
//
//    private static void printFile(Path path) {
//        try(BufferedReader fileReader = Files.newBufferedReader(path)) {
//            String line;
//            while ((line = fileReader.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }
//    }

