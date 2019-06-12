package fifoAnimalShelter;

import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class AnimalShelterTest {

    @Test
    public void test_dequeue() {
        AnimalShelter instance = new AnimalShelter();
        instance.enqueue(new Cat("Petty"));
        instance.enqueue(new Dog("Harry"));
        assertEquals( "Harry", instance.dequeue("dog").animalName);
    }

    // test if pref is neither dog or cat
    @Test
    public void test_dequeueWithBird() {
        AnimalShelter instance = new AnimalShelter();
        assertEquals(null,instance.dequeue("bird"));
    }

    //test if there is no dog in shelter
    @Test(expected = NoSuchElementException.class)
    public void test(){
        AnimalShelter forTest = new AnimalShelter();
        forTest.enqueue(new Cat("Petty"));
        forTest.dequeue("dog");
    }
}