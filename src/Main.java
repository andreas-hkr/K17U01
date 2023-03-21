public class Main {
    public static void main(String[] args) {
        // Skapa några klasser som alla representerar djur, låt dem alla ärva från en gemensam klass Animal
        //  - Animal skall ha en abstrakt metod makeSound()
        //  - Animal <-- ( Mammal / Reptil ) <-- Dog / Snake
        //
        // Skapa en array med djur-objekt i, loopa igenom alla djur och kalla på deras makeSound-metod

        Animal[] animals = {
                new Dog("Tax"),
                new Snake(true),
                new Dog("Beagle"),
                new Snake(false)
        };

        for (int i=0; i < animals.length; i++) {
            animals[i].makeSound();
        }
    }
}