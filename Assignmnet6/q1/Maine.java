package as6;

import java.util.ArrayList;

public class Maine {

	public static void main(String[] args)
    {

        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Dog("Bruno")); 
        animals.add(new Cat("Bella")); 

              
        for (Animal animal: animals) 
        {
            System.out.println(animal.getName()+ " : " + animal.speak() +" "+ "eats" + " : "+ animal.eat());
        }
    }
	}


