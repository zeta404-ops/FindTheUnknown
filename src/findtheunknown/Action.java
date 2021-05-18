package findtheunknown;

import java.util.Scanner;

public class Action {
    /*scanner*/
    Scanner sc = new Scanner(System.in);

    public void fightBegin() {
    {

           /*first text of action*/
        System.out.println();
        System.out.println("You chose action! Your team is standing by.");


        /*options for fighting or exiting*/
        System.out.println();
        System.out.println("Now select what do you want to do next! please write the words exactly like how it is provided!");
        System.out.println();
        System.out.println("Heavy: Heavy gun the warehouse");
        System.out.println("Exit: Exit mission");

        Story selectDoing = new Story();

        String select = sc.nextLine();
          //selection
        switch(select){
            case "Heavy":
                System.out.println("You chose to heavy gun the warehouse");
                Heavy start = new Heavy();
                start.heavyBegin();
                break;
            case "Exit":
                System.out.println("You exited the mission!");
                System.exit(0);
                break;
        }
      }
    }
  }
