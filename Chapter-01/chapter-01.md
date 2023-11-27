# Introduction

Welcome to my course! My name is Professor Ali as you may already have had an introduction or you may be reading ahead. Either way, nice to have you in my course this semester. So all of you are here to learn about coding more specifically object oriented programming. What is object oriented programming you may ask? Well that's an excellent question. Before coding and going right into things, we will need to define certain principals that are essential to object oriented programming and what makes it unique. We will breifly go over the overall concepts of object oriented programming and then start programming our first program towards the end of this chapter.  

### Objectives of this book 

This text strives to focus on three core elements:

1) A solid understading of object oriented programming in Java 
2) Basic sorting algorithms
3) Basic data structures 

### What is Object Oriented Programming?

Object-Oriented Programming (OOP) is a programming paradigm that revolves around the concept of "objects." It is a way of designing and organizing code to represent real-world entities and their interactions. OOP provides a structured approach to software development, making it more modular, flexible, and easier to maintain.

## Key Concepts of OOP

1. Objects: Objects are instances of classes and represent real-world entities. They encapsulate data and behavior.

2. Classes: Classes are blueprints or templates for creating objects. They define the properties (attributes) and behaviors (methods) that objects of the class will have.

3. Encapsulation: Encapsulation is the bundling of data and methods that operate on the data within a single unit, known as a class. It helps in hiding the internal details of how an object works.

4. Inheritance: Inheritance is a mechanism that allows a class to inherit properties and behaviors from another class. It promotes code reuse and establishes a relationship between classes.

5. Polymorphism: Polymorphism allows objects of different classes to be treated as objects of a common base class. It enables flexibility in handling various object types through a common interface.

6. Abstraction: Abstraction is the process of simplifying complex systems by modeling classes based on the essential properties and behaviors. It helps in managing system complexity.

### Objects and Classes

#### Objects 

- Definition: An object is a self-contained unit that represents a real-world entity. It encapsulates data (attributes) and methods (functions) that operate on the data.

- Example: In a banking application, an "Account" object might have attributes like account number, balance, and owner, along with methods like deposit and withdraw.

#### Classes

- Definition: A class is a blueprint or template for creating objects. It defines the properties (attributes) and behaviors (methods) that objects instantiated from the class will have.

- Example: Continuing with the banking application example, the "Account" class would define attributes like account number and balance, and methods like deposit and withdraw.

### Encapsulation 

#### Benefits of Encapsulation 

- Data Protection: Encapsulation restricts direct access to some of an object's components, providing a level of data protection.

- Code Organization: Encapsulation organizes code into manageable units, making it easier to understand and maintain.

- Implementation Flexibility: The internal implementation details of an object can be changed without affecting the rest of the program.

### Inheritance

#### Inherting Properties or Behaviors

- Definition: Inheritance allows a class to inherit properties and behaviors from another class. The class that is inherited from is called the base class or superclass, and the inheriting class is called the derived class or subclass.

- Example: If we have a "SavingsAccount" class, it could inherit properties and behaviors from the more general "Account" class.

### Polymorphism 

#### Types of Polymorphism 

- Compile-Time Polymorphism (Static Binding): Achieved through method overloading. The compiler determines which method to invoke based on the method's signature.

- Run-Time Polymorphism (Dynamic Binding): Achieved through method overriding. The decision on which method to call is made at runtime.

#### Benefits of Polymorphism

- Flexibility: Enables the use of a common interface to interact with objects of different classes.

- Extensibility: Makes it easier to add new classes without modifying existing code.

### Abstraction

#### Abstract Classes and Interfaces

- Abstract Classes: Classes that cannot be instantiated and may contain abstract methods (methods without a defined implementation).

- Interfaces: Specify a contract for classes to implement. They define a set of methods that must be present in any class that implements the interface.

#### Benefits of Abstraction

- Simplification: Reduces complexity by focusing on essential features.

- Implementation Independence: Allows changes to the implementation without affecting the rest of the system.

## What is Java? 

So since we talked a lot about OOP, let's talk about Java. Java is a popular programming language that was created in 1995 by James Gosling. Java is a high-level, versatile, and widely used programming language that is designed to be platform-independent, meaning that Java programs can run on any device that has the Java Virtual Machine (JVM) installed. Now owned by Oracle, Java has become one of the most popular programming languages due to its simplicity, object-oriented features, and wide range of applications. 

## Why Use Java?

### Platform Independence

- Java achieves platform independence by using the "Write Once, Run Anywhere" (WORA) principle. Code written in Java can run on any device that has a Java Virtual Machine (JVM).
- The Java code is compiled into an intermediate form called bytecode, which is then interpreted by the JVM at runtime.

### Object-Oriented Programming (OOP)

- Java is designed around the principles of object-oriented programming, which includes concepts like classes, objects, encapsulation, inheritance, and polymorphism.
- This OOP approach promotes modular and scalable code, making it easier to design, implement, and maintain large software systems.

### Simple and Readable Syntax

- Java syntax is influenced by C and C++, making it familiar to many programmers. However, Java eliminates some of the complex features of these languages to enhance simplicity.
- The syntax is designed to be readable and straightforward, with a focus on reducing common programming errors.

### Automatic Memory Management

- Java uses a garbage collector to automatically manage memory, which helps in deallocating memory occupied by objects that are no longer in use. This feature simplifies memory management for developers.

### Rich Standard Library

- Java comes with a comprehensive standard library that provides a wide range of classes and methods for tasks like networking, file I/O, data structures, and more. This library simplifies development and reduces the need for writing low-level code.

### Security

- Java places a strong emphasis on security. The bytecode executed by the JVM is designed to be secure and to prevent various security threats, such as buffer overflows.
- Java applets, a feature of Java that allows small applications to be executed within a web browser, introduced a sandboxing model to enhance security.

### Multithreading and Concurrency

- Java has built-in support for multithreading, allowing the execution of multiple threads simultaneously. This feature is crucial for developing concurrent and scalable applications.

### Community and Ecosystem

- Java has a large and active developer community. The vast ecosystem includes various frameworks, libraries, and tools that make it easier to build diverse types of applications, from web and mobile to enterprise systems.

### Widespread Usage

- Java is used in a variety of applications, including web development (Java Servlets, JSP), mobile app development (Android), enterprise-level applications (Java EE), scientific and research projects, and more.

### Versions and Updates

- Java is regularly updated to introduce new features, enhancements, and security patches. Major versions of Java are typically released every six months.

## Conclusion

If you feel completely confused, that is completely normal. This takes time to digest, so my advice is to reread this chapter and do your own personal research about these concepts. Rememeber you don't need to know all these concepts in detail right now but know the ***idea*** of it. We will take a deeper dive later in the course of these topics. 

Object-Oriented Programming is a powerful paradigm that promotes code reusability, maintainability, and flexibility. By representing concepts in the real world as objects and organizing them using classes, OOP provides a clear and efficient way to design and build software systems.

Understanding the fundamental principles of OOP is crucial for developers to write modular, scalable, and maintainable code. As we delve deeper into the world of programming, the concepts of objects, classes, encapsulation, inheritance, polymorphism, and abstraction will become integral to our approach in solving complex problems.

In subsequent lectures, we will explore these concepts in more detail and implement them in various programming languages.
