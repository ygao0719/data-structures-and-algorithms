package fifoAnimalShelter;

import stacksandqueues.Node;
import stacksandqueues.Queue;

import java.util.NoSuchElementException;

public class AnimalShelter {
    Queue<Dog> dogQ = new Queue<>();
    Queue<Cat> catQ = new Queue<>();

    public void enqueue(Animal animal){
        if (animal instanceof Cat){
            catQ.enqueue((Cat) animal)
        }else if (animal instanceof Dog){
            dogQ.enqueue((Dog) animal);
        }else {
            throw new NoSuchElementException();
        }
    }
    public Animal dequeue(String pref) {
        if (pref.equals("cat")||pref.equals("Cat")){
            return catQ.dequeue();
        }else if (pref.equals("dog")||pref.equals("Dog")){
            return dogQ.dequeue();
        }
        return null;
    }

    }
