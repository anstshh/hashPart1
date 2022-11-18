package Plenty;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
    Set<Integer> set = new HashSet<>(20);
    Random range = new Random();
    for (int i = 0; i < 20; i++) {
        set.add(range.nextInt(1000));
    }

    set.removeIf(e-> e % 2 == 1);
    System.out.println(set);
}
}
