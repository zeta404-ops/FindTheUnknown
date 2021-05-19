package findtheunknown;

import java.util.Scanner;

public class Fight {

    Scanner sc = new Scanner(System.in);

    public void startF(){

        System.out.println("Press c to sprint towards him");

        String select = sc.nextLine();

        if (select.equals(select)) {
            System.out.println("Press f to punch");
        }
            String f = sc.nextLine();
        System.out.println("you hit!");
            if (f.equals(f)) {
                System.out.println("punch! by pressing f");
            }
                String b = sc.nextLine();
        System.out.println("you hit!");
                if (b.equals(f)) {
                    System.out.println("punch! by pressing f");
                }
                    String c = sc.nextLine();
        System.out.println("you hit!");
                    if (c.equals(f)) {
                        System.out.println("punch again! by pressing f");
                    }
        System.out.println("punch! by pressing f");
                        String d = sc.nextLine();
                        if (d.equals(f)) {
                            System.out.println("Now he is unconscious!");

                        }else{
                            System.out.println("Please write the letters exactly like its written!");
                        }

                            try
                            {
                                Thread.sleep(1500);
                            }
                            catch(InterruptedException ex)
                            {


                            }

                            System.out.println("Now you can get out of the hangar without anybody noticing.");

                            try
                            {
                             Thread.sleep(1500);
                            }
                             catch(InterruptedException ex)
                             {


                             }
                            System.out.println("Press e to open the door and run back to the car!");

                            String l = sc.nextLine();

                            if (l.equals("e")) {
                            System.out.println("Driving back to the HQ! ETA 1 min");
                                Completed comp = new Completed();
                                comp.YouCompleted();

            }
        }
    }

