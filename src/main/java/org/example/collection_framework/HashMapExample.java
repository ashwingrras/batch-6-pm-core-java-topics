package org.example.collection_framework;

import java.util.*;

/*
        1. List  : Dynamic Array:
          1.1 ArrayList   : traverse fast, insertion, deletion slow : index
          1.2 LinkedList  : traverse slow, insertion, deletion fast : address
          1.3 Stack
          1.4 Vector
        2. Queue : related method of queue
           2.1 PriorityQueue
           2.1 ArrayDeque  : Queue + Stack
        3. Set   : Unique element
            3.1 HashSet : unordered
            3.2 LinkedHashSet : insertion order
            3.3 TreeSet   : sorted ascending
        4. Map   : key, value
           4.1 Hashtable   :
           4.2 HashMap     : unsorted
           4.3 LinkedHashMap : insertion order
           4.4 TreeMap   : sorted ascending




 */

public class HashMapExample
{

    public static void main(String[] args) {


        List<String> studentList = new LinkedList<>();
        studentList.add("arpit");

        TreeMap<Integer, String> hashMap = new TreeMap<>();
        hashMap.put(101,"Arpit");
        hashMap.put(102, "Vipul");
        hashMap.put(202, "Vipul");
        hashMap.put(201, "Vipul");
        System.out.println("hashMap "+hashMap);
        hashMap.forEach((k,v )-> {
            //System.out.println("k "+k);
            //System.out.println("v "+v);
        });
        System.out.println(hashMap.containsKey(1001));
        //System.out.println(hashMap.get(1011).toUpperCase());
        System.out.println(hashMap.getOrDefault(101,"NA"));
        System.out.println(hashMap.containsValue("Arpita"));
        hashMap.putIfAbsent(201,"Sumit");
        //hashMap.put(101,"krishna");
        hashMap.putIfAbsent(101,"krishna");
        System.out.println("hashMap "+hashMap);
        hashMap.replace(101,"alwaz");
        System.out.println("hashMap "+hashMap);
        System.out.println(hashMap.replace(101,"alwaz111","arpit"));
        System.out.println("hashMap "+hashMap);
    }
}
