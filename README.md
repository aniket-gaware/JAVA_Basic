 # Binary to Decimal Converter

This is a simple Java program that converts a binary number to its decimal equivalent. It includes a `BCD` class with a `main` method to demonstrate the conversion.

## How to Use

1. Clone this repository or download the source code.
2. Compile the `BCD.java` file using a Java compiler.

   ```bash
   javac BCD.java
   ```

3. Run the program with a binary number as an argument.

   ```bash
   java BCD 101
   ```

   Replace `101` with your binary number.

## Code Explanation

The program contains the following key components:

- `public static void main(String args[])`: The main method is the entry point of the program. It accepts command-line arguments, and it currently demonstrates the usage of the `binToDec` method by passing the binary number `101` as an example.

- `public static void binToDec(int binNum)`: This method is responsible for converting a binary number to its decimal equivalent. It takes an integer representing the binary number as an input parameter.

   - `int pow`: This variable is used to keep track of the current power of 2 while converting the binary number.

   - `int decNum`: This variable stores the decimal equivalent of the binary number as it is calculated.

   - The method uses a `while` loop to iterate through the binary digits one by one.

   - `int lastdigit = binNum % 10;` extracts the last digit of the binary number.

   - `decNum = decNum + (lastdigit * (int) Math.pow(2, pow));` calculates the decimal value of the current binary digit and adds it to `decNum`.

   - `pow++` increments the power of 2 for the next binary digit.

   - `binNum = binNum / 10;` removes the last digit from the binary number, moving on to the next digit.

   - Finally, the program prints the calculated decimal value.

## Example Output

If you run the program with the provided example (`java BCD 101`), it will output:

```
Decimal of binary number is: 5
```

You can replace `101` with any binary number you want to convert to decimal.

## License

This code is provided under the MIT License. You can find the full license text in the `LICENSE` file.
