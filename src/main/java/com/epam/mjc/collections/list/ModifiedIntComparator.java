package com.epam.mjc.collections.list;

import java.util.Comparator;

class ModifiedIntComparator implements Comparator<Element> {

    @Override
    public int compare(Element o1, Element o2) {
        return Math.abs(o1.getModifiedIntValue()) > Math.abs(o2.getModifiedIntValue()) ? -1 : Math.abs(o1.getModifiedIntValue()) == Math.abs(o2.getModifiedIntValue()) ? 0 : 1;
    }
}
