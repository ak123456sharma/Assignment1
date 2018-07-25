import java.util.ArrayList;

import java.util.Collections;

public class Test {

    public static void main(String args[]){
        ArrayList<Person> list=new ArrayList<Person>();
        Person s1= new Person(null, 0, 0);
        s1.setName("Ac");
        s1.setAge(25);
        s1.setId(1);
        Person s2=new Person(null, 0, 0);
        s2.setName("ab");
        s2.setAge(22);
        s2.setId(2);
        Person s3=new Person(null, 0, 0);
        s3.setName("Ak");
        s3.setAge(30);
        s3.setId(3);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        Collections.sort(list);

        for(Person a:list){
            System.out.println(a.getName()+""+a.getAge());
        }
    }
}