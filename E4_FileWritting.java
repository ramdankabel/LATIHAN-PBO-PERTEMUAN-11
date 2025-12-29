package Pertemuan11;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;

enum LogLevel {
  INFO,
  WARNING,
  ERROR
}

public class E4_FileWritting {
  public static final String fileName = "log.txt";

  private final ArrayList<String> messages = new ArrayList<>();
  
  public E4_FileWritting() {
    messages.add("System started successfully.");
    messages.add("User logged in.");
    messages.add("Data saved to database.");
  }

  public static void main(String[] args) {
    try (BufferedWriter writer = new java.io.BufferedWriter(new FileWriter(fileName, true))) {

      for (String msg : new E4_FileWritting().messages) {
        LogLevel level = LogLevel.values()[(int) (Math.random() * LogLevel.values().length)];
        String logEntry = String.format("[%s] %s: %s", LocalDateTime.now(), level, msg);
        writer.write(logEntry);
        writer.newLine();
      }

      System.out.println("Log baru berhasil ditulis ke " + fileName);
    } catch (FileNotFoundException e) {
      System.err.println("File not found: " + e.getMessage());
    } catch (IOException e) {
      System.err.println("Error writing to file: " + e.getMessage());
    }
  }
}
