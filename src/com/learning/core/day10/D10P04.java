package com.learning.core.day10;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class D10P04 {

	public static void main(String[] args) {
        // Check if proper arguments are provided
        if (args.length != 2) {
            System.out.println("Usage: java D10P04 <source_file> <destination_file>");
            return;
        }

        // Extract source and destination file paths from command line arguments
        Path sourcePath = Paths.get(args[0]);
        Path destinationPath = Paths.get(args[1]);

        try {
            // Copy contents from source to destination file
            Files.copy(sourcePath, destinationPath);
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while copying the file.");
            e.printStackTrace();
        }
    }
}
