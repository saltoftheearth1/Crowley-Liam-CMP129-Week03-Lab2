public class CalculatorTest {

  public static void main(String[] args) {
    // create calculator object
    Calculator calculator = new Calculator();

    // test each add method
    int twoIntegers = calculator.add(7, 8);
    double twoDoubles = calculator.add(5.5, 7.75);
    int threeIntegers = calculator.add(5, 10, 15);
    String twoStrings = calculator.add("Hello ", "World");

    System.out.println("Sum of two integers: " + twoIntegers);
    System.out.println("Sum of two doubles: " + twoDoubles);
    System.out.println("Sum of three integers: " + threeIntegers);
    System.out.println("Concatenated strings: " + twoStrings);
  }
}
