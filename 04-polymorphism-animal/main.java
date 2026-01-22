public class Main {
    public static void main(String[] args) {

        Animal[] animals = {
            new Dog(),
            new Cat(),
            new Bird(),
            new Cow()
        };

        for (Animal a : animals) {
            a.makeSound();
        }
    }
}
