
package findtheunknown;


public class Story {





    public static void StoryBegin() {

        System.out.println("Place: Norlisk ");
        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        System.out.println("Time: 12.30pm");

        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        System.out.println("We are the SEAL Team Six-Bravo");
        try
        {
            Thread.sleep(3000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        System.out.println("We are trying to execute a deadly ex cia member who was betrayed by his own people in government because he knew too many things.");
        try
        {
            Thread.sleep(6000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        System.out.println("He went missing and now he is a thread to the nation");



    }

}
