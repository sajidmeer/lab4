package com.example;
 
public class App {
    public static void main(String[] args) {
        System.out.println("Hello, Jenkins CI!");
    }
 
    public String greet(String name) {
        return "Welcome, " + name + "!"; // Changed from "Hello" to "Welcome"
    }
}
