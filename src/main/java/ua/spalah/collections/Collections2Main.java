package ua.spalah.collections;


import ua.spalah.oop.Worker;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Collections2Main {

    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>(Arrays.asList("one", "two", "three"));

        List<String> list = strings;
        Queue<String> queue = strings;
        Deque<String> deque = strings;

        list.get(2);

        boolean isChanged = queue.offer("five");
        String poll = queue.poll();
        String peek = queue.peek();

        deque.push("four");
        String last = deque.getLast();

        Map<String, Worker> map = new HashMap<>();

        Set<Worker> workers = getWorkers();
        for (Worker worker : workers) {
            map.put(worker.getName(), worker);
        }

        String wrongName = "Kostya1";
        if (map.containsKey(wrongName)) {
            Worker wrong = map.get(wrongName);
            wrong.introduce();
        }

        Worker realKostya = map.put("Kostya", new Worker("Dima"));

        Worker kostya = map.get("Kostya");
        kostya.introduce();

        realKostya.introduce();

        Worker vlad = new Worker("Vlad");

        map.put(vlad.getName(), vlad);
        map.put("LzheVlad", vlad);

        Set<String> keys = map.keySet();
        Collection<Worker> values = map.values();

        Set<Map.Entry<String, Worker>> entries = map.entrySet();

        for (Map.Entry<String, Worker> entry : entries) {
            System.out.print(entry.getKey() + " ");
            entry.getValue().introduce();
        }

        Map<String, String> identityMap = new IdentityHashMap<>();
        identityMap.put("someKey", "val 1");
        identityMap.put(new String("someKey"), "val 2");

        System.out.println(identityMap);


        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(identityMap);
//        unmodifiableMap.put("some", "val 3"); // can't touch this


        List<String> subList = list.subList(1, 3);
        System.out.println(subList);

        List<String> strings1 = Collections.singletonList("1");
        List<Integer> integers = Arrays.asList(1, 2, 3);
        Set<Object> emptySet = Collections.emptySet();

        List<Worker> petyas = Collections.nCopies(50, new Worker("Petya"));
        System.out.println(petyas);


        printAll(deque);
        printAll(emptySet);
        printAll(map.entrySet());

        String[] array = subList.toArray(new String[0]);
        printAll(Arrays.asList(array));

    }

    private static Set<Worker> getWorkers() {
        String hello = "remove me";
        HashSet<Worker> workers = new HashSet<>();
        workers.add(new Worker("Vasya", 1995, 12, 15));
        workers.add(new Worker("Kostya", 1990, 11, 10));
        workers.add(new Worker("Misha"));
        return workers;
    }

    private static void printAll(Iterable<?> objects) {
        for (Object object : objects) {
            object.toString();
        }
    }
}
