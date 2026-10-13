### Problem 6 — Character Frequency Counter

**Problem Statement:**

Write a Java program that takes a string as input and uses a **HashMap** to count the frequency of each character in the string.

The program should:
- Accept a string from the user.
- Count how many times each character appears.
- Store the character as the **key** and its frequency as the **value** in a `Map<Character, Integer>`.
- Display the character and its frequency.

### Example 1

**Input:**
```text
Enter any String:
programming
```

**Expected Output:**
```text
p = 1
r = 2
o = 1
g = 2
a = 1
m = 2
i = 1
n = 1
```

> The order may be different because `HashMap` does not guarantee insertion order.

### Example 2

**Input:**
```text
Enter any String:
hello world
```

**Expected Output:**
```text
h = 1
e = 1
l = 3
o = 2
  = 1
w = 1
r = 1
d = 1
```

Here, the **space is also treated as a character**.

**Difficulty:** Easy → Medium  
**Concepts:** `HashMap`, `Map`, `getOrDefault()`, `char[]`, `Map.Entry`

Practice the character-counting problem

- Add a case-insensitive version
- Use LinkedHashMap for ordered output