package SyntaxExamples;

public class Main {
    public static void main(String[] args) {
        
        
        // Creating Variables
        String name = "Spartabots";
        int age = 17;
        double height = 5.5;
        boolean isRobot = true;
        
        // Using Variables
        // Declaring variables
        int a = 5;
        int b = 10;
        int c = a + b; // Adding a and b together and storing the result in c
        double d = 2.5;

        System.out.println("The value of b is: " + b);
        
        double e = c * d; // Multiplying c and d together and storing the result in e
        System.out.println("The value of e is: " + e);
        
        b = 15; // Reassigning the value of b
        
        System.out.println("The value of b is now: " + b);
        
        b = b + 5; // Adding 5 to the value of b and storing the result in b
        System.out.println("And now the value of b is: " + b);


        // Print new lines for readability
        System.out.println("\n\n");
        
        // Type Casting
        int f = 5;
        double g = 2.5;
        double h = f + g; // Adding f and g together and storing the result in h
        System.out.println("The value of h is: " + h);
        
        int i = (int) g; // Casting g to an int and storing the result in i
        // This will truncate the decimal part of g - just removes it completely
        System.out.println("The value of i is: " + i);
        
        int j = f + (int) g; // Adding f and the casted g together and storing the result in j
        System.out.println("The value of j is: " + j);
        
        double k = f; // Casting f to a double and storing the result in k
        // This will add a decimal part of .0 to f - this is implicit casting
        System.out.println("The value of k is: " + k);
        
        
        // Operators
        int l = 5;
        int m = 10;
        int n = l + m; // Adding l and m together and storing the result in n
        // 15
        int o = l - m; // Subtracting m from l and storing the result in o
        // -5
        int p = l * m; // Multiplying l and m together and storing the result in p
        // 50
        int q = m / l; // Dividing m by l and storing the result in q
        // 2
        int r = m % l; // Finding the remainder of m divided by l and storing the result in r
        // 0
        int s = 78 % 70; // Finding the remainder of 78 divided by 70 and storing the result in s
        // 8
        
        // Assignment Operators
        int t = 5;
        t += 10; // Equivalent to t = t + 10;
        // 15
        t -= 5; // Equivalent to t = t - 5;
        // 10
        t *= 2; // Equivalent to t = t * 2;
        // 20
        t /= 4; // Equivalent to t = t / 4;
        // 5
        t %= 3; // Equivalent to t = t % 3;
        // 2
        

        System.out.println("\n\n");
        
        System.out.println("Hello, " + name + "!");
    }
}


