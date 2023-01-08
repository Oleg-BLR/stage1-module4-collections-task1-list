package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        int index = 1;
        ArrayList<String> newList = new ArrayList<>();
        for (String elementInitialList : sourceList) {
            if (index % 3 == 0) {
                newList.add(elementInitialList);
                newList.add(elementInitialList);
            }
            index++;
        }
        return newList;
    }
}
