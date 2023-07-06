package com.myprojects.JavaCodingExercisesSet5;

import java.util.Scanner;

public class StringMagic {

    public static int countUppercaseLetters(String str) {

        int count = 0;
        if (str == null) {
            return count;
        }

        if (str=="") {
            return count;
        }
        for (int i = 0; i<str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                count++;
            }
        }
        return count;
    }

    public static boolean hasConsecutiveDuplicates(String str) {
        if (str == null) {
            return true;
        }

        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) == str.charAt(i+1)) {
                return true;
            }
        }
        return false;
    }

    public static int getRightmostDigit(String str) {
        if (str == null) {
            return 0;
        }
        for (int i = str.length()-1; i>=0; i--) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                return Character.getNumericValue(c); // Returns the numeric value of character c
            }
        }
        return -1;
    }

    public static String findLongestWord(String sentence) {

        if (sentence==null || sentence.isEmpty()) {
            return "";
        }

        String[] words = sentence.split(" ");

        String longestWord ="";
        int longestWordLength = 0;

        for (String word:words) {
            if(word.length() > longestWordLength) {
                longestWordLength = word.length();
                longestWord = word;
            }
        }
        return longestWord;
    }

    public static void main(String[] args) {

        System.out.println(countUppercaseLetters(null));
        System.out.println(hasConsecutiveDuplicates("ggj0j"));
        System.out.println(getRightmostDigit("jbjb99"));
        System.out.println(findLongestWord("This is a brand new experience."));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide a string: ");
        String str = scanner.nextLine();
        System.out.println("The number of uppercase letter in the provided string is: " + countUppercaseLetters(str));
        System.out.println("The provided string has consecutive duplicates: " + hasConsecutiveDuplicates(str));
        System.out.println("The digit which is the right most in the provided string: " + getRightmostDigit(str));
        System.out.println("Provide a sentence: ");
        String sentence = scanner.nextLine();
        System.out.println("The longest word in the provided sentence is: " + findLongestWord(sentence));
    }
}