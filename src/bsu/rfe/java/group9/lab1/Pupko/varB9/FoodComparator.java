package bsu.rfe.java.group9.lab1.Pupko.varB9;

import java.util.Comparator;

public class FoodComparator implements Comparator<Food> {

    private final char[] alph = {'a' ,'b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

    @Override
    public int compare(Food  arg0,Food arg1) {

        char A = '0';
        char B = '0';
        int i = 0;


        if(arg0 == null) return -1;
        if(arg1 == null) return 1;


        if(arg0.getName().equals("Apple") && arg1.getName().equals("Apple")) {
            A = ((Apple) arg0).getSize().charAt(0);
            B = ((Apple) arg1).getSize().charAt(0);
            //System.out.println("Compare0! " + A + " "+ B);
        }else
        if(arg0.getName().equals("Apple") && arg1.getName().equals("Eggs")) {
            A = ((Apple) arg0).getSize().charAt(0);
            B = ((Eggs) arg1).getNumb().charAt(0);
            //System.out.println("Compare1! " + A + " "+ B);

        }else
        if(arg0.getName().equals("Eggs") && arg1.getName().equals("Eggs")) {
            A = ((Eggs) arg0).getNumb().charAt(0);
            B = ((Eggs) arg1).getNumb().charAt(0);
            //System.out.println("Compare2! " + A + " "+ B);
        }else
        if(arg0.getName().equals("Eggs") && arg1.getName().equals("Apple")) {
            A = ((Eggs) arg0).getNumb().charAt(0);
            B = ((Apple) arg1).getSize().charAt(0);
            //System.out.println("Compare3! " + A + " "+ B);
        }

        //if(A == B)return 0;
        while(i<alph.length) {
            if(A == alph[i] && B!=alph[i]) return 1;
            else if(B == alph[i] && A!=alph[i]) return -1;
            i++;
        }
        return 0;
    }
}