package bsu.rfe.java.group9.lab1.Pupko.varB9;
public class Apple extends Food implements Consumable{
    private String size;

    public Apple(String size) {
        super("яблоко");
        this.size=size;
    }




    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }


    public void consume() {
        System.out.println(this + " съедено");

    }
    public int calculateCalories() {
        if (this.size.equals("BIG")) {

            return 145; }
        else
            return 110;




    }
    public String toString() {
        return super.toString() + " размера " + size.toUpperCase() + " ";

    }
    public boolean equals(Object arg0) {
        if (super.equals(arg0)) {
            if (!(arg0 instanceof Apple)) return false;
            return size.equals(((Apple)arg0).size);
        } else
            return false;
    }


}
