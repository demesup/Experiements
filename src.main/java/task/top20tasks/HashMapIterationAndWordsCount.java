package task.top20tasks;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapIterationAndWordsCount {
    public static void main(String[] args) {
        wordCountHashMap();
        hashMapIteration();
    }


    private static void hashMapIteration() {
        HashMap<Integer, String> map = new HashMap();
        map.put(1, "hello");
        map.put(2, "how");
        map.put(3, "are");
        map.put(4, "ypu");
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry current = (Map.Entry) iterator.next();
            System.out.println("Key = " + current.getKey() + "; value = " + current.getValue());
        }

        for (Map.Entry current : map.entrySet()) {
            System.out.println("Key = " + current.getKey() + "; value = " + current.getValue());
        }
    }

    private static void wordCountHashMap() {
        String str = "My name is Sonya and what is your name ?";
        String[] strings = str.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if (map.containsKey(strings[i])) {
                int count = map.get(strings[i]);
                map.put(strings[i], count + 1);
            } else {
                map.put(strings[i], 1);
            }
        }
        System.out.println(map);
    }
}
