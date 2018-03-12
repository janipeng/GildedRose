package com.jani;

public class Item {
    public String name;
    public int sellIn;
    public int quality;

    private ItemStrategy itemStrategy;

    public Item(String name, int sellIn, int quality) {
        this.setName(name);
        this.setSellIn(sellIn);
        this.setQuality(quality);
    }

    void updateQuality() {
        switch (name) {
            case "Aged Brie":
                itemStrategy = new AgedBrie();
            case "Backstage passes to a TAFKAL80ETC concert":
                itemStrategy = new BackstagePasses();
            case "Sulfuras, Hand of Ragnaros":
                itemStrategy = new Sulfuras();
            default:
                itemStrategy = new NormalItem();
        }
        itemStrategy.update(this);
    }

    /* Generated getter and setter code */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSellIn() {
        return sellIn;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }
}
