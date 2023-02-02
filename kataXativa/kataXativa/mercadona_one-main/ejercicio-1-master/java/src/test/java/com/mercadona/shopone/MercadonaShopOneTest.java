package com.mercadona.shopone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MercadonaShopOneTest {

    @Test
    void itemGenericNotExpired() {
        Item[] items = new Item[] { new Item("generic", 3, 6) };
        MercadonaShopOne app = new MercadonaShopOne(items);
        app.updateQuality();
        assertEquals("generic", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(5, app.items[0].quality);
    }
    @Test
    void itemGenericExpired() {
        Item[] items = new Item[] { new Item("generic", 0, 6) };
        MercadonaShopOne app = new MercadonaShopOne(items);
        app.updateQuality();
        assertEquals("generic", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(4, app.items[0].quality);
    }
    @Test
    void itemAgedBlueCheeseNotExpired() {
        Item[] items = new Item[] { new Item("Aged blue cheese", 3, 6) };
        MercadonaShopOne app = new MercadonaShopOne(items);
        app.updateQuality();
        assertEquals("Aged blue cheese", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(7, app.items[0].quality);
    }
    @Test
    void itemAgedBlueCheeseExpired() {
        Item[] items = new Item[] { new Item("Aged blue cheese", 0, 6) };
        MercadonaShopOne app = new MercadonaShopOne(items);
        app.updateQuality();
        assertEquals("Aged blue cheese", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(8, app.items[0].quality);
    }
    @Test
    void itemAgedBlueCheeseMaxQuality() {
        Item[] items = new Item[] { new Item("Aged blue cheese", 0, 50) };
        MercadonaShopOne app = new MercadonaShopOne(items);
        app.updateQuality();
        assertEquals("Aged blue cheese", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(50, app.items[0].quality);
    }
    @Test
    void itemIodizedSaltNotExpired() {
        Item[] items = new Item[] { new Item("Iodized salt", 3, 80) };
        MercadonaShopOne app = new MercadonaShopOne(items);
        app.updateQuality();
        assertEquals("Iodized salt", app.items[0].name);
        assertEquals(3, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
    }
    @Test
    void itemIodizedSaltExpired() {
        Item[] items = new Item[] { new Item("Iodized salt", 0, 80) };
        MercadonaShopOne app = new MercadonaShopOne(items);
        app.updateQuality();
        assertEquals("Iodized salt", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
    }
    @Test
    void itemHamNotExpired() {
        Item[] items = new Item[] { new Item("Ham", 12, 6) };
        MercadonaShopOne app = new MercadonaShopOne(items);
        app.updateQuality();
        assertEquals("Ham", app.items[0].name);
        assertEquals(11, app.items[0].sellIn);
        assertEquals(7, app.items[0].quality);
    }
    @Test
    void itemHamLessTenDaysToExpire() {
        Item[] items = new Item[] { new Item("Ham", 8, 6) };
        MercadonaShopOne app = new MercadonaShopOne(items);
        app.updateQuality();
        assertEquals("Ham", app.items[0].name);
        assertEquals(7, app.items[0].sellIn);
        assertEquals(8, app.items[0].quality);
    }
    @Test
    void itemHamLessFiveDaysToExpire() {
        Item[] items = new Item[] { new Item("Ham", 3, 6) };
        MercadonaShopOne app = new MercadonaShopOne(items);
        app.updateQuality();
        assertEquals("Ham", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(9, app.items[0].quality);
    }
    @Test
    void itemHamExpired() {
        Item[] items = new Item[] { new Item("Ham", 0, 6) };
        MercadonaShopOne app = new MercadonaShopOne(items);
        app.updateQuality();
        assertEquals("Ham", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
    }
    @Test
    void itemHamMaxQuality() {
        Item[] items = new Item[] { new Item("Ham", 14, 50) };
        MercadonaShopOne app = new MercadonaShopOne(items);
        app.updateQuality();
        assertEquals("Ham", app.items[0].name);
        assertEquals(13, app.items[0].sellIn);
        assertEquals(50, app.items[0].quality);
    }
    @Test
    void itemFrozenCakeNotExpired() {
        Item[] items = new Item[] { new Item("Frozen cake", 3, 6) };
        MercadonaShopOne app = new MercadonaShopOne(items);
        app.updateQuality();
        assertEquals("Frozen cake", app.items[0].name);
        assertEquals(13, app.items[0].sellIn);
        assertEquals(50, app.items[0].quality);
    }
    @Test
    void itemFrozenCakeExpired() {
        Item[] items = new Item[] { new Item("Frozen cake", 0, 6) };
        MercadonaShopOne app = new MercadonaShopOne(items);
        app.updateQuality();
        assertEquals("Frozen cake", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(2, app.items[0].quality);
    }
    
   

}
