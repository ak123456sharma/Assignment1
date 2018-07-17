package as6;

public class Cat implements Animal
{
   private String name; 


   public Cat(String name)
   {
      this.name = name;
   }
 
  
   public String getName()
   {
      return name;
   }


   public String speak()
   {
      return "Meow!";
   }
   @Override
   public String eat() {
       return "Cat food";
   }
}