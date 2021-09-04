package exercise02;

import java.util.Scanner;

public class Solution02 {
    //Create a program that prompts for an input string
    // and displays output that shows the input string
    // and the number of characters the string contains.
    /*
     *  UCF COP3330 Fall 2021 Assignment 1 Solution
     *  Copyright 2021 James Jaro
     */
public static void main(String[] args){
    //ask what the input is
    Scanner input = new Scanner(System.in);
    System.out.print("What is the input string?");
    //take in the input from the user
    String userin = input.nextLine();
    //count how many characters there are in the string
    int stringLength = userin.replace(" ", "").length();
    //print out the number of characters the string has
    System.out.println(userin + " has " + stringLength + " characters.");
}

}
