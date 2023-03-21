public class Snake extends Animal{
    private boolean venomous;

    public Snake(boolean venomous) {
        this.venomous = venomous;
    }

    @Override
    public void makeSound() {
        if (venomous) {
            System.out.println("SSssSSssssS");
        } else {
            System.out.println("s s s s");
        }
    }
}
