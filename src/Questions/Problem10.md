## Problem 10 — Find the First Non-Repeating Character in a String

Problem Statement:

Write a Java program to find the first non-repeating character in a given string using a `HashMap`.

The program should:

- Accept a string from the user.
- Ignore whitespace characters.
- Treat uppercase and lowercase letters as the same character.
- Count the frequency of each character using a `HashMap<Character, Integer>`.
- Return the first character whose frequency is exactly `1`.
- If no such character exists, print `"No non-repeating character"`.

### Example 1

Input:

```
Enter String:
Swiss
```

Expected Output:

```
w
```

Explanation: After converting the string to lowercase, `swiss` has `s` appearing three times, `i` twice? Actually, `i` appears once and `w` appears once. The first non-repeating character is `w`? Let's use a clearer example below.

### Example 1 (Corrected)

Input:

```
Enter String:
aabbcdde
```

Expected Output:

```
c
```

Explanation: `a`, `b`, and `d` repeat, while `c` and `e` appear once. Since `c` appears first, it is returned.

### Example 2

Input:

```
Enter String:
aabbcc
```

Expected Output:

```
No non-repeating character
```

Explanation: Every character appears more than once.

### Example 3

Input:

```
Enter String:
A Apple
```

Expected Output:

```
l
```

Explanation: Whitespace is removed and the string is converted to lowercase, resulting in `aapple`. The first character with frequency `1` is `l`.

Difficulty: Medium

Concepts: `HashMap`, `getOrDefault()`, character frequency, `replaceAll()`, `toLowerCase()`, and string traversal.