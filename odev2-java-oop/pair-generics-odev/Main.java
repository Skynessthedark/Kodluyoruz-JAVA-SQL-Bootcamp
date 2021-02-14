package soru3;

public class Main {

    public static void main(String[] args){
        Pair<Integer, String> p1 = new Pair<>(5, "Sayi");
        Pair<Double, Character> p2 = new Pair<>(2.3, 'A');

        System.out.println("For p1 ->\tfirst: "+p1.getFirst()+", second: "+p1.getSecond());
        System.out.println("For p2 ->\tfirst: "+p2.getFirst()+", second: "+p2.getSecond());
    }
}
