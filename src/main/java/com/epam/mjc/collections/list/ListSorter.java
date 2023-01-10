package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSorter {


    public void sort(List<String> sourceList) {
        List<Element> elements = fillElementsWithArrayList(sourceList);
        fillModifiedStringList(elements, sourceList);
    }

    private List<Element> fillElementsWithArrayList(List<String> initialListData) {
        List<Element> arrayListWithElements = new ArrayList<>();
        for (String stringElement : initialListData) {
            Element element = new Element();
            element.setInitialStringValue(stringElement);
            element.setInitialIntValue(Integer.parseInt(stringElement));
            element.setModifiedIntValue((Math.pow((element.getInitialIntValue() * 5), 2)) + 3);
            element.setModifiedStringValue(String.valueOf(element.getModifiedIntValue()));
            arrayListWithElements.add(element);
            Collections.sort(arrayListWithElements, new ModifiedIntComparator());
        }
        return arrayListWithElements;
    }

    private List<String> fillModifiedStringList(List<Element> arrayListWithElements, List<String> sourceList) {
        sourceList.clear();
        arrayListWithElements.forEach(element -> sourceList.add(0, element.initialStringValue));
        return sourceList;
    }
}

