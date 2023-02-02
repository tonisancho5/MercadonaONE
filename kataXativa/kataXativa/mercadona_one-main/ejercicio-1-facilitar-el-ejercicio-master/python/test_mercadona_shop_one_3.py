import unittest

from mercadona_shop_one import Item, MercadonaShopOne


class MercadonaShopOneTest(unittest.TestCase):

    def testFrozenCakeOneDayPast(self):
        items = [Item("Frozen cake", 2, 4)]
        gilded_rose = MercadonaShopOne(items)
        gilded_rose.update_quality()
        self.assertEquals("Frozen cake", items[0].name)
        self.assertEquals(1, items[0].sell_in)
        self.assertEquals(2, items[0].quality)

    def testFrozenCakeQualityLossTwiceAsFast(self):
        items = [Item("Frozen cake", 0, 4)]
        gilded_rose = MercadonaShopOne(items)
        gilded_rose.update_quality()
        self.assertEquals("Frozen cake", items[0].name)
        self.assertEquals(-1, items[0].sell_in)
        self.assertEquals(0, items[0].quality)

    def testFrozenCakeQualityWillNeverBeNegative(self):
        items = [Item("Frozen cake", 0, 0)]
        gilded_rose = MercadonaShopOne(items)
        gilded_rose.update_quality()
        self.assertEquals("Frozen cake", items[0].name)
        self.assertEquals(-1, items[0].sell_in)
        self.assertEquals(0, items[0].quality)


if __name__ == '__main__':
    unittest.main()
