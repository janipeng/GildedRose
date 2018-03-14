package com.jani;

import java.util.List;


class GildedRose {

    static List<Item> items = null;

    static void updateQuality() {
        for (Item item : items) {
            ItemStrategy itemStrategy;
            switch (item.getName()) {
                case "Aged Brie":
                    itemStrategy = new AgedBrie();
                case "Backstage passes to a TAFKAL80ETC concert":
                    itemStrategy = new BackstagePasses();
                case "Sulfuras, Hand of Ragnaros":
                    itemStrategy = new Sulfuras();
                default:
                    itemStrategy = new NormalItem();
            }
            itemStrategy.update(item);
        }
    }

}