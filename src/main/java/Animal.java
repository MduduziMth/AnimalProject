public class Animal {
    private String name;

    public Animal(String _name)
    {
        name = _name;
    }

    public void sound()
    {
        System.out.println("Makes sounds");
    }

    public void eats()
    {
        System.out.println( name + " eats");
    }
}
