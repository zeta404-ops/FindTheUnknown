package findtheunknown;

import java.util.Scanner;

public class Heavy {

    Scanner sc = new Scanner(System.in);

    public void heavyBegin() {

        System.out.println("      _________\n" +
                "         /'        /|\n" +
                "        /         / |_\n" +
                "       /         /  //|\n" +
                "      /_________/  ////|\n" +
                "     |   _ _    | 8o////|\n" +
                "     | /'// )_  |   8///|\n" +
                "     |/ // // ) |   8o///|\n" +
                "     / // // //,|  /  8//|\n" +
                "    / // // /// | /   8//|\n" +
                "   / // // ///__|/    8//|\n" +
                "  /.(_)// /// |       8///|\n" +
                " (_)' `(_)//| |       8////|___________\n" +
                "(_) /_\\ (_)'| |        8///////////////\n" +
                "(_) \\\"/ (_)'|_|         8/////////////\n" +
                " (_)._.(_) d' Hb         8oooooooopb'\n" +
                "   `(_)'  d'  H`b\n" +
                "         d'   `b`b\n" +
                "        d'     H `b\n" +
                "       d'      `b `b\n" +
                "      d'           `b\n" +
                "     d'             `b");

        /*heavy gunning texts*/
        System.out.println();
        System.out.println("Bringing the heavy gun classes select one below!");

        /*selecting heavy guns*/
        System.out.println();
        System.out.println("Now select which heavy gun do you want to use!");
        System.out.println("\n--------------------------------------------------------------\n");
        System.out.println("1: RPK 7.62 / 2x 75-round drum magazine");
        System.out.println("2: AEK-999 7.62 / 2x 100-round box contained");
        System.out.println("3: FN Minimi 5.56 / 1x 200-round belt contained");
        System.out.println("\n--------------------------------------------------------------\n");

        Heavy selectHeavyGun = new Heavy();

        int select = sc.nextInt();

        switch(select){
            case 1:
                System.out.println("You selected RPK 7.62 / 2x 75-round drum magazine");
                break;
            case 2:
                System.out.println("You selected AEK-999 7.62 / 2x 100-round box contained");
                break;
            case 3:
                System.out.println("You selected FN Minimi 5.56 / 1x 200-round belt contained");
                break;

        }

        /*after selecting now shootings*/
        System.out.println();
        System.out.println("Now that you selected the " + select + " class. ");
        System.out.println();



        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        /*shoot the warehouse*/

        String shootTw= "e";

        while (true) {
            System.out.println();
            System.out.print("Press e to shoot the warehouse and the body guards!");
            String skan = sc.nextLine();

            if (skan.equals("e")) {
                System.out.println();
                System.out.println("Shooting the warehouse and the body guards!!!");
                break;
            } else {
                System.out.println("Please write the letter exactly like how its written!");

            }

        }

        try {
            Thread.sleep(4000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        System.out.println();
        System.out.println("You killed 2 of the body guards! going forward!!!");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        /* id the wounded*/

        System.out.println("the ex cia and the body guards shot one of the seal members");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.println();
        System.out.println("identifying the wounded seal member");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        System.out.println("identification successful the seal member is ");
     //made an char adding to call the strings without making other classes
       CharacterAdd charAdding = new CharacterAdd();
       Character dominique = charAdding.dominique;
        System.out.println(charAdding.dominique.charName);


        /* forward command*/

        String goF= "w";

        while (true) {
            System.out.println();
            System.out.print("Press w to go forward!");
            String ed = sc.nextLine();

            if (goF.equals(ed)) {
                System.out.println("Going forward!!!");
                break;
            } else {
                System.out.println("Please write the letter exactly like how its written!");

            }

        }
        /*fight scene*/
        System.out.println("Two body guards left one of them killed by your teammate");
        System.out.println();
        System.out.println("One body guard and the Ex-Cia left but your teammate got wounded getting their info now!");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
         //calling benjamin's name from another class
        System.out.println(charAdding.benjamin.charName +" is heavily wounded he won't make it");


        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Heavy fight between the seals and the enemy");
        System.out.println("You just got shot to your left arm");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Your teammate killed last body guard! its now you and two teammates with the ex cia left");
        System.out.println("He wouldn't give up");
        System.out.println();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.println("You shot him and he is now dead!");
        System.out.println();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.println("You successfully completed the mission");
        System.exit(0);


 }
}