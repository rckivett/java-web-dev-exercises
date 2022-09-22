package exercises;

import java.util.Scanner;

public class AliceIndex {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String Alice = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having" +
                " nothing to do: once or twice she had peeped into the book her sister was reading, but it had no" +
                " pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures" +
                " or conversation?'";

        System.out.println("What term from 'Alice in Wonderland' would you like to search for?");
        String aliceSearch = input.nextLine();
        Integer index = Alice.indexOf(aliceSearch);
        Integer length = aliceSearch.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        String modifiedSentance = Alice.replace(aliceSearch, "");
        System.out.println(modifiedSentance);
        //if aliceSearch is contained within Alice, return true and prints
    }
}