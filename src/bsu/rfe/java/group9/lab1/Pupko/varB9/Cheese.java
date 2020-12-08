package bsu.rfe.java.group9.lab1.Pupko.varB9;

public class Cheese extends Food implements Consumable {

    public Cheese() {
        super("сыр");


    }


    public void consume() {
        System.out.println( this + " съеден");

    }
    public int calculateCalorie() {
        return 300;
    }

}