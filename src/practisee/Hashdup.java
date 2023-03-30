package practisee;

import java.util.*;

public class Hashdup {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the t");
        int t = s.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        HashSet<String> pairs = addPairsToHashSet(pair_left, pair_right);
        System.out.println(pairs.size());
    }

    public static HashSet<String> addPairsToHashSet(String[] pair_left, String[] pair_right) {
        HashSet<String> pairs = new HashSet<String>(pair_left.length);

        for (int i = 0; i < pair_left.length; i++) {
            pairs.add("(" + pair_left[i] + ", " + pair_right[i] + ")");
        }
        System.out.println(pairs);
        return pairs;
    }
}

