
package findtheunknown;

/**
 *
 * @author masoo
 */
public class FindTheUnknown {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*character's toStrings*/
        Char1 c1 = new Char1("Russ Brown", "Male", 39, "US",87.03,1.90);
        Char2 c2 = new Char2("Dominique Giacinta", "Female", 31, "Mexico",86.03,1.52);
        Char3 c3 = new Char3("Dimitri Berg", "Male", 34, "Russia",100.03,1.80);
        Char4 c4 = new Char4("Benjamin Leonardo", "Male", 27, "UK",87.03,1.90);

        System.out.println("Characters:");
        System.out.println();
        System.out.println(c1);
        System.out.println();
        System.out.println(c2);
        System.out.println();
        System.out.println(c3);
        System.out.println();
        System.out.println(c4);
        System.out.println();

       /*action class*/
        Action ac = new Action();
        Action.fightBegin();
        /*story telling*/
        Story sc = new Story();
        Story.StoryBegin();


    }

}
