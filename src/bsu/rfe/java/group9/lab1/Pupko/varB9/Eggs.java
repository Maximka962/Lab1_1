package bsu.rfe.java.group9.lab1.Pupko.varB9;

public class Eggs extends Food implements Consumable {
private String number;
    public Eggs(String number) {
        super("яйца");
this.number=number;

    }
    public String getNumb() {
        return number;
    }
    public void setNumb(String number){
        this.number=number;
}

    public void consume() {
        System.out.println(number+ " "+ this+ " съедено");

    }
    public int calculateCalories() {
        if (this.number.equals("Одно")) {

            return 30; }
        else if (this.number.equals("Два")) {

            return 60; }
        else

        return 90;
    }
    public boolean equals(Object arg0) {
        if (super.equals(arg0)) {
            if (!(arg0 instanceof Eggs)) return false;
            return number.equals(((Apple)arg0).number);
        } else
            return false;
    }
}