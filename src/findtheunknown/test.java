package findtheunknown;



import java.util.Scanner;

public class test {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Heavy ww = new Heavy();
        ww.heavyBegin();
*/
        String shootTw= "e";

        while (true) {
            System.out.println("\n--------------------------------------------------------------\n");
            System.out.print("Press e to shoot the warehouse and the body guards!");
            System.out.println("\n--------------------------------------------------------------\n");
            System.out.println("______ _           _ _____ _          _   _       _                              \n" +
                    "|  ___(_)         | |_   _| |        | | | |     | |                             \n" +
                    "| |_   _ _ __   __| | | | | |__   ___| | | |_ __ | | ___ __   _____      ___ __  \n" +
                    "|  _| | | '_ \\ / _` | | | | '_ \\ / _ \\ | | | '_ \\| |/ / '_ \\ / _ \\ \\ //\\ / / '_ \\ \n" +
                    "| |   | | | | | (_| | | | | | | |  __/ |_| | | | |   <| | | | (_) \\ V  V /| | | |\n" +
                    "\\_|   |_|_| |_|\\__,_| \\_/ |_| |_|\\___|\\___/|_| |_|_|\\_\\_| |_|\\___/ \\_/\\_/ |_| |_|");
            String skan = sc.nextLine();

            if (skan.equals("e")) {
                System.out.println();
                System.out.println("Shooting the warehouse and the body guards!!!");
                break;
            } else {
                System.out.println("Please write the letter exactly like how its written!");

            }

        }
        System.out.println("identification successful the seal member is ");

        CharacterAdd charAdding = new CharacterAdd();
        Character dominique = charAdding.dominique;
        System.out.println(charAdding.dominique.charName);

        System.out.println(charAdding.benjamin.charName +" is heavily wounded he won't make it");




        Completed bb = new Completed();
        bb.YouCompleted();


          /*
        Shootthebodyguard ss = new Shootthebodyguard();
        ss.startShooting();
        */

        System.out.println(" __  __ _       _          ___                       __      _ \n" +
                "|  \\/  (_)_____(_)___ _ _ / __|_  _ __ __ ___ ______/ _|_  _| |\n" +
                "| |\\/| | (_-<_-< / _ \\ ' \\\\__ \\ || / _/ _/ -_|_-<_-<  _| || | |\n" +
                "|_|  |_|_/__/__/_\\___/_||_|___/\\_,_\\__\\__\\___/__/__/_|  \\_,_|_|");





    }


}
