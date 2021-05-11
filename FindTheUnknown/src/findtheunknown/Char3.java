package findtheunknown;

public class Char3 {



    String charName3 = "Dimitri Berg";

    String gender3 = "Male";

    int age3 = 34;

    String birthplace3 = "Russia";

    double weight3 = 100.03;
    double height3 = 1.80 ;


    public Char3(String charName3, String gender3, int age3, String birthplace3, double weight3, double height3){

        this.charName3 = charName3;
        this.gender3 = gender3;
        this.age3 = age3;
        this.birthplace3 = birthplace3;
        this.weight3= weight3;
        this.height3 = height3;

    }

    @Override
    public String toString(){
        return "Name: " + charName3 + "\nGender: " + gender3 + "\nAge: " + age3 + "\nBirthplace: " + birthplace3 + "\nWeight: " + weight3 + "kg\nHeight: " + height3 + "m";
}

    }

