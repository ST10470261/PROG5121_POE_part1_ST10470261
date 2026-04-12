package com.mycompany.chatapp;

public class LoginDetails {
    private String registeredUsername;
    private String registeredPassword;
    private String firstName;
    private String lastName;
    
    public boolean checkUserName(String username){
        return username.contains("_") && username.length() <= 5;
    }
    /*
    Code Attribution:
    Source:Gemini AI (Google)
    Propmt Used:"Please may you assist me in how I can implement the "Password complexity" for the password input input in my project."
    Date Accessed:03/04/2026
    Description:"To implement password complexity, you need to move beyond a simple length check and actually "inspect" each character the user types. The most common way to do this in Java is by using a loop and the Character class."
    Modification: Implemented the  logic into the checkPasswordComplexity method and used boolean flags for the validation.
    */
    
    public boolean checkPasswordComplexity(String password){
        boolean hasUpper = false;
        boolean hasNum = false;
        boolean hasSpecial = false;
        
        if (password.length() < 8)return false;
        
        for(char c : password.toCharArray()){
            if(Character.isUpperCase(c)) hasUpper = true;
            if(Character.isDigit(c)) hasNum = true;
            if(!Character.isLetterOrDigit(c)) hasSpecial = true;
        }
        return hasUpper && hasNum && hasSpecial;
    }
    
    /*
    Code Attribution:
    Source:Gemini AI (Google)
    Propmt Used:"Please may you assist me in how I can implement the "+27" for the cell phone number input in my project."
    Date Accessed:03/04/2026
    Description:"To implement the +27 requirement, you need to combine a Regex pattern in your logic class with a User Prompt in your main class. This ensures the user knows what to type, and your code knows how to verify it."
    Modification: Implemented the suggested Regex pattern in the LoginDetails class.
    */
    public boolean checkCellPhoneNumber(String cell){
        return cell.matches("^\\+27[0-9]{9}$");
    }
    
    public String registerUser(String user, String pass, String cell){
        if(!checkUserName(user)){
            return "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.";
        }
        if(!checkPasswordComplexity(pass)){
            return "Password is not correctly formatted; please ensure that the password contains atleast eight characters, a capital letter, a number, and a special character.";
        }
        if(!checkCellPhoneNumber(cell)){
            return "Cell number is incorrectly formatted or does not contain an international code; please correct the number and  try again.";
        }
        
        this.registeredUsername = user;
        this.registeredPassword = pass;
        return "Username successfully captured.\nPassword successfully captured.\nCell number successfully captured.";
        
    }
    
    public boolean loginUser(String user, String pass){
        return user.equals(this.registeredUsername) && pass.equals(this.registeredPassword);
    }
    
    public String returnLoginStatus(boolean success, String fName, String lName) {
        if (success){
            return "Welcome " + fName + " " + lName + ", it is great to see you again."; 
        }else{ 
            return "UserName or password is incorrect, please try again.";
        }
    }
    
}
