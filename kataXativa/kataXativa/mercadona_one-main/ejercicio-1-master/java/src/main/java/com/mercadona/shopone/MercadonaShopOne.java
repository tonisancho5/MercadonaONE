package com.mercadona.shopone;

public class MercadonaShopOne {
    Item[] items;

    public MercadonaShopOne(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
        	
        	if (item.name.equals("Frozen cake")) {
        		item.sellIn -= 1;
        		if (item.sellIn > 0 && item.quality <50) {
        			
        			item.quality -= 2;
        		}else {
        			
        		}
            }
            
            if (!item.name.equals("Aged blue cheese")
                    && !item.name.equals("Ham")) {
                if (item.quality > 0) {
                    if (!item.name.equals("Iodized salt")) {
                    	item.quality -= 1;
                    }
                }
            } else {
                if (item.quality < 50) {
                	item.quality += 1;
                    if (item.name.equals("Ham")) {
                        if (item.sellIn < 11) {
                            if (item.quality < 50) {
                                item.quality += 1;
                            }
                        }
                        if (item.sellIn < 6) {
                            if (item.quality < 50) {
                                item.quality += 1;
                            }
                        }
                    }
                }
            }
            if (!item.name.equals("Iodized salt")) {
                item.sellIn -= 1;
            }
            if (item.sellIn < 0) {
                if (!item.name.equals("Aged blue cheese")) {
                    if (!item.name.equals("Ham")) {
                        if (item.quality > 0) {
                            if (!item.name.equals("Iodized salt")) {
                                item.quality -= 1;
                            }
                        }
                    } else {
                        item.quality -= item.quality;
                    }
                } else {
                	item.quality = incrementarCalidad(item.quality);
                }
            }
        }
    }
    public int incrementarCalidad(int quality) {
    	if (quality <50) {
    		return quality += 1;
    	} return quality;
    }
    //incrementarCalidad(item.quality);
    public int decrementarCalidad(int quality) {
    	if (quality >0) {
    		return quality -= 1;
    	} return quality;
    }
    //decrementarCalidad(item.quality, 1);
}





