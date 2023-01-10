package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> modifiedLinkedList = new LinkedList<>();

        sourceList.forEach(e -> {
            if (e % 2 != 0) {
                modifiedLinkedList.addFirst(e);
            } else {
                modifiedLinkedList.addLast(e);
            }
        });
        return modifiedLinkedList;
    }
}

