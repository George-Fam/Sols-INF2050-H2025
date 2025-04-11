package ca.uqam.info;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Assert;
import org.junit.Test;

public class PrimeCheckerTest {
  /**
   * Checks how many primes can be found below 11. Should return 4, because there are 4 primes: "2,
   * 3, 5, 7"
   * Checks boundary condition: 11 is prime, so it should not be counted.
   */
  @Test
  public void testPrimesBelow11() {
    Assert.assertEquals(4, PrimeChecker.countPrimeNumbersBelow(11));
  }


  /**
   * Checks how many primes can be found below 12. Should return 5, because there are 5 primes: "2,
   * 3, 5, 7, 11"
   */
  @Test
  public void testPrimesBelow12() {
    Assert.assertEquals(5, PrimeChecker.countPrimeNumbersBelow(12));
  }
  @Test
  public void testPrintsIsPrime(){
    PrintStream ps = System.out;
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outputStream));
    PrimeChecker.isPrime(5);
    System.setOut(ps);

    String output = outputStream.toString();

    assertTrue(output.contains("Verifying if 5 is prime..."));
    assertTrue(output.contains("Testing divisor"));
    assertTrue(output.contains("No divisors found"));
  }
  @Test
  public void testPrintsIsNotPrime(){
    PrintStream ps = System.out;
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outputStream));
    PrimeChecker.isPrime(4);
    System.setOut(ps);

    String output = outputStream.toString();

    assertTrue(output.contains("Verifying if 4 is prime..."));
    assertTrue(output.contains("Testing divisor"));
    assertTrue(output.contains("Divisor found"));
  }
}
