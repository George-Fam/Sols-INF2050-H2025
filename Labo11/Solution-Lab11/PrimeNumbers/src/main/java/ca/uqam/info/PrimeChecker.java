package ca.uqam.info;

/**
 * A simple prime number checker. Can verify if a provided number is prime and count numbers below a
 * provided threshold.
 *
 * @author Maximilian Schiedermeier
 */
public class PrimeChecker {
  /**
   * Counts how many prime numbers there are below a provided threshold.
   *
   * @param limitExcluded upper threshold until which to search for prime numbers.
   * @return the amount of prime numbers found below the provided threshold.
   */
  public static int countPrimeNumbersBelow(int limitExcluded) {
    int primesFound = 0;
    for (int i = 2; i < limitExcluded; i++) {
      if (PrimeChecker.isPrime(i)) {
        primesFound++;
      }
    }
    return primesFound;
  }

  /**
   * Simple check to verify if a provided number is a prime. Simply verifies if there are any
   * divisors. Since divisors always appear in pairs the implementation only searches until the
   * square route.
   *
   * @param numberToTest as the number to check if it is a prime
   * @return true if the number has no divisors except 1 and itself. False otherwise, if no prime.
   */
  public static boolean isPrime(int numberToTest) {
    System.out.println(" - Verifying if " + numberToTest + " is prime...");
    for (int i = 2; i * i <= numberToTest; i++) {
      System.out.println("   - Testing divisor: " + i);
      if (numberToTest % i == 0) {
        System.out.println("      - Divisor found. " + numberToTest + " is not prime.");
        return false;
      }
    }
    System.out.println("      - No divisors found. " + numberToTest + " is prime.");
    return true;
  }
}

