package bsu.rfe.java.group9.lab1.Pupko.varB9;

public class MainApplication {

    public static void main(String[] args) {
        int i1=0;
        int i2=0;
        int i3=0;
        int smallApple=0;
        int bigApple=0;;
        int singleEgg=0;
        int twoEggs=0;
        int threeEggs=0;
        int calories=-1;

        Food [] breakfast = new Food [20];
        int ItemsSoFar=0;
        for (String arg: args) {
            if(arg.startsWith("-")) {
                if (arg.equals("-calories")) {
                    calories=0;
                }

            }
            String[] parts = arg.split("/");
            if (parts[0].equals("Cheese")) {
                breakfast[ItemsSoFar] = new Cheese(); i1++;}
            else
            if (parts[0].equals("Apple")) {
                breakfast[ItemsSoFar] = new Apple(parts[1]);
                if(parts[1].equals("BIG")) { bigApple++;

                }
                if(parts[1].equals("SMALL")) { smallApple++;

                }
                i2++;
            } else
            if (parts[0].equals("Eggs")) {
                breakfast[ItemsSoFar] = new Eggs(parts[1]);
                if(parts[1].equals("одно")) { singleEgg++;

                }
                if(parts[1].equals("два")) { twoEggs++;

                }
                if(parts[1].equals("три")) { threeEggs++;

                }
                i3++;}

            ItemsSoFar++;

        }

        for (Food item: breakfast) {


            if (item!=null) {
                item.consume();
                if(calories>=0) {
                    calories+=item.calculateCalories();
                }
            }
            else
                continue;
        }

    }


}
