package com.gabrielmolocea;

import java.io.*;
import java.nio.file.*;

public class Main {
    
    public static void main(String[] args) {

//        // Custom Filter without Lambda
//        DirectoryStream.Filter<Path> filter = new DirectoryStream.Filter<Path>() {
//            @Override
//            public boolean accept(Path path) throws IOException {
//                return (Files.isRegularFile(path));
//            }
//        };
        
        // Custom Filter with Lambda
        DirectoryStream.Filter<Path> filter = p -> Files.isRegularFile(p);

//	    Path directory = FileSystems.getDefault().getPath("FileTree\\Dir2");
        Path directory = FileSystems.getDefault().getPath("FileTree" + File.separator + "Dir2");
        try (DirectoryStream<Path> contents = Files.newDirectoryStream(directory, filter)) { // Gets the direct descendants
            for (Path file : contents) {
                System.out.println(file.getFileName());
            }
        } catch (IOException | DirectoryIteratorException e) {
            System.out.println(e.getMessage());
        }
        
        // Getting system separator
        String separator = File.separator;
        System.out.println(separator);
        separator = FileSystems.getDefault().getSeparator();
        System.out.println(separator);
        
        try {
            Path tempFile = Files.createTempFile("mvapp", ".appext");
            System.out.println("Temporary file path = " + tempFile.toAbsolutePath());
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        Iterable<FileStore> stores = FileSystems.getDefault().getFileStores();
        for (FileStore store : stores) {
            System.out.println("Volume store/ Drive Letter: " + store);
            System.out.println("file store: " + store.name());
        }
        
        Iterable<Path> rootPaths = FileSystems.getDefault().getRootDirectories();
        for (Path path : rootPaths) {
            System.out.println(path);
        }
        
        System.out.println("----Walking Tree for Dir2---");
        Path dir2Path = FileSystems.getDefault().getPath("FileTree" + File.separator + "Dir2");
        try {
            Files.walkFileTree(dir2Path, new PrintNames());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        
        System.out.println("---Copy Dir2 to Dir4\\Dir2Copy---");
        Path copyPath = FileSystems.getDefault().getPath("FileTree" + File.separator + "Dir4" + File.separator + "Dir2Copy");
        try {
            Files.walkFileTree(dir2Path, new CopyFiles(dir2Path, copyPath));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        File file = new File("C:\\Examples\\file.txt");
        Path convertedPath = file.toPath();
        System.out.println(convertedPath);
        
        File patent = new File("C:\\Examples\\file.txt");
        File resolvedFIle = new File(patent, "dir\\file.txt");
        System.out.println(resolvedFIle.toPath());
    
        resolvedFIle = new File("C:\\Examples", "dir\\file.txt");
        System.out.println(resolvedFIle.toPath());
        
        File workingDirectory = new File("").getAbsoluteFile();
        System.out.println("WorkingDirectory " + workingDirectory.getAbsolutePath());
    
        System.out.println("-- print Dir2 -----");
        File dir2File = new File(workingDirectory, "\\FileTree\\Dir2");
        String[] dir2Contents = dir2File.list();
        for (int i = 0; i< dir2Contents.length; i++) {
            System.out.println(dir2Contents[i]);
        }
    
        System.out.println("-----print Dir2 contents using listFiles() ---");
        File[] dir2Files = dir2File.listFiles();
        for (int i = 0; i< dir2Files.length; i++) {
            System.out.println(dir2Files[i].getName());
        }
        
    }
}
