
package rvt.Person_and_SubClass;

public class Student extends Person{
    private String name;
    private String address;
    private int credits;

    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void study() {
        credits++;
        int credits = 0;
            while (credits < 25) {
            ollie.study();
            credits = credits + 1;
            }
    }

    public int credits() {
        return this.credits;
    }
    
    public String toString() {
        return name + " \n " + this.address + "Study credits " + this.credits;
        // part 3
        //return name + " \n " + this.address  + " \n" + "Study credits " + this.credits;
    }
    
}