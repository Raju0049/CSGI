package com.java.csg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.java.constant.Constants;

/**
 * The {@code App} class provides functionality for processing a list of words. 
 * It filters the words based on the following criteria:
 * <ul>
 *   <li>Words longer than 5 characters</li>
 *   <li>Words that start with the letter 'M' or 'm'</li>
 * </ul>
 * The application takes input from the user, processes it, and prints the results.
 * 
 * The program demonstrates basic word processing and filtering operations.
 * 
 * <p>
 * Example usage:
 * <pre>
 *   Enter number of words: 5
 *   Enter value: Mango
 *   Enter value: melon
 *   Enter value: apple
 *   Enter value: Music
 *   Enter value: sky
 * </pre>
 * Output:
 * <pre>
 *   Words starts with Letter M: 3
 *   Mango
 *   melon
 *   Music
 *   End of Program
 * </pre>
 * </p>
 * 
 * @version 1.0
 * @since 2025-02-19
 */
public class App 
{
    /**
     * Main method to execute the program. It takes input from the user, processes the list of words, 
     * and prints the filtered results based on the given criteria.
     * 
     * @param args Command line arguments (not used in this program)
     */
    public static void main(String... args) {
        List<String> words = new ArrayList<String>();
        List<String> result = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Start of Program");
        System.out.println();
        System.out.println("Enter number of words: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter value: ");
            words.add(scanner.next());
        }
        for (String word : words) {
            if (isWordHavingLengthMoreThanLength(word) && isWordStartWithRequiredLetter(word)) {
                result.add(word);
            }
        }
        printOutput(result);
    }

    /**
     * Checks if the given word has more than 5 characters.
     *
     * @param word The word to check.
     * @return {@code true} if the word length is greater than 5, otherwise {@code false}.
     */
    public static boolean isWordHavingLengthMoreThanLength(String word) {
        return word !=null && word.length() > Constants.LENGTH;
    }

    /**
     * Checks if the given word starts with the letter 'M' or 'm'.
     *
     * @param word The word to check.
     * @return {@code true} if the word starts with 'M' or 'm', otherwise {@code false}.
     */
    public static boolean isWordStartWithRequiredLetter(String word) {
        return word !=null && (word.startsWith(Constants.SMALL_LETTER) || word.startsWith(Constants.CAPITAL_LETTER));
    }

    /**
     * Prints the filtered list of words.
     * 
     * @param list The list of filtered words.
     */
    public static void printOutput(List<String> list){
        System.out.println("Words starts with Letter M and length greater than 5:" + list.size());
        for(String rs : list){
            System.out.println(rs);
        }
        System.out.println("End of Program");
    }
}
