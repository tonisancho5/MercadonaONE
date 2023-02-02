import unittest

from mercadona_shop_one import Item, MercadonaShopOne


class MercadonaShopOneTest(unittest.TestCase):

    def testFruitOneDayPast(self):
        items = [Item("pera", 5, 5)]
        gilded_rose = MercadonaShopOne(items)
        gilded_rose.update_quality()
        self.assertEquals("pera", items[0].name)
        self.assertEquals(4, items[0].sell_in)
        self.assertEquals(4, items[0].quality)

    def testFruitQualityLossTwiceAsFast(self):
        items = [Item("pera", 0, 6)]
        gilded_rose = MercadonaShopOne(items)
        gilded_rose.update_quality()
        self.assertEquals("pera", items[0].name)
        self.assertEquals(-1, items[0].sell_in)
        self.assertEquals(4, items[0].quality)

    def testFruitQualityWillNeverBeNegative(self):
        items = [Item("pera", 0, 0)]
        gilded_rose = MercadonaShopOne(items)
        gilded_rose.update_quality()
        self.assertEquals("pera", items[0].name)
        self.assertEquals(-1, items[0].sell_in)
        self.assertEquals(0, items[0].quality)

    def testFruitQualityWillNeverBeNegativeTwiceAsFast(self):
        items = [Item("pera", 0, 1)]
        gilded_rose = MercadonaShopOne(items)
        gilded_rose.update_quality()
        self.assertEquals("pera", items[0].name)
        self.assertEquals(-1, items[0].sell_in)
        self.assertEquals(0, items[0].quality)

    def testAgedBlueCheeseQualityIncreasePerDay(self):
        items = [Item("Aged blue cheese", 5, 1)]
        gilded_rose = MercadonaShopOne(items)
        gilded_rose.update_quality()
        self.assertEquals("Aged blue cheese", items[0].name)
        self.assertEquals(4, items[0].sell_in)
        self.assertEquals(2, items[0].quality)

    def testAgedBlueCheeseQualityTopsAtFifty(self):
        items = [Item("Aged blue cheese", 1, 49)]
        gilded_rose = MercadonaShopOne(items)
        gilded_rose.update_quality()
        self.assertEquals("Aged blue cheese", items[0].name)
        self.assertEquals(0, items[0].sell_in)
        self.assertEquals(50, items[0].quality)

    def testIodizedSalt(self):
        items = [Item("Iodized salt", 1, 80)]
        gilded_rose = MercadonaShopOne(items)
        gilded_rose.update_quality()
        self.assertEquals("Iodized salt", items[0].name)
        self.assertEquals(1, items[0].sell_in)
        self.assertEquals(80, items[0].quality)

    def testHamBetweenThousandDaysAndElevenDaysBeforeTheEvent(self):
        items = [Item("Ham", 88, 20)]
        gilded_rose = MercadonaShopOne(items)
        gilded_rose.update_quality()
        self.assertEquals("Ham", items[0].name)
        self.assertEquals(87, items[0].sell_in)
        self.assertEquals(21, items[0].quality)

    def testHamBeforeTenDays(self):
        items = [Item("Ham", 12, 20)]
        gilded_rose = MercadonaShopOne(items)
        gilded_rose.update_quality()
        self.assertEquals("Ham", items[0].name)
        self.assertEquals(11, items[0].sell_in)
        self.assertEquals(21, items[0].quality)

    def testHamBetweenTenDaysAndSixDaysBeforeTheEvent(self):
        items = [Item("Ham", 10, 20)]
        gilded_rose = MercadonaShopOne(items)
        gilded_rose.update_quality()
        self.assertEquals("Ham", items[0].name)
        self.assertEquals(9, items[0].sell_in)
        self.assertEquals(22, items[0].quality)

    def testHamAtTenDaysAndSixDaysBeforeTheEvent(self):
        items = [Item("Ham", 7, 20)]
        gilded_rose = MercadonaShopOne(items)
        gilded_rose.update_quality()
        self.assertEquals("Ham", items[0].name)
        self.assertEquals(6, items[0].sell_in)
        self.assertEquals(22, items[0].quality)

    def testHamBetweenFiveDaysAndOneDayBeforeTheEvent(self):
        items = [Item("Ham", 5, 20)]
        gilded_rose = MercadonaShopOne(items)
        gilded_rose.update_quality()
        self.assertEquals("Ham", items[0].name)
        self.assertEquals(4, items[0].sell_in)
        self.assertEquals(23, items[0].quality)

    def testHamAtFiveDaysAndOneDayBeforeTheEvent(self):
        items = [Item("Ham", 2, 20)]
        gilded_rose = MercadonaShopOne(items)
        gilded_rose.update_quality()
        self.assertEquals("Ham", items[0].name)
        self.assertEquals(1, items[0].sell_in)
        self.assertEquals(23, items[0].quality)

    def testHamExpired(self):
        items = [Item("Ham", 0, 20)]
        gilded_rose = MercadonaShopOne(items)
        gilded_rose.update_quality()
        self.assertEquals("Ham", items[0].name)
        self.assertEquals(-1, items[0].sell_in)
        self.assertEquals(0, items[0].quality)


if __name__ == '__main__':
    unittest.main()
