package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> modifiedLinkedList = new LinkedList<>();
        for (Integer elementInitialList : sourceList) {
            if (elementInitialList % 2 != 0) {
                modifiedLinkedList.addFirst(elementInitialList);
            } else {
                modifiedLinkedList.addLast(elementInitialList);
            }
        }
        return modifiedLinkedList;
    }
}
