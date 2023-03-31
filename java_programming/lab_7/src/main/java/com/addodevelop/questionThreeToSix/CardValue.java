package com.addodevelop.questionThreeToSix;

public enum CardValue {
    TWO("2",1),
    THREE("3",2),
    FOUR("4",3),
    FIVE("5",4),
    SIX("6",5),
    SEVEN("7",6),
    EIGHT("8",7),
    NINE("9",8),
    T("T",9),
    J("J",10),
    Q("Q",11),
    K("K",12),
    A("A",13);

    private final String value;
    private final int order;

    CardValue(String value, int order) {
        this.value = value;
        this.order = order;
    }

    public String getValue() {
        return this.value;
    }
    public int getOrder() {
        return this.order;
    }
}
