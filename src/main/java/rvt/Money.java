package rvt;

public class Money {

    private final int euros;
    private final int cents;

    // Contructor
    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    // Constructor overloading 
    // Second class constructor
    public Money(){
        this.euros = 0;
        this.cents = 0;
    }

    // Third constructor
    public Money(int euros) {
        this.euros = euros;
        this.cents = 0;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money newMoney2){
        int newEuros = this.euros + newMoney2.euros;

        return new Money(newEuros, 0);
    }

    public boolean lessThan(Money compared){

        Money newMoney1 = new Money(10, 0);
        Money newMoney2 = new Money(3, 0);
        Money newMoney3 = new Money(5, 0);

        System.out.println(newMoney1.lessThan(newMoney2)); // False
        System.out.println(newMoney2.lessThan(newMoney3)); // True
        return false;
    }

    public Money minus(Money decreaser){
        if (this.euros - decreaser.euros <= 0) {

            Money newMoney1 = new Money(10, 0);
            Money newMoney2 = new Money(3, 50);

            Money newMoney3 = newMoney1.minus(newMoney2);

        }
        return decreaser;
    }
}