public class Cat extends Animal {
 String breed;
 String color;
public Cat(String breed, String color) {
	
this.breed=breed;
this.color=color; 
}
public String getBreed()
{
    return breed;
}
public String getColor()
{
    return color;
}
@Override
public String toString()
{
    return(".\nMy breed and color are " +
           this.getBreed()+","+ this.getColor());
}
    public Cat() {

        super();

        System.out.println("A new cat has been created!");

    }

     

    @Override

    public void speak() {

        System.out.println("A cat meoow");

    }

     


}
