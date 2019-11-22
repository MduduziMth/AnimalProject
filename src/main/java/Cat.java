public class Cat extends Animal {
    private static String name = "Stormy";
    public Cat(){
        super(name);
    }
    public void sound()
    {
        System.out.println("Cat meows");
    }
}