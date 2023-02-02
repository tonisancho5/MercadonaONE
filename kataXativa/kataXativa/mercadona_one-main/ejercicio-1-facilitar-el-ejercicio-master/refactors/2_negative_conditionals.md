**Podemos evitar condicionales negativos**

de esto:

```
if (!item.name.equals("Aged Brie") && !item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
    if (item.quality > 0) {
        ...
    }
}
```

a esto:

```
if (item.name.equals("Aged Brie") || item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
    ...
} else {
    if (item.quality > 0) {
        ...
    }
}
```
