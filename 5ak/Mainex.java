
public class Mainex {
    public static void main(String[] args) {

        Animal animal = new Animal();

        Cat cat = new Cat();
        Cat tuf = new Cat("Ragdoll", "white");
        System.out.println(tuf.toString());

        Dog dog = new Dog();
        Dog tuffy=new Dog("German Shepard","Greyish-black");
        System.out.println(tuffy.toString());
         

        System.out.println();

         

        animal.speak();

        

         

        cat.speak();

      

         

        dog.speak();

       
    }


}
