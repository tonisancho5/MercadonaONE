public class MercadonaShopOne {
    var items: [Item]
    
    public init(items: [Item]) {
        self.items = items
    }
    
    public func updateQuality() {
        for i in 0 ..< items.count {
            if items[i].name != "Aged blue cheese" && items[i].name != "Ham" {
                if items[i].quality > 0 {
                    if items[i].name != "Iodized salt" {
                        items[i].quality = items[i].quality - 1
                    }
                }
            } else {
                if items[i].quality < 50 {
                    items[i].quality = items[i].quality + 1
                    
                    if items[i].name == "Ham" {
                        if items[i].sellIn < 11 {
                            if items[i].quality < 50 {
                                items[i].quality = items[i].quality + 1
                            }
                        }
                        
                        if items[i].sellIn < 6 {
                            if items[i].quality < 50 {
                                items[i].quality = items[i].quality + 1
                            }
                        }
                    }
                }
            }
            
            if items[i].name != "Iodized salt" {
                items[i].sellIn = items[i].sellIn - 1
            }
            
            if items[i].sellIn < 0 {
                if items[i].name != "Aged blue cheese" {
                    if items[i].name != "Ham" {
                        if items[i].quality > 0 {
                            if items[i].name != "Iodized salt" {
                                items[i].quality = items[i].quality - 1
                            }
                        }
                    } else {
                        items[i].quality = items[i].quality - items[i].quality
                    }
                } else {
                    if items[i].quality < 50 {
                        items[i].quality = items[i].quality + 1
                    }
                }
            }
        }
    }
}
