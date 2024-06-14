/*
 * FILE: Main.java
 * USAGE: -- 
 * DESCRIPTION: This section goes over Java's printing, comments, vairables, 
 *              data types, type casting, and operators. 
 * OPTIONS: -- 
 * REQUIREMENTS: --
 * BUGS: -- 
 * AUTHOR: xXxSpicyBoiiixXx (Md Ali)
 * ORGANIZATION: -- 
 * VERSION: 1.0
 * CREATED: 07/14/2024
 * REVISTION: -- 
 */


public class Main { 
    public static void main(String[] args) {
        
        /* As we saw in chapter 1, hello world was able to print to the screen
         * with `println()` method to outut values or print text in Java:
         */

        System.out.println("Hello World");

        /* We can do this is as muhc as we like. I want to point out that every
         * time we call `println()` a new line will appear for the text such as
         */

        System.out.println("Hello World");
        System.out.println("Is this really a computer?");
        System.out.println("Wow, Java is pretty neat!");

        /* Another thing to note is that when you're working with any form of text
         * you will want to wrap it inside double quotation marks "" otherwise 
         * you will get a compile error" 
         */

        System.out.println("This will work");
        //System.out.println(This will cause an error);
        
        /* So now we know how to print things, how do I get things on the smae line?
         * Well we have a method for that as well which is just `print()` method, which 
         * like the `println()` but instead of adding a new line we will print on the 
         * same line as shown below.
         *
         * Note how I put an extra space, otherwise it would look weird and be together.
         */

        System.out.print("I am the first part of the sentence");
        System.out.print(" and here I am, the second part of the sentence!");

        /* We can also use the same print functions to print numbers! The only thing that 
         * would be different is that we don't have put them in double quotes
         */

        System.out.println(8);
        System.out.println(8888);
        System.out.println(8888888);

        // Also we can do matematical calculations inside of these methods.
        
        System.out.println(2 + 2);
        System.out.println(8 * 8);
        
        
    }
}
