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

## Input

## Different Data Types

As you can see from above, we were able to make Java speak to us. Well sort of, what we were printing to the screen is known as a certain data type called a `String` and this is how the computer will see this. There are many other data types such as numbers, decimals, characters, and much more since our world is a bit complicated and a computer's world is just a bunch of 0s and 1s. We must take into account each of these data types. So let's talk about different data types and their properties. 

There are two main types of data, primitive data types and non-primitive data types. Primitive data types consist of byte, short, int, long, double, boolean, and char. Non-primitive data tpyes include String, Arrays, and Classes. 

## Primitive Data Types

### Byte

A byte is probably the simplest data type there is besides a boolean. This data type has a size of 1 byte or 8 bits in other words. This means that the data type can hold numbers from -128 to 127 or you can think of this as power of 2s in that 2^8 is 1 byte. This can be used instead of any other data types dealing with numbers to save on memory when you know that a certain value will never be out of -128 to 127 range. 

### Short

A short is the next one up from a singe byte. A shirt consists of 2 bytes or 16 bits. This means that a short can hold up numbers from -32768 to 32767 or you can think of this similary as we did with a byte where we can use the power of 2s, so 2^16 is 2 bytes. 

### Int

With computer science we can continue our journey and think of items as power of 2s. That being said, an int consists of 4 bytes or 32 bits. You can probably make the connection of "32-bit machines". The int data type can store whole number from -2147483648 to 2147483647. The int data type will most likely be the preferred data type when we create variables with whol en numbers during this course. 

### Long 

The long datat type can store whole numbers -9223372036854775808 to 9223372036854775807. This is used when we have values that int can't store. We can also make a connection here to "64-but machines". That beings said, a long consists of 8 bytes or 64 bits. 


