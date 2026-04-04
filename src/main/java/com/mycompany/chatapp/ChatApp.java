/*
 *
 */
package com.mycompany.chatapp;
import java.util.Scanner;
public class ChatApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LoginDetails login = new LoginDetails();
        
        System.out.println("--- WELCOME TO CHATAPP REGISTRATION ---");
        System.out.print("Enter First Name: ");
        String fName = input.nextLine();
        
        System.out.print("Enter Last Name: ");
        String lName = input.nextLine();
        
        System.out.print("Enter Username: ");
        String user = input.nextLine();
        
        System.out.print("Enter Password: ");
        String pass = input.nextLine();
        
        System.out.print("Enter SA Cell Phone Number (e.g. +27831234567): ");
        String cell = input.nextLine();
        
        String registrationStatus = login.registerUser(user, pass, cell);
        System.out.println("\n" + registrationStatus);
        
        if (registrationStatus.contains("successfully captured") || registrationStatus.contains("successfully registered")) {
            System.out.println("\n--- LOGIN TO YOUR ACCOUNT ---");
            System.out.print("Enter Username: ");
            String loginUser = input.nextLine();
            
            System.out.print("Enter Password: ");
            String loginPass = input.nextLine();

            boolean isSuccessful = login.loginUser(loginUser, loginPass);
            System.out.println(login.returnLoginStatus(isSuccessful, fName, lName));
        }
    }
}
