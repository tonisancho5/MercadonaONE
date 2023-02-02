**Podemos partir condicionales**

de esto (lo de antes):

```
if (item.name.equals("Aged Brie") || item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
    ...
} else {
    if (item.quality > 0) {
        ...
    }
}
```

a esto:

```
if (item.name.equals("Aged Brie")) {
    ...
} else if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
    ...
} else {
    if (item.quality > 0) {
        ...
    }
}
```
