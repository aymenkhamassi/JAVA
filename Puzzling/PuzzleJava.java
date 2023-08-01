import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {

    // Method to generate and return an array with 10 random numbers between 1 and 20 inclusive.
    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> rolls = new ArrayList<>();
        Random randMachine = new Random();

        for (int i = 0; i < 10; i++) {
            int randomNumber = randMachine.nextInt(20) + 1;
            rolls.add(randomNumber);
        }

        return rolls;
    }

    // Method to generate a random letter from the alphabet.
    public char getRandomLetter() {
        Random randMachine = new Random();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int randomIndex = randMachine.nextInt(26);
        return alphabet[randomIndex];
    }

    // Method to generate a random password of eight characters.
    public String generatePassword() {
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            char randomLetter = getRandomLetter();
            password.append(randomLetter);
        }
        return password.toString();
    }

    // Method to generate an array of random eight-character words.
    public String[] getNewPasswordSet(int length) {
        String[] passwordSet = new String[length];
        for (int i = 0; i < length; i++) {
            passwordSet[i] = generatePassword();
        }
        return passwordSet;
    }

    // SENSEI BONUS: Method to shuffle the elements of an array.
    public void shuffleArray(Object[] arr) {
        Random randMachine = new Random();

        for (int i = arr.length - 1; i > 0; i--) {
            int randomIndex = randMachine.nextInt(i + 1);

            // Swap the elements at randomIndex and i.
            Object temp = arr[randomIndex];
            arr[randomIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
