package Pertemuan11;

import java.util.ArrayList;

public class E1_WrapperClass {
    public static void main(String[] args) {
        ArrayList<String> umur = new ArrayList<>();
        umur.add("20");
        umur.add("26");
        umur.add("34");

        for (String u : umur) {
            System.out.printf("%s (%s) \n", u, u.getClass().getSimpleName());
        }

        ArrayList<Integer> umurInt = new ArrayList<>();
        for (String u : umur) {
            umurInt.add(Integer.valueOf(u));
        }

        System.out.println();
        System.out.println("--- Setelah konversi ---");
        System.out.println();

        for (Integer u : umurInt) {
            System.out.printf("%d (%s) \n", u, u.getClass().getSimpleName());
        }
    }
}
