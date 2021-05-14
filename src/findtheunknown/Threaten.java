package findtheunknown;

import java.util.Scanner;

public class Threaten {
    Scanner sc = new Scanner(System.in);


    public void startThreaten(){

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

        System.out.println("You need to aim to the bring the guards");

    }
}
