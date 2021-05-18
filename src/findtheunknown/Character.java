package findtheunknown;

   public class Character {

        String charName;
        String gender;
        int age;
        String birthplace;
        double weight;
        double height;

        public Character(String charName, String gender, int age, String birthplace, double weight, double height) {

            this.charName = charName;
            this.gender = gender;
            this.age = age;
            this.birthplace = birthplace;
            this.weight = weight;
            this.height = height;


        }
        @Override
        public String toString(){
            return "Name: " + charName + "\nGender: " + gender + "\nAge: " + age + "\nBirthplace: " + birthplace + "\nWeight: " + weight + "kg\nHeight: " + height + "m";
        }
    }