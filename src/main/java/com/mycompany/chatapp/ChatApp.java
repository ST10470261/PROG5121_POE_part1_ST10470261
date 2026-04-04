/*Student name: Nhlanha Cindi
 *ST number.  : ST10470261
 *Module      : PROG5121
 */
package com.mycompany.chatapp;
import java.util.Scanner;
public class ChatApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);     //imported a scanner package so that the user is able to type their details directly into the console.
        LoginDetails login = new LoginDetails();
        
        //This where we capture the user details/input.
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
        
        //This section manages the application flow through the usage of a "if" statement.
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
