package com.jani;

class Item {
    private String name;
    private int sellIn;
    private int quality;

    Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    String getName() {
        return name;
    }

    int getSellIn() {
        return sellIn;
    }

    void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    int getQuality() {
        return quality;
    }

    void setQuality(int quality) {
        this.quality = quality;
    }
}
