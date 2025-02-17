# CSC6301-assignment-4
CSC6301 - Software Design &amp; Documentation <br />
Module 04: Assignment 01 - Project 04 - Linked List and Collections Framework

# Instructions for the Assignment:
Implement a program that reads a list of Integer numbers from the scanned input and saves them into a Linked List sorted from the smallest to the largest. Be sure to use the Collections Framework and follow code guidelines and document your code accordingly; <br />
Please make sure your program can be run on the command line and does NOT need an IDE to run. Please mention the command that needs to be run to invoke your program. Lastly, make sure you list the javadoc command to be used to generate javadoc

# Description
This program reads a list of integer numbers from standard input, stores them in a LinkedList, sorts them in ascending order, and prints the sorted list.
This program makes use of Java's Collections Framework to avoid reinventing commonly used data structures and algorithms:
 ```LinkedList<Integer>``` for dynamic storage instead of implementing a custom linked list.
 ```Collections.sort()``` for efficient sorting instead of writing a sorting algorithm.
 ```Scanner``` for input handling rather than manual input parsing.

# Features
- Reads integers from standard input and stores in a LinkedList.
- Sorts the list in ascending order.
- Prints the sorted list to the console.

# How to Run
The program can be run from the command line by compiling it first: <br />
```
javac SortedLinkedList.java
```
<br />

Then run using this command: <br />
```
java SortedLinkedList
```
<br />

To generate JavaDocs, use the command: <br />
```
javadoc -d doc SortedLinkedList.java
```
<br />

# Dependencies
Java 8 or later

# Contributing
This is an individual assignment.

# License
This project is licensed under the Merrimack License.
