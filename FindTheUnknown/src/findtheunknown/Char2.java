package findtheunknown;

public class Char2 {


    /*char 2*/

    String charName2 = "Dominique Giacinta";

    String gender2 = "Female";

    int age2 = 31;

    String birthplace2 = "Mexico";

    double weight2 = 86.03;
    double height2 = 1.52;

    public Char2(String charName2, String gender2, int age2, String birthplace2, double weight2, double height2) {

        this.charName2 = charName2;
        this.gender2 = gender2;
        this.age2 = age2;
        this.birthplace2 = birthplace2;
        this.weight2 = weight2;
        this.height2 = height2;
    }
    @Override
    public String toString(){
        return "Name: " + charName2 + "\nGender: " + gender2 + "\nAge: " + age2 + "\nBirthplace: " + birthplace2 + "\nWeight: " + weight2 + "kg\nHeight: " + height2 + "m";
    }
}