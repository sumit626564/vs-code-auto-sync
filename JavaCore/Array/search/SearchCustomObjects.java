package JavaCore.Array.search;

import java.util.ArrayList;
import java.util.Scanner;

class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}

public class SearchCustomObjects {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Person> people = new ArrayList<>();

        people.add(new Person("Sumit",23));
        people.add(new Person("Rahul", 25));
        people.add(new Person("Priya", 22));

        System.out.println("Search : Type Any thing: ");
        String  searchName = input.nextLine();
        boolean foundd = false;
        for(Person p : people){      // "p" is a temporarily  Variable
            if(p.name.equals(searchName)){
                System.out.println("Found: " + p.name + " age: "+ p.age);
                foundd = false;
            }
        }
        input.close();
    }
}
