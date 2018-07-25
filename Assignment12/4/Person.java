import java.util.Comparator;

public class Person implements Comparable<Person> {
    int id;
    String name;
    int age;

    public int compareTo(Person s1) {
          return this.age-s1.age;
       }

    //Constructor
    public Person(String name,int id,int age) {
        // TODO Auto-generated constructor stub
        this.name="";
        this.id=0;
        this.age=0;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

}