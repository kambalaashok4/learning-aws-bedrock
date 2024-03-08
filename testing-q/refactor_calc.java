public class PrimeNumberSum {

  public static void main(String[] args) {

    int sum = calculatePrimeNumberSum(100);
    System.out.println("Sum of prime numbers between 1 and 100 is: " + sum);

  }

  private static int calculatePrimeNumberSum(int limit) {

    int sum = 0;

    for(int i = 2; i <= limit; i++) {
      if(isPrime(i)) {
        sum += i;
      }
    }

    return sum;

  }

  private static boolean isPrime(int number) {

    if(number <= 1) {
      return false;
    }

    for(int i = 2; i <= Math.sqrt(number); i++) {
      if(number % i == 0) {
        return false; 
      }
    }

    return true;

  }

}
