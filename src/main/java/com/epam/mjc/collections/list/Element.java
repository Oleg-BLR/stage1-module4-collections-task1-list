package com.epam.mjc.collections.list;

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
