import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AnimalTest {

    @Test
    void TestDogEats(){
        assertEquals("Food", Dog.eats());
        //assertEquals("food", Dog.eats());
    }
    @Test
    void TestCat(){
        assertEquals("Barkark", Cat.sound());
        assertEquals("Meow", Cat.sound());
        assertEquals("Meat", Cat.eats());
        assertEquals("Food", Cat.eats());
        assertEquals("food", Dog.eats());

    }


}
