
package findtheunknown;

import java.util.Scanner;

public class Story {

    Scanner sc = new Scanner(System.in);

    //the story class

    public void StoryBegin() {
/* beginning*/
        System.out.println("______ _           _ _____ _          _   _       _                              \n" +
                "|  ___(_)         | |_   _| |        | | | |     | |                             \n" +
                "| |_   _ _ __   __| | | | | |__   ___| | | |_ __ | | ___ __   _____      ___ __  \n" +
                "|  _| | | '_ \\ / _` | | | | '_ \\ / _ \\ | | | '_ \\| |/ / '_ \\ / _ \\ \\ //\\ / / '_ \\ \n" +
                "| |   | | | | | (_| | | | | | | |  __/ |_| | | | |   <| | | | (_) \\ V  V /| | | |\n" +
                "\\_|   |_|_| |_|\\__,_| \\_/ |_| |_|\\___|\\___/|_| |_|_|\\_\\_| |_|\\___/ \\_/\\_/ |_| |_|");

        System.out.println("\n--------------------------------------------------------------\n");

        //this is where the game begins static texts
        System.out.println("Now let's begin");
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        System.out.println("3");
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        System.out.println("2");
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        System.out.println("1");
        System.out.println("\n--------------------------------------------------------------\n");
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

           //choose a main char
        CharacterAdd charAdding = new CharacterAdd();
        System.out.println();
        System.out.println("Choose a main character from 1-2.");
        System.out.println();
        System.out.println("\n--------------------------------------------------------------\n");
        System.out.println(charAdding.russ.charName + "\nAge: " + charAdding.russ.age);
        System.out.println(charAdding.dimitri.charName + "\nAge: " + charAdding.dimitri.age);
        System.out.println("\n--------------------------------------------------------------\n");

        Story selectChar= new Story();

        int selectChar1 = selectChar.sc.nextInt();

        switch(selectChar1) {
            case 1:
                System.out.println("Your chosen character now is " + charAdding.russ.charName + " Here is full info:\n" + charAdding.russ);
                break;
            case 2:
                System.out.println("Your chosen character now is " + charAdding.dimitri.charName + " Here is full info:\n" + charAdding.dimitri);
                break;
        }


              /*time and place*/

        System.out.println("\n--------------------------------------------------------------\n");

        System.out.println("Place: Norlisk ");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Time: 12.30pm");
        System.out.println("\n--------------------------------------------------------------\n");


        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }


               /*texts*/
        System.out.println("\n--------------------------------------------------------------\n");
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
        System.out.println("\n--------------------------------------------------------------\n");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        System.out.println();
        System.out.println("\n--------------------------------------------------------------\n");
        System.out.println("SEAL team six-bravo is loading to the plane with 4 of the best SEAL members");

        try {
            Thread.sleep(4000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Be ready to jump, because its going to be a rough way down!");
        System.out.println("\n--------------------------------------------------------------\n");
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


           /*small actions for jumping and others*/



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
            Thread.sleep(20000);
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


        /* selecting weapon class*/

        System.out.println();
        System.out.println("Choose a class to fight with by typing the number of the classes from 1-3.");
        System.out.println();
        System.out.println("\n--------------------------------------------------------------\n");
        System.out.println("First class is M4A4");
        System.out.println("Second class is Scar-L");
        System.out.println("Third class is HK17");
        System.out.println("\n--------------------------------------------------------------\n");
         Story selectClass = new Story();

        int Story = selectClass.sc.nextInt(4);

        switch(Story){
            case 1:
                System.out.println("You selected M4A4 with Holographic and angled grip");
                break;
            case 2:
                System.out.println("You selected Scar-L with Red-Dot and vertical grip");
                break;
            case 3:
                System.out.println("You selected HK17 with 2x and Bipod");
                break;
        }



        /*options for fighting or exiting*/
        System.out.println();
        System.out.println("Now select what do you want to do!");
        System.out.println();
        System.out.println("Fight: Fight the Ex-Cia");
        System.out.println("Exit: Get out of the area");
        System.out.println("Sneak: sneaks and tries to kidnap the Ex-Cia");

         Story selectDoing = new Story();

        String select = sc.nextLine();

        switch(select){
            case "Fight":
                System.out.println("You selected to fight the Ex-Cia");
                Action ac = new Action();
                ac.fightBegin();
                break;
            case "Exit":
                System.out.println("You selected to get out of the area");
                System.exit(0);
                break;
            case "Sneak":
                System.out.println("You selected to sneak and kidnap the Ex-Cia");
                Sneak snk = new Sneak();
                snk.sneakBegin();
                break;

        }



    }

}