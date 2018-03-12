package com.jani;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static com.jani.GildedRose.items;
import static com.jani.GildedRose.updateQuality;
import static java.util.Collections.singletonList;
import static org.junit.Assert.assertEquals;

public class GildedRoseTest {

    @Test
    public void should_return_19_given_a_normal_item_its_sellIn_is_10_quality_is_20() throws Exception {
        Item item = new Item("+5 Dexterity Vest", 10, 20);
        items = singletonList(item);

        updateQuality();

        assertEquals(19, item.getQuality());
    }

    @Test
    public void should_return_49_given_a_normal_item_its_sellIn_is_10_quality_is_50() throws Exception {
        Item item = new Item("+5 Dexterity Vest", 10, 50);
        items = singletonList(item);

        updateQuality();

        assertEquals(49, item.getQuality());
    }

    @Test
    public void should_return_0_given_a_normal_item_its_sellIn_is_10_quality_is_0() throws Exception {
        Item item = new Item("+5 Dexterity Vest", 10, 0);
        items = singletonList(item);

        updateQuality();

        assertEquals(0, item.getQuality());
    }

    @Test
    public void should_return_18_given_a_normal_item_its_sellIn_is_0_quality_is_20() throws Exception {
        Item item = new Item("+5 Dexterity Vest", 0, 20);
        items = singletonList(item);

        updateQuality();

        assertEquals(18, item.getQuality());
    }

    @Test
    public void should_return_1_given_an_Aged_Brie_item_its_sellIn_is_2_quality_is_0() throws Exception {
        Item item = new Item("Aged Brie", 2, 0);
        items = singletonList(item);

        updateQuality();

        assertEquals(1, item.getQuality());
    }

    @Test
    public void should_return_50_given_an_Aged_Brie_item_its_sellIn_is_2_quality_is_50() throws Exception {
        Item item = new Item("Aged Brie", 2, 50);
        items = singletonList(item);

        updateQuality();

        assertEquals(50, item.getQuality());
    }

    @Test
    public void should_return_21_given_a_Sulfuras_item_its_sellIn_is_0_quality_is_80() throws Exception {
        Item item = new Item("Sulfuras, Hand of Ragnaros", 0, 80);
        items = singletonList(item);

        updateQuality();

        assertEquals(80, item.getQuality());
    }

    @Test
    public void should_return_21_given_a_Backstage_Passes_item_its_sellIn_is_15_quality_is_20() throws Exception {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20);
        items = singletonList(item);

        updateQuality();

        assertEquals(21, item.getQuality());
    }

    @Test
    public void should_return_50_given_a_Backstage_Passes_item_its_sellIn_is_15_quality_is_50() throws Exception {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 15, 50);
        items = singletonList(item);

        updateQuality();

        assertEquals(50, item.getQuality());
    }

    @Test
    public void should_return_23_given_a_Backstage_Passes_item_its_sellIn_is_5_quality_is_20() throws Exception {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 20);
        items = singletonList(item);

        updateQuality();

        assertEquals(23, item.getQuality());
    }

    @Test
    public void should_return_23_given_a_Backstage_Passes_item_its_sellIn_is_5_quality_is_49() throws Exception {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 2, 49);
        items = singletonList(item);

        updateQuality();

        assertEquals(50, item.getQuality());
    }


    @Test
    public void should_return_22_given_a_Backstage_Passes_item_its_sellIn_is_10_quality_is_20() throws Exception {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 10, 20);
        items = singletonList(item);

        updateQuality();

        assertEquals(22, item.getQuality());
    }

    @Test
    public void should_return_0_given_a_Backstage_Passes_item_its_sellIn_is_0_quality_is_20() throws Exception {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 0, 20);
        items = singletonList(item);

        updateQuality();

        assertEquals(0, item.getQuality());
    }

    @Test
    public void should_return_50_given_a_Backstage_Passes_item_its_sellIn_is_2_quality_is_60() throws Exception {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 2, 60);
        items = singletonList(item);

        updateQuality();

        assertEquals(60, item.getQuality());
    }

    @Test
    public void should_return_5_given_a_Conjured_item_its_sellIn_is_3_quality_is_6() throws Exception {
        Item item = new Item("Conjured Mana Cake", 3, 6);
        items = singletonList(item);

        updateQuality();

        assertEquals(5, item.getQuality());
    }

    @Test
    public void should_return_4_given_a_Conjured_item_its_sellIn_is_0_quality_is_6() throws Exception {
        Item item = new Item("Conjured Mana Cake", 0, 6);
        items = singletonList(item);

        updateQuality();

        assertEquals(4, item.getQuality());
    }

}