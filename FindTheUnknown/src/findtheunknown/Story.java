
package findtheunknown;

import java.util.Scanner;

public class Story {



    public static void StoryBegin() {

        System.out.println("Place: Norlisk ");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Time: 12.30pm");

        System.out.println();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        System.out.println("We are the SEAL Team Six-Bravo");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        System.out.println("We are trying to execute a deadly ex cia member who was betrayed by his own people in government because he knew too many things.");
        try {
            Thread.sleep(6000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.println("He went missing and now he is a thread to the nation");

        try {
            Thread.sleep(4000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        System.out.println();

        System.out.println("SEAL team six-bravo is loading to the plane with 4 of the best SEAL members");

        try {
            Thread.sleep(4000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Be ready to jump, because its going to be a ruff way down!");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.println();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        Scanner sc = new Scanner(System.in);

        String jumping = "f";

        {
            while (true) {
                System.out.print("Press f to jump!");
                String pf = sc.nextLine();

                if (jumping.equals(pf)) {
                    System.out.println("Great now you are in the skies dropping into the AO");
                    break;
                } else {
                    System.out.println("Please press f exactly like how its written!");


                }

            }
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        System.out.println("You are on the ground lets do this!");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Your team is now near a car press f to get in the car ");


    }
}