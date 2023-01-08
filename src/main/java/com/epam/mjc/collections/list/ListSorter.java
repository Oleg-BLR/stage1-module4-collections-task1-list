package com.epam.mjc.collections.list;

import java.util.*;

public class ListSorter {

    public static void main(String[] args) {
        List<String> initialList = new ArrayList<>(Arrays.asList("-5", "-12", "0", "20", "9", "-20", "37", "37"));
        List<Element> elementList = new ArrayList<>();
        ListSorter listSorter = new ListSorter();
        listSorter.sort(initialList);

        System.out.println(listSorter.fillElementsWithArrayList(initialList));
//        Collections.sort(elementList, new ModifyedIntComparator());
        System.out.println(listSorter.fillModifiedStringList(listSorter.fillElementsWithArrayList(initialList)));

    }

    private List<String> fillModifiedStringList(List<Element> arrayListWithElements) {
        List<String> modifiedStringList = new ArrayList<>();
        for (Element element : arrayListWithElements) {
            modifiedStringList.add(0, element.initialStringValue);
        }

        return modifiedStringList;
    }

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
            Collections.sort(arrayListWithElements, new ModifyedIntComparator());
        }
        return arrayListWithElements;
    }

    class Element {
        String initialStringValue;
        int initialIntValue;
        Double modifiedIntValue;
        String modifiedStringValue;

        public String getInitialStringValue() {
            return initialStringValue;
        }

        public void setInitialStringValue(String initialStringValue) {
            this.initialStringValue = initialStringValue;
        }

        public int getInitialIntValue() {
            return initialIntValue;
        }

        public void setInitialIntValue(int initialIntValue) {
            this.initialIntValue = initialIntValue;
        }

        public Double getModifiedIntValue() {
            return modifiedIntValue;
        }

        public void setModifiedIntValue(Double modifiedIntValue) {
            this.modifiedIntValue = modifiedIntValue;
        }

        public String getModifiedStringValue() {
            return modifiedStringValue;
        }

        public void setModifiedStringValue(String modifiedStringValue) {
            this.modifiedStringValue = modifiedStringValue;
        }

        public Element() {
        }

        @Override
        public String toString() {
            return "Element{" +
                    "initialStringValue='" + initialStringValue + '\'' +
                    ", initialIntValue=" + initialIntValue +
                    ", modifiedIntValue=" + modifiedIntValue +
                    ", modifiedStringValue='" + modifiedStringValue + '\'' +
                    '}';
        }
    }

    //    class LexicographicComparator implements Comparator<Person> {
//        @Override
//        public int compare(Person a, Person b) {
//            return a.name.compareToIgnoreCase(b.name);
//        }
//    }
    class ModifyedIntComparator implements Comparator<Element> {
//        @Override
//        public int compare(Person a, Person b) {
//            return a.age < b.age ? -1 : a.age == b.age ? 0 : 1;
//        }

        @Override
        public int compare(Element o1, Element o2) {
            return o1.getModifiedIntValue() < o2.getModifiedIntValue() ? -1 : o1.getModifiedIntValue() == o2.getModifiedIntValue() ? 0 : 1;
        }
    }


    public void sort(List<String> sourceList) {
        List<Integer> modifiedIntegerList = new ArrayList<>();
//        Map<String, Integer> hashMapTable = new HashMap<>();
//        Map<String, Integer> treeMapTable = new TreeMap<>();
        Map<String, Integer> hashtableTable = new Hashtable<>();

//        SortedSet<Map.Entry<String, Double>> sortedset = new TreeSet<Map.Entry<String, Double>>(
//                new Comparator<Map.Entry<String, Double>>() {
//                    @Override
//                    public int compare(Map.Entry<String, Double> e1,
//                                       Map.Entry<String, Double> e2) {
//                        return e1.getValue().compareTo(e2.getValue());
//                    }
//                });
//        sortedset.addAll(myMap.entrySet());


        for (String elementInitialList : sourceList) {
            Integer currentIntElement = Integer.parseInt(elementInitialList);
            double newIntElement = (Math.pow((currentIntElement * 5), 2)) + 3;
//            hashMapTable.put(elementInitialList, (int) newIntElement);
//            treeMapTable.put(elementInitialList, (int) newIntElement);
            hashtableTable.put(elementInitialList, (int) newIntElement);

            modifiedIntegerList.add((int) newIntElement);
        }
        System.out.println("modifiedIntegerList" + modifiedIntegerList);
//        System.out.println("hashMapTable" + hashMapTable);
//        System.out.println("treeMapTable" + treeMapTable);
        System.out.println("hashtableTable" + hashtableTable);

//        for(Map.Entry<String, Integer> entry: hashMapTable.entrySet()) {
//            // get key
//            String key = entry.getKey();
//            // get value
//            Integer value = entry.getValue();
//        }
//
//        List<Map.Entry<Integer, String>> list = new ArrayList(hashMapTable.entrySet());
//        list.sort(new Comparator<>() {
//            @Override
//            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
//                return o1.getKey() - o2.getKey();
//            }
//        });
//        System.out.println(list);


//        class TreeMapComparator implements Comparator<TreeMap<String, Integer>> {
////            @Override
////            public int compare(Map.Entry<String, Double> e1,
////                    Map.Entry<String, Double> e2) {
////                return e1.getValue().compareTo(e2.getValue());
////            }
//
//            @Override
//            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
//                return o1.getValue().compareTo(o2.getValue());;
//            }
//
////            @Override
////            public int compare(TreeMap<String, Integer> o1, TreeMap<String, Integer> o2) {
////                return 0;
////            }
//        }

        List<String> modifiedStringList = new ArrayList<>();
        for (Integer elementModifyedIntegerList : modifiedIntegerList) {
            String currentStringElement = String.valueOf(elementModifyedIntegerList);
            modifiedStringList.add(currentStringElement);
        }

        System.out.println(modifiedStringList);
        Collections.sort(modifiedStringList, new ListComparator());
        System.out.println(modifiedStringList);
//        List<Integer> modified
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        return a.compareTo(b);
    }
}
