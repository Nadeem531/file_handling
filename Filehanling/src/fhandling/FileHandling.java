package fhandling;

import java.io.File;
import java.io.IOException;

  public class FileHandling {

    public static void main(String[] args) {
    
      File file = new File("C:\\Users\\Nadeem\\eclipse-workspace\\Filehanling\\src\\fhandling");
      try {
        boolean createFile = file.createNewFile();
        if (createFile) {
          System.out.println("New File is created.");
        }else {
          System.out.println("File already exists.");
        }
      } catch (IOException e) {
        e.printStackTrace();
      }

    }

  }