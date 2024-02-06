/*
 * Class: CMSC203 31414
 * Instructor: Ahmed Tarek
 * Description: The Java program implements a color guessing game where the user has to guess the randomly selected color, 
 with rounds of interaction, and provides feedback on the number of correct guesses at the end. 
 * Due: 02/06/2024
 * Platform/compiler: Ecilpse
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Naol Gobena
*/
import java.util.Random;
import java.util.Scanner;
public class ESPGame {

    static final String RED_COLOR = "RED";
    static final String BLUE_COLOR = "BLUE";
    static  final String YELLOW_COLOR = "YELLOW";
    static  final String INDIGO_COLOR = "INDIGO";
    static  final String ORANGE_COLOR = "ORANGE";
    static  final String GREEN_COLOR= "GREEN";
    static  final String VOILET_COLOR= "VOILET";



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String studentGuess = null;
        int rand;
        int roundCounter = 1;
        int counter=0;

        System.out.print("Enter your name: ");
        String studentName = scanner.nextLine();
        System.out.print("Describe yourself: ");
        String studentDescription = scanner.nextLine();
        System.out.print("\n");


        for (int i = 0; i < 11; i++) {
            boolean valid = false;
            System.out.println("Round " + roundCounter++ +"\n");

            while (!valid) {
              System.out.print("I am thinking of a color.\n" +
                        "Is it Red, Green, Blue, Orange,Voilet, Indigo or Yellow?\n" +
                        "Enter your guess: ");

                studentGuess = scanner.nextLine();
                System.out.print("\n");

                if (studentGuess.equalsIgnoreCase(RED_COLOR) || studentGuess.equalsIgnoreCase(BLUE_COLOR) || studentGuess.equalsIgnoreCase(YELLOW_COLOR)||
                        studentGuess.equalsIgnoreCase(GREEN_COLOR) ||
                        studentGuess.equalsIgnoreCase(ORANGE_COLOR) || studentGuess.equalsIgnoreCase(VOILET_COLOR)||studentGuess.equalsIgnoreCase(INDIGO_COLOR)) {
                    valid = true;
                } else {
                    System.out.print("You entered incorrect color. Is it Red, Green, Blue, Orange, or \n" +
                            "Yellow?");
                }
            }
            rand=random.nextInt(7);
            String selectedColor;
            switch (rand) {
                case 0:
                    selectedColor = RED_COLOR;
                    break;
                case 1:
                    selectedColor = BLUE_COLOR;
                    break;
                case 2:
                    selectedColor = GREEN_COLOR;
                    break;
                case 3:
                    selectedColor = VOILET_COLOR;
                    break;
                case 4:
                    selectedColor = INDIGO_COLOR;
                    break;
                case 5:
                    selectedColor = ORANGE_COLOR;
                    break;
                case 6:
                    selectedColor = YELLOW_COLOR;
                    break;
                default:
                    selectedColor = "Unknown Color";
                    break;

            }
             System.out.println();
            if (selectedColor.equalsIgnoreCase(studentGuess)) {
              counter++;
              System.out.println("Correct! Your guess is right.");
            } else {
              System.out.println("Incorrect. The correct color was " + selectedColor + ".");
            }



        }

        System.out.println("Game Over");
        System.out.println();

        System.out.println("You guessed " + counter + " out of 10" + " colors correctly.");
        System.out.println("Student Name: " + studentName);
        System.out.println("User Description " + studentDescription);
        System.out.println("Due Date: " + "02/06/24");
    }
}
