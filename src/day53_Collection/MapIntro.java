package day53_Collection;

import java.util.*;

public class MapIntro {
    public static void main(String[] args) {

        Map<String, String> credentials = new HashMap<>(); // could be random order
        Map<String, String> credentials2 = new LinkedHashMap<>(); // keeps the insertion order
        Map<String, String> credentials3 = new TreeMap<>(); // going to sort the order of numbers, doesnt accept null
        Map<String, String> credentials4 = new Hashtable<>();// same as Hashmap except Synchronization->Thread Safe

    }
}
