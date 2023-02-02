class MercadonaShopOne(object):

    def __init__(self, items):
        self.items = items

    def update_quality(self):
        for item in self.items:
            if item.name != "Aged blue cheese" and item.name != "Ham":
                if item.quality > 0:
                    if item.name != "Iodized salt":
                        item.quality = item.quality - 1
            else:
                if item.quality < 50:
                    item.quality = item.quality + 1
                    if item.name == "Ham":
                        if item.sell_in < 11:
                            if item.quality < 50:
                                item.quality = item.quality + 1
                        if item.sell_in < 6:
                            if item.quality < 50:
                                item.quality = item.quality + 1
            if item.name != "Iodized salt":
                item.sell_in = item.sell_in - 1
            if item.sell_in < 0:
                if item.name != "Aged blue cheese":
                    if item.name != "Ham":
                        if item.quality > 0:
                            if item.name != "Iodized salt":
                                item.quality = item.quality - 1
                    else:
                        item.quality = item.quality - item.quality
                else:
                    if item.quality < 50:
                        item.quality = item.quality + 1


class Item:
    def __init__(self, name, sell_in, quality):
        self.name = name
        self.sell_in = sell_in
        self.quality = quality

    def __repr__(self):
        return "%s, %s, %s" % (self.name, self.sell_in, self.quality)
