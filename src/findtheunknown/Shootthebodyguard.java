package findtheunknown;


import java.util.Scanner;

public class Shootthebodyguard {

    Scanner sc = new Scanner(System.in);
    public void startShooting(){

        System.out.println("Press y to shoot");

        String u = sc.nextLine();

        if (u.equals("y")) {
            System.out.println("You shot the bodyguard and there was a big noise!!!");
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        System.out.println("You are now being surrounded by 4 other bodyguards and there is no way out!");

        try {
            Thread.sleep(1500);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Mission Unsuccessful! Try again.");
        System.out.println(" ___ ___             _______       __ __          __ \n" +
                "|   Y   .-----.--.--|   _   .---.-|__|  .-----.--|  |\n" +
                "|   1   |  _  |  |  |.  1___|  _  |  |  |  -__|  _  |\n" +
                " \\_   _/|_____|_____|.  __) |___._|__|__|_____|_____|\n" +
                "  |:  |             |:  |                            \n" +
                "  |::.|             |::.|                            \n" +
                "  `---'             `---'   ");

        Story startAgain = new Story();
        startAgain.StoryBegin();

    }


}

