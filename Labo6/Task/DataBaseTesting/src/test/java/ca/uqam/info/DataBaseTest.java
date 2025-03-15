package ca.uqam.info;

import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;
import org.junit.Assert;
import org.junit.Test;

public class DataBaseTest {

  @Test
  public void testDatabaseRead() throws IOException {
    TextDatabase studentDatabase = new TextDatabase();
    Set<String> students = studentDatabase.readDataBase();
    Set<String> expectedResult = new LinkedHashSet<>();
    expectedResult.add("Max");
    expectedResult.add("Ryan");
    expectedResult.add("Quentin");
    expectedResult.add("Romain");
    Assert.assertEquals("Database does not contain default students", expectedResult, students);
  }
}
