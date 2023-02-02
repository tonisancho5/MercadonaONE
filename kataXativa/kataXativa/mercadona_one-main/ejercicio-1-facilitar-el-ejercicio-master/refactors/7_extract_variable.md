**Podemos hacer un extract variable**

https://refactoring.com/catalog/extractVariable.html

de esto:
```
	if BOOL_OPERATION_1
		...
		if BOOL_OPERATION_2
			...
	else
		...

```

a esto:
```
	criteria = BOOL_OPERATION_1 * BOOL_OPERATION_2
```
