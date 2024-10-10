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
        
        
        // Conditionals
        int u = 5;
        int v = 10;
        if (u > 2) {
            System.out.println("u is greater than 2");
        }
        
        if (u < v) {
            System.out.println("u is less than v");
        }
        else if (u == v) {
            System.out.println("u is equal to v");
        }
        else {
            System.out.println("u is not less than v");
        }
        
         /*
         The order of if and else if statements matters
         The first condition that is true will be executed
         
         If the kindness is greater than 50, the first block will be executed
            If the kindness is greater than 25 but not greater than 50, the second block will be executed
                If the kindness is less than or equal to 25, the third block will be executed
         
         If no conditions are true, the else block will be executed
         If there is no else block, nothing will happen if no conditions are true 
         */
        int kindness = 30; // Change this value to test the condition
        
        if (kindness > 50) {
            System.out.println("You are very kind!");
        }
        else if (kindness > 25) {
            System.out.println("You are kind!");
        }
        else { // if kindness is less than or equal to 25
            System.out.println("You are not very kind.");
        }
        
        // More else if and else examples
        // Change the below values to try and get every condition!
        int x = 5;
        int y = 10;
        
        // We can have lots of different else if statements and then one final else statement to catch everything else that doesn't fit the other conditions
        if (x  > y){
            System.out.println("x is greater than y");
        }
        else if (x < y){
            System.out.println("x is less than y");
        }
        else if (x >y && x < 8) {
            System.out.println("x is greater than y and less than 8");
        }
        else if (x < y && x > 3) {
            System.out.println("x is less than y and greater than 3");
        }
        else {
            System.out.println("x is equal to y");
        }
        
        // If they are a robot print a different message
        if (isRobot) {
            System.out.println("Beep boop! You are a robot!");
        }
        else {
            System.out.println("Hello, " + name + "! You are not a robot :(");
        }
        
        if (age >= 18) {
            System.out.println("You are an adult!");
        }
        else {
            System.out.println("You are not an adult.");
        }
        
        // Logical Operators
        // && - AND
        // || - OR
        // ! - NOT
        if (age >= 18 && isRobot) {
            System.out.println("You are an adult robot!");
        }
        else {
            System.out.println("You are not an adult robot.");
        }

        // If they are a robot or an adult print a different message
        if (isRobot || age >= 18) {
            System.out.println("You are either a robot or an adult!");
        }
        else {
            System.out.println("You are neither a robot nor an adult.");
        }
        
        // Using the NOT ( ! ) operator is the inverse of a condition. Essentially it flips the condition
        if (!isRobot) { 
            System.out.println("You are not a robot!");
        }
        else {
            System.out.println("You are a robot!");
        }
        
        // Nested Conditionals
        // There are benefits to not using logical operators but if you need to check two conditions at the same time it is easier to use them instead of multiple nested conditions
        if (age >= 18) {
            if (isRobot) {
                System.out.println("You are an adult robot!");
            }
            else {
                System.out.println("You are an adult!");
            }
        }
        else {
            if (isRobot) {
                System.out.println("You are a robot!");
            }
            else {
                System.out.println("You are not an adult or a robot.");
            }
        }
        

        
        
        

        System.out.println("\n\n");
        
        System.out.println("Hello, " + name + "!");
    }
}


