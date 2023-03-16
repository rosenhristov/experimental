package com.rosenhristov.tasks.bimap;

public class BimapTest {

    public static void main(String[] args) {
        Bimap<Integer, String> bimap = Bimap.create();
        bimap.put(1, "Rosen");
        bimap.put(2, "Ani");
        bimap.put(3, "Svetla");
        bimap.put(4, "Tanya");
        bimap.put(5, "Ivan");
        bimap.put(6, "Rumen");
        bimap.put(7, "Iva");
        bimap.put(8, "Yanko");
        bimap.put(9, "Krasimir");
        bimap.put(10, "Vladimir");

        bimap.remove(10);
        bimap.remove("Ivan");


        bimap.getMap()
                .entrySet()
                .forEach(entry -> System.out.println(entry));
    }
}
