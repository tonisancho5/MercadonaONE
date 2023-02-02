package com.mercadona.hiring101;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MercadonaShopOneTest3 {

    @Test
    public void testFrozenCakeOneDayPast() {

        Item[] items = new Item[]{
                new Item("Conjured Fruit", 5, 5)
        };

        MercadonaShopOne app = new MercadonaShopOne(items);
        app.updateQuality();

        assertEquals(4, items[0].sellIn);
        assertEquals(3, items[0].quality);

    }

    @Test
    public void testFrozenCakeQualityLossTwiceAsFast() {

        Item[] items = new Item[]{
                new Item("Conjured Fruit", 0, 4)
        };

        MercadonaShopOne app = new MercadonaShopOne(items);
        app.updateQuality();

        assertEquals(-1, items[0].sellIn);
        assertEquals(0, items[0].quality);

    }

    @Test
    public void testFrozenCakeQualityWillNeverBeNegative() {

        Item[] items = new Item[]{
                new Item("Conjured Fruit", 0, 0)
        };

        MercadonaShopOne app = new MercadonaShopOne(items);
        app.updateQuality();

        assertEquals(-1, items[0].sellIn);
        assertEquals(0, items[0].quality);

    }

}
