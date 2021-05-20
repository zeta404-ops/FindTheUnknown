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

            System.out.println("press s to go slowly out of the door with the guard!");
            String s = sc.nextLine();
            if (s.equals(s)) {
                System.out.println("You escaped with the guard!");
            } else {
                System.out.println("Please write the letter exactly like how its written!");

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }

                System.out.println("The Ex Cia and their team gave up from now on!");

                System.out.println(" __  __ _       _          ___                       __      _ \n" +
                        "|  \\/  (_)_____(_)___ _ _ / __|_  _ __ __ ___ ______/ _|_  _| |\n" +
                        "| |\\/| | (_-<_-< / _ \\ ' \\\\__ \\ || / _/ _/ -_|_-<_-<  _| || | |\n" +
                        "|_|  |_|_/__/__/_\\___/_||_|___/\\_,_\\__\\__\\___/__/__/_|  \\_,_|_|");

                //completion certify
                Completed comp = new Completed();
                comp.YouCompleted();

            }
        }
    }
}