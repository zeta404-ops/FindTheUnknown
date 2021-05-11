package findtheunknown;

public class Char4 {


    String charName4 = "Benjamin Leonardo";

    String gender4 = "Male";

    int age4= 27;

    String birthplace4 = "UK";

    double weight4= 87.03;
    double height4 = 1.90 ;



    public Char4(String charName4, String gender4, int age4, String birthplace4, double weight4, double height4) {

        this.charName4 = charName4;
        this.gender4 = gender4;
        this.age4 = age4;
        this.birthplace4 = birthplace4;
        this.weight4 = weight4;
        this.height4 = height4;
    }
    @Override
    public String toString(){
        return "Name: " + charName4 + "\nGender: " + gender4 + "\nAge: " + age4 + "\nBirthplace: " + birthplace4 + "\nWeight: " + weight4 + "kg\nHeight: " + height4 + "m";
    }

}
