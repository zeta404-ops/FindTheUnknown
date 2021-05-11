package findtheunknown;

public class Char1 {

    String charName1 = "Russ Brown";

    String gender1 = "Male";

    int age1 = 39;

    String birthplace1 = "US";

    double weight1 = 87.03;
    double height1 = 1.90;


    public Char1(String charName1, String gender1, int age1, String birthplace, double weight, double height){

        this.charName1 = charName1;
        this.gender1 = gender1;
        this.age1 = age1;
        this.birthplace1 = birthplace;
        this.weight1 = weight1;
        this.height1 = height1;

    }
    @Override
    public String toString(){
        return "Name: " + charName1 + "\nGender: " + gender1 + "\nAge: " + age1 + "\nBirthplace: " + birthplace1 + "\nWeight: " + weight1 + "kg\nHeight: " + height1 + "m";
    }
    }
