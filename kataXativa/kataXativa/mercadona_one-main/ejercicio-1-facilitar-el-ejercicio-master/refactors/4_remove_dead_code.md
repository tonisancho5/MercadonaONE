**Podemos eliminar código muerto**

de esto

```
if (item.name.equals("Aged Brie")) {
    if (item.quality < 50) {
        item.quality = item.quality + 1;

        if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            ...
        }
    }
}
```

a esto
```
if (item.name.equals("Aged Brie")) {
    if (item.quality < 50) {
        item.quality = item.quality + 1;
    }
}
```
