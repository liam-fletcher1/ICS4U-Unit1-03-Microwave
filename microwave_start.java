/*
 * The Microwave program
 *
 * @author  Liam Fletcher
 * @version 1.0
 * @since   2021-11-22
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Constants
        final double additionTime = 0.5;
        double timeOne = 0;
        double numberOf = 0;

        try {
            Scanner scan = new Scanner(System.in);


            System.out.println("Are you heating a sub," +
                " pizza or soup?:");
            String itemType = scan.nextLine();

            if (itemType.equals("sub")) {
                timeOne = 1;
            } else if (itemType.equals("pizza")) {
                timeOne = 0.45;
            } else if (itemType.equals("soup")) {
                timeOne = 1.45;
            } else {
                System.out.println("Invaild input.");
                return;
            }

            System.out.println("Enter the amount of food you are heating(max 3):");

            // user input
            Double quantityTemp = scan.nextDouble();
            numberOf = quantityTemp;

            if ((numberOf > 3) || (numberOf < 1)) {
                System.out.println("Invaild input.");
                return;
            }

            // Calculate heating time.
            double time = (timeOne + 0.5 * timeOne * (numberOf - 1));

            // Output
            if (numberOf == 1) {
                System.out.println("The item needs:");
                if (time == 1) {
                    System.out.println(time + " minute to reheat.");
                } else {
                    System.out.println(time + " minutes to reheat.");
                }
            } else {
                System.out.println("The items need:");
                System.out.println(time + " minutes to reheat.");
            }

        } catch (Exception e) {
            System.out.println("Invaild input");
        }
    }
}
