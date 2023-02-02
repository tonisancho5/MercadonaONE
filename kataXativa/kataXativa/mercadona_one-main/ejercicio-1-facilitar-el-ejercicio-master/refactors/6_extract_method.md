**Podemos hacer un extract method**

de esto:

```
	if ...
		quality = quality + 1
	else
		...

	if not ...
		quality = quality + 1
	else
		...
```

a esto:
```
	public int incrementQuality() {
		return quality + 1
	}
```
