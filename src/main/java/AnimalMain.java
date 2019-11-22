public class AnimalMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.eats();

        Cat cat = new Cat();
        cat.eats()   ;
        cat.sound();

        Home home = new Home();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Cat cat1 = new Cat();



        home.makeAllSounds(); // this doesn't do anything
        home.adoptPet(dog1);
        home.makeAllSounds();

        home.adoptPet(cat1);
        home.makeAllSounds();

        home.adoptPet(dog2);
        home.makeAllSounds();
    }
}
