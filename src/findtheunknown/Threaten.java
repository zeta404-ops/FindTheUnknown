package findtheunknown;

import java.util.Scanner;

public class Threaten {
    Scanner sc = new Scanner(System.in);


    public void startThreaten() {

        System.out.println("Press e to take out the gun and aim at the bodyguard");

        String select = sc.nextLine();

        if (select.equals(select)) {
            System.out.println("the guard has surrendered himself");
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        System.out.println("You need to aim the guard and bring him out the backdoor");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.println("press x to aim the guard!");

        String x = sc.nextLine();
        if (x.equals(x)) {
            System.out.println("Now you need to walk him out the backdoor");
        } else {
            System.out.println("Please write the letter exactly like how its written!");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }

            System.out.println("press s to go slowly out the door with the guard!");
            String s = sc.nextLine();
            if (s.equals(s)) {
                System.out.println("You escaped with the quard!");
            } else {
                System.out.println("Please write the letter exactly like how its written!");

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }

                System.out.println("Mission successful!");
            }
        }
    }
}