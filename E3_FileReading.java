package Pertemuan11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E3_FileReading {
  private static final String FILE_NAME = "nilai.txt";

  public static void main(String[] args) {
    generateDummyData();

    try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
      String line;
      while ((line = reader.readLine()) != null) {
        String[] parts = line.split(",");
        System.out.println(String.format("Nama: %s\nNilai: %s", parts[0].trim(), parts[1].trim()));
        System.out.println("----------");
      }
    } catch (FileNotFoundException e) {
      System.err.println("File not found: " + e.getMessage());
    } catch (IOException e) {
      System.err.println("Error reading file: " + e.getMessage());
    }
  }

  public static void generateDummyData() {
    // Bikin dummy data ke file nilai.txt
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
      writer.write("Luuk Herssen,95");
      writer.newLine();
      writer.write("Avidius,78");
      writer.newLine();
      writer.write("Harelius,70");
      writer.newLine();
      writer.write("Christoforo,68");
      writer.newLine();
      writer.write("Schwarzloch,80");
      writer.newLine();
    } catch (IOException e) {
      System.err.println("Error writing file: " + e.getMessage());
    }
  }
}
