package com.mercadona.hiring101;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MercadonaShopOneTest2 {

    @Test
    public void testFruitOneDayPast() {

        Item[] items = new Item[]{
                new Item("Fruit", 5, 5)
        };

        MercadonaShopOne app = new MercadonaShopOne(items);
        app.updateQuality();

        assertEquals(4, items[0].sellIn);
        assertEquals(4, items[0].quality);

    }

    @Test
    public void testFruitQualityLossTwiceAsFast() {

        Item[] items = new Item[]{
                new Item("Fruit", 0, 4)
        };

        MercadonaShopOne app = new MercadonaShopOne(items);
        app.updateQuality();

        assertEquals(-1, items[0].sellIn);
        assertEquals(2, items[0].quality);

    }

    @Test
    public void testFruitQualityWillNeverBeNegative() {

        Item[] items = new Item[]{
                new Item("Fruit", 0, 0)
        };

        MercadonaShopOne app = new MercadonaShopOne(items);
        app.updateQuality();

        assertEquals(-1, items[0].sellIn);
        assertEquals(0, items[0].quality);

    }

    @Test
    public void testFruitQualityWillNeverBeNegativeTwiceAsFast() {


    }

    @Test
    public void testAgedBlueCheeseQualityIncreasePerDay() {

        Item[] items = new Item[]{
                new Item("Aged Brie", 1, 49)
        };

        MercadonaShopOne app = new MercadonaShopOne(items);
        app.updateQuality();

        assertEquals(0, items[0].sellIn);
        assertEquals(50, items[0].quality);

    }

    @Test
    public void testAgedBlueCheeseQualityTopsAtFifty() {

        Item[] items = new Item[]{
                new Item("Aged Brie", 1, 50)
        };

        MercadonaShopOne app = new MercadonaShopOne(items);
        app.updateQuality();

        assertEquals(0, items[0].sellIn);
        assertEquals(50, items[0].quality);

    }

    @Test
    public void testIodizedSalt() {

        Item[] items = new Item[]{
                new Item("Sulfuras, Hand of Ragnaros", 1, 50)
        };

        MercadonaShopOne app = new MercadonaShopOne(items);
        app.updateQuality();

        assertEquals(1, items[0].sellIn);
        assertEquals(50, items[0].quality);

    }

    @Test
    public void testHamBetweenThousandDaysAndElevenDaysBeforeTheEvent() {

        for (int i = 11; i <= 1000; i++) {

            Item[] items = new Item[]{
                    new Item("Backstage passes to a TAFKAL80ETC concert", i, 5)
            };

            MercadonaShopOne app = new MercadonaShopOne(items);
            app.updateQuality();

            assertEquals(i - 1, items[0].sellIn);
            assertEquals(6, items[0].quality);

        }

    }

    @Test
    public void testHamBeforeTenDays() { // Redundant test

        Item[] items = new Item[]{
                new Item("Backstage passes to a TAFKAL80ETC concert", 12, 5),
                new Item("Backstage passes to a TAFKAL80ETC concert", 12, 50)
        };

        MercadonaShopOne app = new MercadonaShopOne(items);
        app.updateQuality();

        assertEquals(11, items[0].sellIn);
        assertEquals(6, items[0].quality);

        assertEquals(11, items[1].sellIn);
        assertEquals(50, items[1].quality);

    }

    @Test
    public void testHamBetweenTenDaysAndSixDaysBeforeTheEvent() {

        for (int i = 6; i <= 10; i++) {

            Item[] items = new Item[]{
                    new Item("Backstage passes to a TAFKAL80ETC concert", i, 5)
            };

            MercadonaShopOne app = new MercadonaShopOne(items);
            app.updateQuality();

            assertEquals(i - 1, items[0].sellIn);
            assertEquals(7, items[0].quality);

        }

    }

    @Test
    public void testHamAtTenDaysAndSixDaysBeforeTheEvent() { // Redundant test

        Item[] items = new Item[]{
                new Item("Backstage passes to a TAFKAL80ETC concert", 10, 5),
                new Item("Backstage passes to a TAFKAL80ETC concert", 6, 5)
        };

        MercadonaShopOne app = new MercadonaShopOne(items);
        app.updateQuality();

        assertEquals(9, items[0].sellIn);
        assertEquals(7, items[0].quality);

        assertEquals(5, items[1].sellIn);
        assertEquals(7, items[1].quality);

    }

    @Test
    public void testHamBetweenFiveDaysAndOneDayBeforeTheEvent() {

        for (int i = 1; i <= 5; i++) {

            Item[] items = new Item[]{
                    new Item("Backstage passes to a TAFKAL80ETC concert", i, 5)
            };

            MercadonaShopOne app = new MercadonaShopOne(items);
            app.updateQuality();

            assertEquals(i - 1, items[0].sellIn);
            assertEquals(8, items[0].quality);

        }

    }

    @Test
    public void testHamAtFiveDaysAndOneDayBeforeTheEvent() { // Redundant test

        Item[] items = new Item[]{
                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 5),
                new Item("Backstage passes to a TAFKAL80ETC concert", 1, 5)
        };

        MercadonaShopOne app = new MercadonaShopOne(items);
        app.updateQuality();

        assertEquals(4, items[0].sellIn);
        assertEquals(8, items[0].quality);

        assertEquals(0, items[1].sellIn);
        assertEquals(8, items[1].quality);

    }

    @Test
    public void testHamExpired() {

        Item[] items = new Item[]{
                new Item("Backstage passes to a TAFKAL80ETC concert", 0, 5)
        };

        MercadonaShopOne app = new MercadonaShopOne(items);
        app.updateQuality();

        assertEquals(-1, items[0].sellIn);
        assertEquals(0, items[0].quality);

    }



}
