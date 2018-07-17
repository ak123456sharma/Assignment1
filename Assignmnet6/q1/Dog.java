package as6;

public class Dog implements Animal
{
   private String name; 

  
   public Dog(String name)
   {
      this.name = name;
   }
   
   
   public String getName()
   {
      return name;
   }
   
 
   public String speak()
   {
      return "woof!";
   }
   @Override
   public String eat() {
       return "Pedigree";
   }
}