package com.cbfacademy;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CollectionsExercises {

    public ArrayList<Integer> useArrayList() {
        ArrayList<Integer> newArrayList = new ArrayList<Integer>();

        // - add 4 as the first element of the list
        newArrayList.add(4);
        // - then add 5, 6, 8, 2, 9 to the list
        newArrayList.add(5);
        newArrayList.add(6);
        newArrayList.add(8);
        newArrayList.add(2);
        newArrayList.add(9);
        // - add another 2 as the last element of the list
        newArrayList.add(2);
        // - add 4 as the 3rd element of the list
        newArrayList.add(2, 4);
        // - invoke the method get(0) on the list and print the result on the screen
        System.out.println(newArrayList.get(0));
        // - return the list
        return newArrayList;
    }

    public ArrayDeque<Integer> useArrayDeque() {
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        // - add 5, 6, 8, 9 to the queue
        queue.add(5);
        queue.add(6);
        queue.add(8);
        queue.add(9);
        // - print the first element of the queue on the screen
        System.out.print(queue.peekFirst());
        // - print the last element of the queue on the screen
        System.out.print(queue.peekLast());
        // - invoke the method poll() on the queue and print the result on the screen
        System.out.print(queue.poll());
        // - invoke the element() method on the queue and print the result on the screen
        System.out.print(queue.element());
        // - return the queue
        return queue;
    }

    public HashSet<Integer> useHashSet() {
        HashSet<Integer> hashSet = new HashSet<>();
        // - add 1, 2, 3, 4 to the set
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        // - add 2 again (duplicate)
        hashSet.add(2);
        // - print the size of the set on the screen
        System.out.print(hashSet.size());
        // - add 5 and 1 to the set (1 is a duplicate)
        hashSet.add(5);
        hashSet.add(1);
        // - determine whether the set contains 3 and print the result on the screen
        System.out.print(hashSet.contains(3));
        // - determine whether the set contains 9 and print the result on the screen
        System.out.print(hashSet.contains(9));
        // - remove 2 from the set
        hashSet.remove(2);
        // - print the size of the set on the screen
        System.out.print(hashSet.size());
        // - return the set
        return hashSet;
    }

    public HashMap<Integer, String> useHashMap() {
        HashMap<Integer, String> hashMap = new HashMap<>();

        // - add {1, TypeScript} entry to the map
        hashMap.put(Integer.valueOf(1), "TypeScript");
        // - add {2, Kotlin} entry to the map
        hashMap.put(Integer.valueOf(2), "Kotlin");
        // - add {3, Python} entry to the map
        hashMap.put(Integer.valueOf(3), "Python");
        // - add {4, Java} entry to the map
        hashMap.put(Integer.valueOf(4), "Java");
        // - add {5, JavaScript} entry to the map
        hashMap.put(Integer.valueOf(5), "JavaScript");
        // - add {6, Rust} entry to the map
        hashMap.put(Integer.valueOf(6), "Rust");
        // - determine the set of keys from the map and print it on the screen
        System.out.print(hashMap.keySet());
        // - determine the set of values from the map and print it on the screen
        System.out.print(hashMap.values());
        // - determine whether the map contains "English" as a language and print the
        // result on the screen
        System.out.print(hashMap.containsValue("English"));
        // - return the map
        return hashMap;
    }

    public String getName() {
        return "Collections Exercises";
    }
}
