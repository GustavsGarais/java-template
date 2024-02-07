package rvt.Person_and_SubClass;

public class Teacher extends Person {
    private String Teachername;
    private String Teacheradress;
    private int salury;

    public Teacher(String Teachername, String Teacheradress, int salury) {
        this.Teachername = Teachername;
        this.Teacheradress = Teacheradress;
        this.salury = salury;
    }

    public int credits() {
        return this.credits;
    }

    
}
