**Podemos simplificar los loop/bucles for, si en ellos no usamos la i para nada**

de esto:

```
for (int i = 0; i < items.length; i++) {
    ...
    // items[i]
    ...
}
```

a esto:
```
for (Item item : items) {
    ...
    // item
    ...
}
```
