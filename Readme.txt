Overview:
This project implements a Java application that processes a list of words. It filters the words based on the following two criteria:

The word length must be greater than 5 characters.
The word must start with the letter 'M' or 'm'.
The user is prompted to enter a number of words, and the application will display the words that satisfy both conditions.

Project Structure:
1. App.java:
The main class that contains the program logic.
Accepts a list of words from the user.
Filters the words based on the given criteria.
Prints the words that meet the conditions.

Key Methods:
isWordHavingLengthMoreThanFive(String word):
Returns true if the length of the word is greater than 5.
isWordStartWithRequiredLetter(String word):
Returns true if the word starts with 'M' or 'm'.
printOutput(List<String> list):
Prints the filtered words.
2. AppTest.java:
Contains unit tests for the methods in the App.java class.
It uses JUnit to test the filtering logic for both word length and starting letter.
Key Test Cases:

testIsWordHavingLengthMoreThanFive(): Tests the isWordHavingLengthMoreThanFive() method for various cases.
testIsWordStartWithRequiredLetter(): Tests the isWordStartWithRequiredLetter() method for different words.
3. Constants.java:
Contains constants used in the application.
Specifically, it holds the values for the letters 'M' and 'm'.
4. README.txt:
Provides an overview of the project, setup instructions, and explanation.
Features:
Allows users to input a list of words.
Filters words that:
Have a length greater than 5.
Start with the letter 'M' or 'm'.
Displays the results to the user.
Requirements:
Java 8 or higher.
JUnit 5 for testing (used in AppTest.java).
Setup Instructions:
Prerequisites:
Make sure you have Java 8 or higher installed on your system.
Install JUnit 5 for running unit tests.