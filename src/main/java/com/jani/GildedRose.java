package com.jani;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;


class GildedRose {

    static List<Item> items = null;

    static void updateQuality() {
        items.forEach(Item::updateQuality);
    }

}