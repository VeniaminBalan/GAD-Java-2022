package Test;

import java.util.HashMap;
import java.util.Map;

import java.util.*;

public class Main {
    public static void main(String args[]) {
        TreeSet tree = new TreeSet();
        tree.add("Roots");
        tree.add("Stem");
        tree.add("Branch");
        tree.add("Leaves");
        tree.remove("fruits");
        System.out.println("Elements are : " + tree);
    }
}