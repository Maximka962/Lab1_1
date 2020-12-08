package bsu.rfe.java.group9.lab1.Pupko.varB9;

public abstract class Food implements Consumable, Nutritious {

    String name = null;
    String size= null;
    Double number=null;
    public String getSize() {
        return size;
    }
    public Double getNumb() {
        return number;
    }

    public void setSize(String size) {
        this.size = size;
    }
public void setNumb(Double numb){
        this.number=number;
}

    public Food (String name) {
        this.name=name;
    }


    public boolean equals(Object arg0) {
        if(!(arg0 instanceof Food)) return false;
        if(name==null || ((Food)arg0).name==null) return false;
        return name.equals(((Food)arg0).name);

    }


    public String toString() {
        return name;
    }
    public String getName() {
        return name;
    }
    public void setName (String name) {
        this.name = name;
    }


}