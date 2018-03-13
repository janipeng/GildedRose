package com.jani;

import java.util.List;

import static com.jani.ItemStrategyFactory.createItemStrategy;


class GildedRose {

    static List<Item> items = null;

    static void updateQuality() {
        items.forEach(item -> createItemStrategy(item.getName()).update(item));
    }

}