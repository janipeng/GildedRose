package com.jani;

import static com.jani.ItemStrategyFactory.createItemStrategy;

class Item {
    private String name;
    private int sellIn;
    private int quality;
    private ItemStrategy itemStrategy;

    Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
        createItemStrategyByName(name);
    }

    private void createItemStrategyByName(String name) {
        itemStrategy = createItemStrategy(name);
    }

    void updateQuality() {
        itemStrategy.update(this);
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
