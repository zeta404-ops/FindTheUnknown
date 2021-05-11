package findtheunknown;


import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Sneak {

    Scanner sc = new Scanner(System.in);
    private Object String;

    public void sneakBegin() {

        /*sneak tactics*/

        System.out.println("Okay let's start the plan!");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }


        String laptop = "i";

        while (true) {
            System.out.println("Press i to open the phone");
            String pf = sc.nextLine();

            if (laptop.equals(pf)) {
                System.out.println("Phone opened successfully connecting to the HQ!");
                break;
            } else {
                System.out.println("Please type the letter exactly like how its written!");

            }

        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }


        String thisCode = "3848539";

        while (true) {
            System.out.print("write this code exactly (3848539) to see how many bodyguards there are!");
            String pf = sc.nextLine();

            if (thisCode.equals(pf)) {
                System.out.println("5");
                break;
            } else {
                System.out.println("Please write the code exactly like how its written!");

            }

        }

        String thisCode2 = "89237";

        while (true) {
            System.out.print("write this code exactly (89237) to see where the bodyguards are!");
            String pf = sc.nextLine();

            if (thisCode2.equals(pf)) {
                System.out.println("there is 3 bodyguards in the front of the warehouse and one is sitting by the table on the CCTV room and the last one is in the same room with him");
                break;
            } else {
                System.out.println("Please write the code exactly like how its written!");

            }


            System.out.println("We are getting closer to the backdoor of the warehouse");

            System.out.println("Open the door by tapping e four times if you want to open the door quietly");

            String a = sc.nextLine();

            if (a.equals("eeee")) {
                System.out.println("You opened the door quietly");
            } else if (a.equals(String)) {
                System.out.println("Made too musch noise");


            }
        }
    }
}

