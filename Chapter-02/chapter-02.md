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

