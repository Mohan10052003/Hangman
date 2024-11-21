


import java.util.Random; 
import java.util.Scanner; 
 
public class HangMan{ 
    public static void main(String[] args) { 
        String[] words = {"java", "hangman", "programming", "computer", 
"algorithm"}; 
 
        Random random = new Random(); 
        String selectedWord = words[random.nextInt(words.length)]; 
        char[] displayWord = new char[selectedWord.length()]; 
        for (int i = 0; i < displayWord.length; i++) { 
            displayWord[i] = '_'; 
        } 
 
        int incorrectGuesses = 0; 
        int maxIncorrectGuesses = 6; // Maximum incorrect guesses allowed 
 
        Scanner scanner = new Scanner(System.in); 
 
        System.out.println("Welcome to Hangman!"); 
 
        while (incorrectGuesses < maxIncorrectGuesses) { 
            System.out.println("\nCurrent word: " + String.valueOf(displayWord)); 
            System.out.print("Enter a letter: "); 
            char guess = scanner.next().toLowerCase().charAt(0); 
 
            boolean found = false; 
            for (int i = 0; i < selectedWord.length(); i++) { 
                if (selectedWord.charAt(i) == guess) { 
                    displayWord[i] = guess; 
                    found = true; 
                } 
            } 
 
            if (!found) { 
                incorrectGuesses++; 
                displayHangman(incorrectGuesses); 
            } 
 
            if (String.valueOf(displayWord).equals(selectedWord)) { 
                System.out.println("Congratulations! You guessed the word: " + 
selectedWord); 
                break; 
            } 
        } 
 
        if (incorrectGuesses == maxIncorrectGuesses) { 
            System.out.println("Sorry, you ran out of attempts. The correct word was: " + selectedWord); 
        } 
 
        scanner.close(); 
    } 
 
    private static void displayHangman(int incorrectGuesses) { 
        // Display a simple hangman figure based on the number of incorrect guesses 
        System.out.println("Incorrect guesses: " + incorrectGuesses); 
        switch (incorrectGuesses) { 
            case 1: 
                System.out.println("   +---+"); 
                System.out.println("   |   |"); 
                System.out.println("       |"); 
                System.out.println("       |"); 
                System.out.println("       |"); 
                System.out.println("       |"); 
                break; 
            case 2: 
                System.out.println("   +---+"); 
                System.out.println("   |   |"); 
                System.out.println("   O   |"); 
                System.out.println("       |"); 
                System.out.println("       |"); 
                System.out.println("       |"); 
                break; 
            case 3: 
                System.out.println("   +---+"); 
                System.out.println("   |   |"); 
                System.out.println("   O   |"); 
                System.out.println("   |   |"); 
                System.out.println("       |"); 
                System.out.println("       |"); 
                break; 
            case 4: 
                System.out.println("   +---+"); 
                System.out.println("   |   |"); 
                System.out.println("   O   |"); 
                System.out.println("  /|   |"); 
                System.out.println("       |"); 
                System.out.println("       |"); 
                break; 
            case 5: 
                System.out.println("   +---+"); 
                System.out.println("   |   |"); 
                System.out.println("   O   |"); 
                System.out.println("  /|\\  |"); 
                System.out.println("       |"); 
                System.out.println("       |"); 
                break; 
            case 6: 
                System.out.println("   +---+"); 
                System.out.println("   |   |"); 
                System.out.println("   O   |"); 
                System.out.println("  /|\\  |"); 
                System.out.println("  / \\"); 
System.out.println("       |"); 
System.out.println("Game Over!"); 
break; 
} 
} 
}