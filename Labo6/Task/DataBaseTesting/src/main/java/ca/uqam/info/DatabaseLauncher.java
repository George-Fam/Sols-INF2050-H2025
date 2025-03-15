package ca.uqam.info;

import java.io.IOException;
import java.util.Set;

/**
 * Launcher for student database. Does not do much, except printing all students in DB.
 */
public class DatabaseLauncher {
  public static void main(String[] args) throws IOException {
    TextDatabase studentDatabase = new TextDatabase();

    System.out.println("Students in DB:");
    Set<String> students = studentDatabase.readDataBase();
    for (String student : students) {
      System.out.println(" * " + student);
    }
  }
}
