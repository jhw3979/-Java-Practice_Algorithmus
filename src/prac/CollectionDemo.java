package prac;

import java.util.*;

class HashMapDemo {
    void HashMap_run() {
        HashMap<String, Integer> a = new HashMap<String, Integer>();
        a.put("one", 1);
        a.put("two", 2);
        a.put("three", 3);
        a.put("four", 4);
        System.out.println(a.get("one"));
        System.out.println(a.get("two"));
        System.out.println(a.get("three"));
        System.out.println(a.get("four"));

        iteratorUsingForEach(a);
        iteratorUsingIterator(a);
    }

    static void iteratorUsingForEach(HashMap map) {
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }


    static void iteratorUsingIterator(HashMap map) {
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> i = entries.iterator();
        while (i.hasNext()) {
            Map.Entry<String, Integer> entry = i.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

class HashSetDemo{
    void HashSet_run(){
        HashSet<String> hs = new HashSet<String>();
        hs.add("one");
        hs.add("two");
        hs.add("three");
        hs.add("three");
        hs.add("four");

        Iterator hi = hs.iterator();
        System.out.println("hashset");
        while(hi.hasNext()){
            System.out.println(hi.next());
        }
    }
}

class ArrayListDemo {
    void ArrayList_run() {
        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("one");
        a1.add("two");
        a1.add("three");
        a1.add("four");

        for (int i = 0; i < a1.size(); i++) {
            String val = a1.get(i);
            System.out.println(val);
        }
    }
}

public class CollectionDemo {
    public void run() {
        HashMapDemo a = new HashMapDemo();
        a.HashMap_run();
    }
}
