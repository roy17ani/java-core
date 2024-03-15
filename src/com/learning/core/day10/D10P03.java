package com.learning.core.day10;

import java.io.*;
import java.util.ArrayList;

import com.learning.core.day10.Record;

public class D10P03 {

	public static void main(String[] args) {
        // Load records from the file
        ArrayList<Record> records = loadRecordsFromFile("records.dat");

        // Display all records
        if (records != null && !records.isEmpty()) {
            System.out.println("Records saved in the file:");
            for (Record record : records) {
                System.out.println(record);
            }
        } else {
            System.out.println("No records found in the file.");
        }
    }

    private static ArrayList<Record> loadRecordsFromFile(String filename) {
        ArrayList<Record> records = new ArrayList<>();
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filename))) {
            while (true) {
                Record record = (Record) inputStream.readObject();
                records.add(record);
            }
        } catch (EOFException e) {
            // Reached end of file
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("An error occurred while reading records from file.");
            e.printStackTrace();
        }
        return records;
    }
}