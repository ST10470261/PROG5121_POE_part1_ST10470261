# PROG5121_POE_part1_ST10470261
---
Name & Surname  : Nhlanhla Cindi

Student number  : ST10470261

Group           : 03

Module          : PROG5121

YouTube video   : [<https://youtu.be/VXZYZdZVwtk>]

---
## Project Overview
ChatApp is a Java-based console application developed for Programming 1A (Part 1). The project focuses on creating a secure user registration and authentication system. It demonstrates key software development principles including Object-Oriented Programming (OOP), Input Validation, Regular Expressions (Regex), and Unit Testing (JUnit 5).

## Features
-  User Registration: Captures and validates user identity and security credentials.

-  Validation Logic:

   -  Username: Must contain an underscore (_) and be no more than 5 characters.

   -  Password: Enforces complexity (8+ characters, Capital letter, Number, and Special character).

   -  Cell Phone: Validates South African international format (+27) using Regex.

-  Secure Login: Authenticates users by comparing login attempts against stored registration data.

-  Automated Testing: 100% test coverage for all logic methods using JUnit 5.

---
## Technical Stack
*  Language: Java 

*  IDE: NetBeans

*  Build Tool: Maven

*  Testing Framework: JUnit 5

*  Version Control: Git & GitHub

---
## Project Structure
The source code is organized to separate the User Interface from the core business logic:
### Clases + Description:
1) __"ChatApp.java"__            - the entry point containing the main method. Handles console input/output and application flow.

2) __"LoginDetails.java"__       - the logic class containing all validation methods (checkUserName, checkPasswordComplexity, etc.).

3) __"LoginDetailsTest.java"__   - the test suite containing JUnit assertions to verify the logic against PoE requirements.

---
## Refrence List:
-  Emeris School of Computer Science (2025a). PROG5121  GitHub Desktop. [online] YouTube. Available at: https://www.youtube.com/watch?v=bUgFv1Y5LJw [Accessed 3 Apr. 2026].

-  Emeris School of Computer Science (2025b). PROG5121 Unit Testing Getting started. [online] YouTube. Available at: https://www.youtube.com/watch?v=MOhiM2SXZl0 [Accessed 3 Apr. 2026].

-  IIEVC School of Computer Science (2024). PROG5121 Maven Automated testing. [online] YouTube. Available at: https://www.youtube.com/watch?v=oz0Qd5H4Onk [Accessed 3 Apr. 2026].

-  M, G. (2023). Best Database for Chat Applications | Chat App Architecture & Structure. [online] QuickBlox. Available at: https://quickblox.com/blog/beginners-guide-to-chat-app-architecture/#II.%20Understanding%20the%20basic%20structure%20of%20a%20Chat%20Application [Accessed 3 Apr. 2026].

---

