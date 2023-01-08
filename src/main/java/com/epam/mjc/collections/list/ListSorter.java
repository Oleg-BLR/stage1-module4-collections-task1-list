package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListSorter {

    public static void main(String[] args) {
//        List<String> initialList = new ArrayList<>(Arrays.asList("-5", "-12", "0", "20", "9", "-20", "37"));
        List<String> initialList = new ArrayList<>(Arrays.asList("7", "10", "6", "-7", "-2", "0", "-2", "-23"));
        ListSorter listSorter = new ListSorter();
        listSorter.sort(initialList);
    }

    public void sort(List<String> sourceList) {
        ArrayList<Element> listOfElements = new ArrayList<>();
        ArrayList<String> initialList = new ArrayList<>();
        System.out.println(fillModifiedStringList(fillElementsWithArrayList(sourceList)));
    }

//    public List<String> sort(List<String> sourceList) {
////        ArrayList<Element> listOfElements = new ArrayList<>();
////        ArrayList<String> initialList = new ArrayList<>();
////        System.out.println(fillModifiedStringList(fillElementsWithArrayList(sourceList)));
//        return fillModifiedStringList(fillElementsWithArrayList(sourceList));
//    }


    private List<Element> fillElementsWithArrayList(List<String> initialListData) {
        List<Element> arrayListWithElements = new ArrayList<>();
        int i = 0;
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

    private List<String> fillModifiedStringList(List<Element> arrayListWithElements) {
        List<String> modifiedStringList = new ArrayList<>();
        for (Element element : arrayListWithElements) {
            modifiedStringList.add(0, element.initialStringValue);
        }
        return modifiedStringList;
    }
}

