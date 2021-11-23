/*
 * The microwave program
 *
 * @author  Liam Fletcher
 * @version 1.0
 * @since   2021-11-22
 */

import java.util.Scanner;

/**
 * The Microwave program
 */

final class MicrowaveFinal {

    // Constants
    public static final float SUB = 60;
    public static final float PIZZA= 45;
    public static final float SOUP= 95;
    public static final float SECONDSMIN= 60;



    public static void main(final String[] args) {
        // Variables
        String choice;
        double amount;
        float numberOf;
        float Minutes = 0;
        float Seconds = 0;
        float plays = 1;
        final double numberOfTimes = 0.5;

        // Scanner objects
        final Scanner One = new Scanner(System.in);
        final Scanner Two = new Scanner(System.in);

        try {
            do {
                // User Input
                System.out.println("Are you heating a sub, pizza, or soup?: ");
                choice = One.nextLine();
                System.out.println("How many " + choice + "(s) are you heating?(max:3): ");
                amount = Two.nextFloat();

                // Process
                numberOf = (float)((amount + 1) * numberOfTimes);
                if ("sub".equals(choice)) {
                    Minutes = (float) Math.floor(SUB *
                        numberOf /SECONDSMIN);
                    Seconds = (SUB * numberOf /
                        SECONDSMIN - Minutes) *SECONDSMIN;
                } else if ("pizza".equals(choice)) {
                    Minutes = (float) Math.floor(PIZZA *
                        numberOf /SECONDSMIN);
                    Seconds = (PIZZA * numberOf /
                        SECONDSMIN- Minutes) *SECONDSMIN;
                } else if ("soup".equals(choice)) {
                    Minutes = (float) Math.floor(SOUP *
                        numberOf /SECONDSMIN);
                    Seconds = (SOUP * numberOf /
                        secondsMin - Minutes) * secondsMin;
                } else {
                    System.out.println("Invalid input.");
                    break;
                }
                System.out.println("The total heating time is " + Minutes +
                    " minutes and " + Seconds + " seconds.");
                plays = 2;

            } while (plays == 1);
        } catch (Exception e) {
            System.out.println("Invalid input.");
        }
    }
}
