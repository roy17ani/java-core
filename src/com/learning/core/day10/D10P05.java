package com.learning.core.day10;
import java.io.*;
public class D10P05 {

	public static void main(String[] args) {
        // Accept input string from the user
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter a string: ");
            String inputString = reader.readLine();

            // Write the input string to the file io.txt
            writeToFile(inputString);

            // Show the size of the file
            showFileSize();

            // Read contents from the file and display them on console
            readAndDisplayFileContents();

            // Delete io.txt file using File class
            deleteFile();

        } catch (IOException e) {
            System.out.println("An error occurred while reading input or writing to file.");
            e.printStackTrace();
        }
    }

    private static void writeToFile(String inputString) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("io.txt"))) {
            writer.write(inputString);
            System.out.println("Input string has been written to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to file.");
            e.printStackTrace();
        }
    }

    private static void showFileSize() {
        File file = new File("io.txt");
        long fileSize = file.length();
        System.out.println("Size of the file: " + fileSize + " bytes");
    }

    private static void readAndDisplayFileContents() {
        try (BufferedReader reader = new BufferedReader(new FileReader("io.txt"))) {
            String line;
            System.out.println("Contents of the file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading file contents.");
            e.printStackTrace();
        }
    }

    private static void deleteFile() {
        File file = new File("io.txt");
        if (file.delete()) {
            System.out.println("File io.txt has been deleted successfully.");
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}