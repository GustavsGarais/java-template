package rvt.Person_and_SubClass;

import rvt.Student;

public class Main {
    public static void main(String[] args) throws Exception {
        // Part 1
        /*
        Person ada = new Person ("Aka Lovelace", "24 Maddox St. London W1S 2QN");
        Person esko = new Person("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki");
        System.out.println(ada);
        System.out.println(esko);

        // Part 2
        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(ollie);
        System.out.println("Study credits " + ollie.credits());
        ollie.study();
        System.out.println("Study credits "+ ollie.credits());
        */

        // part 3
        //Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        //System.out.println(ollie);
        //ollie.study();
        //System.out.println(ollie);

        // part 4

        Teacher ada = new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200);
        Teacher esko = new Teacher("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki", 5400);
        System.out.println(ada);
        System.out.println(esko);

        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(ollie);
    }
}
