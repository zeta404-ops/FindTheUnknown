
package findtheunknown;

import java.util.Scanner;

public class Story {

    Scanner sc = new Scanner(System.in);
    public void StoryBegin() {

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

        String jumping = "f";

        {
            while (true) {
                System.out.print("Press f to jump!");
                String pf = sc.nextLine();

                if (jumping.equals(pf)) {
                    System.out.println("Great now you are in the skies dropping into the AO!");
                    break;
                } else {
                    System.out.println("Please press f exactly like how its written!");


                }

            }
        }

        try {
            Thread.sleep(11000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        System.out.println("You are on the ground lets do this!");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        String getInTheCar = "f";

        while (true) {
            System.out.print("Your team is now near a car press f to get in the car!");
            String pf = sc.nextLine();

            if (getInTheCar.equals(pf)) {
                System.out.println("Great now you are in the car! Driving to these coordinates ( Latitude 69.327521 | Longitude: 87.952072 ) ETA 2 Minutes");
                break;
            } else {
                System.out.println("Please press f exactly like how its written!");


            }

        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        String getOutTheCar = "f";

        while (true) {
            System.out.print("You have arrived to the destination! Press f to get out of the car.");
            String pf = sc.nextLine();

            if (getOutTheCar.equals(pf)) {
                System.out.println("Great now you are ready to fight!");
                break;
            } else {
                System.out.println("Please press f exactly like how its written!");
            }
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        String nightVisions = "n";

        while (true) {
            System.out.print("Press n to activate the night visions!.");
            String pf = sc.nextLine();

            if (nightVisions.equals(pf)) {
                System.out.println("Night visions activated ready to combat.");
                break;
            } else {
                System.out.println("Please press n exactly like how its written!");


            }
        }
    }
}