package com.company;

import java.util.LinkedList;

public class HashTable {
    private class Entry {
        private int key;
        private String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value=value;
        }
    }

    private LinkedList<Entry>[] entries =new LinkedList[5];

    public void put(int key, String value){
        var index=hash(key); // where we should store key value pair
        if (entries[index]==null)
            entries[index]=new LinkedList<>();

        for (var entry : entries[index])
            if (entry.key==key) {
                entry.value = value;
                return;
            }

        entries[index].addLast(new Entry(key, value));
    }

    private int hash(int key){
        return key % entries.length;
    }
}
