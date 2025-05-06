# VinsysAcademy

1.	Write a JUnit test to check if the add method of a Calculator class is working correctly. The add method should return the sum of two integers.
Method to Test:

public int add(int a, int b) {
    return a + b;
}


Test Case:Test the add method with positive numbers, negative numbers, and zero.
Class TestCalculator{

Public void testAdd(){


}
}

2.	Write a JUnit test for a method getStringLength that returns the length of a given string.
Method to Test:
public int getStringLength(String str) {
    return str.length();
}
Test Case:
         Test the method with:
●	A normal string (e.g., "Hello").

●	An empty string.


3. Write a JUnit test to ensure that the divide method throws an ArithmeticException when dividing by zero.
Method to Test:
public int divide(int a, int b) {
    return a / b;
}
Test Case:
      Test the divide method when dividing by zero.
4. Write a JUnit test for a method isPrime that checks if a given number is prime. Return true if the number is prime, otherwise false.
Method to Test:
public boolean isPrime(int n) {
    if (n <= 1) return false;
    for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) return false;
    }
    return true;
}
Test Case:
Test the method with:
●	A prime number (e.g., 5).

●	A non-prime number (e.g., 4).



.
