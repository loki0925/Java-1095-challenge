package java_day_1;  // Package declaration - organizes your classes into namespaces

public class day_3 {  // Class definition - class names should start with an uppercase letter by convention ("Day_3" instead of "day_3")

    public static void main(String args[]) {  // Main method - entry point of the Java application
        int a = 257;  // Variable declaration - 'a' is an integer with the value 257

        // OOPs - Object-Oriented Programming concepts
        // Object - Represents real-world entities with properties (fields) and behaviors (methods)
        // Class - Blueprint for creating objects

        calculator calc = new calculator();  // Creating an object 'calc' of class 'calculator'
        int ans = calc.add(a, 5);  // Calling the 'add' method of 'calculator' class and storing the result in 'ans'
        System.out.println(ans);  // Printing the result
    }
}

class calculator {  // Class definition - 'calculator' should be 'Calculator' by naming conventions

    public int add(int a, int b) {  // Method to add two integers and return their sum
        return a + b;  // Returns the sum of 'a' and 'b'
    }
}
