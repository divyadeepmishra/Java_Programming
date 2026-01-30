Type conversion — Implicit vs Explicit

- Implicit (widening): assigning a smaller type to a larger type — automatic.
- Explicit (narrowing): assigning a larger type to a smaller type — requires a cast.

Examples:

```java
// Implicit (widening)
int a = 10;
float b = a; // int -> float

// Explicit (narrowing)
float x = 10.5f;
int y = (int) x; // float -> int (fraction truncated)
```

Notes:
- Implicit conversions are safe; explicit conversions can lose precision or range.
- Use explicit casts when narrowing types intentionally.
- Be cautious with explicit casts to avoid runtime errors or data loss.

byte -> short -> int -> long -> float -> double (implicit)

char -> int -> long -> float -> double (implicit)

double -> float -> long -> int -> short -> byte (explicit)

double -> float -> long -> int -> short -> byte (explicit)
