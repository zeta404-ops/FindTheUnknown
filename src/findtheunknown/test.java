package findtheunknown;



import java.util.Scanner;

public class test {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
        System.out.println("identification successful the seal member is ");

        CharacterTest charAdding = new CharacterTest();
        Character dominique = charAdding.dominique;
        System.out.println(charAdding.dominique.charName);

    }


}
