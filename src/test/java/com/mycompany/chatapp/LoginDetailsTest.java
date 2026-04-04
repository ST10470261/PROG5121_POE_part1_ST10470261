/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.chatapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author cindi
 */
public class LoginDetailsTest {
    
    // Create an instance of the class we want to test
    LoginDetails login = new LoginDetails();
    
    public LoginDetailsTest() {
    }
    /**
     * So we are Testing the Username validation logic.
     * Requirement: Must contain an underscore and be <= 5 characters.
     */

    @Test
    public void testCheckUserName() {
        // AssertTrue: We expect this specific string to pass
        assertTrue(login.checkUserName("kyl_1"), "Correct username format failed");
        // AssertFalse: We expect this long string to fail validation
        assertFalse(login.checkUserName("kyle!!!!!!!"), "Incorrect username format passed");
    }
    
    /**
     * Then we follow up with Testing Password complexity rules.
     * Requirement: 8+ chars, Capital letter, Number, and Special character.
     */

    @Test
    public void testCheckPasswordComplexity() {
        //we are using the exact test data provided in the PoE brief
        assertTrue(login.checkPasswordComplexity("Ch&&sec@ke99!"), "Complexity check failed for valid password");
        //we now testing a simple password to ensure the validator rejects it
        assertFalse(login.checkPasswordComplexity("password"), "Complexity check passed for invalid password");
    }
    
    /**
     * Here we Test the South African Cell Phone validation.
     * Requirement: International code (+27) and correct digit count.
     */

    @Test
    public void testCheckCellPhoneNumber() {
        // Validating the Regex implementation for international format
        assertTrue(login.checkCellPhoneNumber("+27838968976"), "Valid SA number failed");
        // Ensuring numbers without the +27 prefix are rejected
        assertFalse(login.checkCellPhoneNumber("0838968976"), "Invalid number without international code passed");
        
    }
    
    /**
     * Tests the Registration feedback messages.(confirmation of initial inputs correctly obeying the conditions we have implemented)
     * Requirement: Method must return specific success strings for all captures.
     */

    @Test
    public void testRegisterUser() {
        String expected = "Username successfully captured.\nPassword successfully captured.\nCell number successfully captured.";
        String actual = login.registerUser("kyl_1", "Ch&&sec@ke99!", "+27838968976");
        assertEquals(expected, actual);
    }
    
    /**
     * This tests the Login verification logic.
     * Checks if the system correctly compares entered data with registered data.
     */

    @Test
    public void testLoginUser() {
        // First, we must 'register' a user in the object's memory
        login.registerUser("kyl_1", "Ch&&sec@ke99!", "+27838968976");
        
        // Verify that matching credentials return true
        assertTrue(login.loginUser("kyl_1", "Ch&&sec@ke99!"));
        // Verify that incorrect credentials return false
        assertFalse(login.loginUser("wrong_user", "wrong_pass"));
    }
    
    /**
     * Tests the final welcome message displayed to the user.
     * Requirement: Correct formatting of the Welcome string with user names.
     */

    @Test
    public void testReturnLoginStatus() {
        // Checking for the exact placement of spaces and commas
        String expected = "Welcome Nhlanhla Cindi, it is great to see you again.";
        // This calls the method with 'true' to simulate a successful login state
        String actual = login.returnLoginStatus(true, "Nhlanhla", "Cindi");
        assertEquals(expected, actual);
    }
    
}
