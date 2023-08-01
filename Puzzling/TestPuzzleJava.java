import java.util.ArrayList;

public class TestPuzzleJava {

    public static void main(String[] args) {
        PuzzleJava generator = new PuzzleJava();

        // Test getTenRolls
        ArrayList<Integer> randomRolls = generator.getTenRolls();
        System.out.println("Random Rolls: " + randomRolls);

        // Test getRandomLetter
        char randomLetter = generator.getRandomLetter();
        System.out.println("Random Letter: " + randomLetter);

        // Test generatePassword
        String password = generator.generatePassword();
        System.out.println("Generated Password: " + password);

        // Test getNewPasswordSet
        int length = 5;
        String[] passwordSet = generator.getNewPasswordSet(length);
        System.out.println("Generated Password Set:");
        for (String pw : passwordSet) {
            System.out.println(pw);
        }

        // Test SENSEI BONUS: shuffleArray
        String[] arr = {"apple", "banana", "cherry", "date", "grape"};
        System.out.println("Original Array: ");
        for (String element : arr) {
            System.out.print(element + " ");
        }
        generator.shuffleArray(arr);
        System.out.println("\nShuffled Array: ");
        for (String element : arr) {
            System.out.print(element + " ");
        }
    }
}
