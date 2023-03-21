public class Dog extends Animal{
    private String breed;

    public Dog(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Vov! (" + breed + ")");
    }
}
