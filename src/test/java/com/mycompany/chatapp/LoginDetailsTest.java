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
    
    LoginDetails login = new LoginDetails();
    
    public LoginDetailsTest() {
    }

    @Test
    public void testCheckUserName() {
        assertTrue(login.checkUserName("kyl_1"), "Correct username format failed");
        assertFalse(login.checkUserName("kyle!!!!!!!"), "Incorrect username format passed");
    }

    @Test
    public void testCheckPasswordComplexity() {
        assertTrue(login.checkPasswordComplexity("Ch&&sec@ke99!"), "Complexity check failed for valid password");
        assertFalse(login.checkPasswordComplexity("password"), "Complexity check passed for invalid password");
    }

    @Test
    public void testCheckCellPhoneNumber() {
        assertTrue(login.checkCellPhoneNumber("+27838968976"), "Valid SA number failed");
        assertFalse(login.checkCellPhoneNumber("0838968976"), "Invalid number without international code passed");
        
    }

    @Test
    public void testRegisterUser() {
        String expected = "Username successfully captured.\nPassword successfully captured.\nCell number successfully captured.";
        String actual = login.registerUser("kyl_1", "Ch&&sec@ke99!", "+27838968976");
        assertEquals(expected, actual);
    }

    @Test
    public void testLoginUser() {
        login.registerUser("kyl_1", "Ch&&sec@ke99!", "+27838968976");
        
        assertTrue(login.loginUser("kyl_1", "Ch&&sec@ke99!"));
        assertFalse(login.loginUser("wrong_user", "wrong_pass"));
    }

    @Test
    public void testReturnLoginStatus() {
        String expected = "Welcome Nhlanhla Cindi, it is great to see you again.";
        String actual = login.returnLoginStatus(true, "Nhlanhla", "Cindi");
        assertEquals(expected, actual);
    }
    
}
