package com.example;
 
import org.junit.Test;
import static org.junit.Assert.assertEquals;
 
public class AppTest {
    @Test
    public void testGreet() {
        App app = new App();
        String result = app.greet("Jenkins");
        assertEquals("Welcome, Jenkins!", result); // Updated to match new greeting
    }
}
