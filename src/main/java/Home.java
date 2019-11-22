import java.util.ArrayList;

public class Home {

    private ArrayList<Animal> animals;



    public Home()
    {
        animals = new ArrayList<Animal>();
    }

    public void adoptPet(Animal animal)
    {

        animals.add(animal);
    }

    public void makeAllSounds()
    {
        for(Animal animal: animals )
        {
            animal.sound();
        }

    }


}
