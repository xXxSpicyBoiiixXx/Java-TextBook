# Introduction

As you guys can see there is a lot to learn about Java and OOP and I wanted to congratulate you on your first program with "Hello World", here we will go a little deeper on the synatx and some of the things we can implement with output. Another great question is, "since we can put some output on the screen, couldn't we get user input?" That is entirely correct! So we will be leveraging some user input as well as various data types since we might want to add things like numbers, letters, special characters! The sky is the limit with user input or even predefined input, but before that we must talk about different data types and how the computer sees that data types. 

## Preliminary Items

We talked about the whole concept of OOP and how Java can fit in that category. Here we will need to download some items here to make this course easier. In Java, we learned that everything is class but we have to have some where to run our code. Typically people code in an Interactive Developer Environment (IDEs). This makes your coding experince much easier. I will be using the terminal as this is what I'm used to and if you are getting into operating system or low level programming I would recommend utilizing the terminal, but if you are new to coding and/or computer science I would recommed starting with an IDE. I personally recommend [Intellij Idea](https://www.jetbrains.com/idea/) or [Eclipse](https://www.eclipse.org/downloads/). I will not go over the installation process of each of these due to the fact that there is a lot of documentation over both of these IDEs. If you are using the terminal, please install javac and the respective java libraries that are needed so you can successfully compile and run your programs. 

## Outputs

### println() method

As we noticed we were able to print out "hello world" to the screen from the Java program. This command is shown below. 

`System.out.println("Hello World!");`

Now let's take this command a bit apart. So the `println` method is what we use to output values or print text to the user on to the screen so we can indicate some type of result or feedback to the user. You can add as many of these methods as you like such as: 

`System.out.println("Hello World!");`
`System.out.println("Welcome to IIT");`
`System.out.println("I hope you guys enjoy my code");`

If you noticed we had to add double quotes, that is due to the nature of Java syntax. If you forget these quotes you will get an error such as: 

`System.out.println(This will produce an error);`

This is beacuse Java will not recognize this as a print statement and would be wondering what you are trying to print out. It is important to make sure you have double quotes around any "String" value. 

### print() method

As you may have noticed you could played around with the different methods in Java and saw that there is another method called `print()` which essentially does the same thing as `println()` with a slight difference that `print()` will not insert a new line, for example:

`System.out.print("Hello World! ");`
`System.out.print("I will print on the same line.");`

Output:

`Hello World! I will print on the same line`

Where `println()` will do the following: 

`System.out.println("Hello World!");`
`System.out.println("I will NOT print on the same line.");`

Output:

`Hello World!`
`I will NOT print on the same line.`

Hence, both have their places on formatting outputs to the user.

## Different Data Types

As you can see from above, we were able to make Java speak to us. Well sort of, what we were printing to the screen is known as a certain data type called a `String` and this is how the computer will see this. There are many other data types such as numbers, decimals, characters, and much more since our world is a bit complicated and a computer's world is just a bunch of 0s and 1s. We must take into account each of these data types. So let's talk about different data types and their properties. 

There are two main types of data, primitive data types and non-primitive (reference) data types. Primitive data types consist of byte, short, int, long, double, boolean, and char. Non-primitive or reference data tpyes include String, Arrays, and Classes. 

The main difference between primitive and non-primitive data types are: 

- Primitive types are predefined (already defined) in Java. Non-primitive types are created by the programmer and is not defined by Java (except for String).

- Non-primitive types can be used to call methods to perform certain operations, while primitive types cannot.

- A primitive type has always a value, while non-primitive types can be null.

- A primitive type starts with a lowercase letter, while non-primitive types starts with an uppercase letter.

## Primitive Data Types

Primitive number types are divided into Integer types and Floating types.

Integer types can be seen as storing whole numbers, positive or negative without any decimals. Valid types are byte, short, int, and long. 

Floating types are fractional in nature, containing one or more decimals. There are two floating types, float and double. 

### Byte

A byte is probably the simplest data type there is besides a boolean. This data type has a size of 1 byte or 8 bits in other words. This means that the data type can hold numbers from -128 to 127 or you can think of this as power of 2s in that 2^8 is 1 byte. This can be used instead of any other data types dealing with numbers to save on memory when you know that a certain value will never be out of -128 to 127 range. 

### Short

A short is the next one up from a singe byte. A shirt consists of 2 bytes or 16 bits. This means that a short can hold up numbers from -32768 to 32767 or you can think of this similary as we did with a byte where we can use the power of 2s, so 2^16 is 2 bytes. 

### Int

With computer science we can continue our journey and think of items as power of 2s. That being said, an int consists of 4 bytes or 32 bits. You can probably make the connection of "32-bit machines". The int data type can store whole number from -2147483648 to 2147483647. The int data type will most likely be the preferred data type when we create variables with whol en numbers during this course. 

### Long 

The long data type can store whole numbers -9223372036854775808 to 9223372036854775807. This is used when we have values that int can't store. We can also make a connection here to "64-but machines". That beings said, a long consists of 8 bytes or 64 bits. 

### Float and Double

The float and double data types can store fractional numbers as we stated before. If you would like to use floats, we will need to tack an "f" at the end and likewise wiht doubles where a "d" will be at the end. 

float number = 1.23f;

double number = 2.34d;

So the big question, when do I use float and when do I use double? Well, we can see this through the amount of precision we need. Precision indicates how many digits the value can have after the deimal point. In this sense, floats can store up to seven decimal digits, while doubles can have up to 15 digits.

### Boolean

Probably the most fundamental part of computer science is the boolean type. This data type will show up consistently throughout your professional and academic endevours. This is often due to the yes or no, on or off, true or false nature of this data type. 

Java will see a boolean data type as either the values "true" or "false". 

### Char 

The char data type is used to store a single character, for example like a letter grade. You will typically surround this with singe quotes like 'A', 'a', 'B', etc.

## Reference (Non-Primitive) Data Types

These data types include Strings, Arrays, Classes, Interface. We will discuss these in more depth later in chapters when we get coser to pass by reference logic. For now, just know that they exist.

## Type Casting

Type casting is something you will come across computer science much of the time but this is when we change our data type. For example, if we had a int and we wanted to change that to a short or vice versa. The tricky part is seeing if you are not going out of bounds. There are two type of casting, widening and narrowing. 

### Widening Casting 

Widening casting is done automatically by Java. This is a scenario where a smaller type converts to a larger type. The order would be 

byte -> short -> char -> int -> long -> float -> double

### Narrowing Casting 

As you might expect, narrowing casting is where you go from a bigger data type to a smaller one. Unlike widening casting, you must do this manually. This is shown in the example code. 

double -> float -> long -> int -> char -> short -> byte

### Java Operators

Operators are used to perform operations on variables and values. Java divides the operators into the following groups: 

- Arithmetic operators
- Assignment operators
- Comparison operators
- Logical operators
- Bitwise operators

### Arithmetic Operators

### Assignment Operators

### Comparison Operators

### Logical Operators

### Bitwise Operators 
