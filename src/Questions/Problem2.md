# Java Interview Problem 2 (Easy-Medium) – Find the First Non-Repeating Character

## Problem Statement

You are given a string representing a test execution ID.

Your task is to find the **first non-repeating character** in the string.

---

## Example 1

### Input

```text
aabbcddeff
```

### Output

```text
c
```

---

## Example 2

### Input

```text
automation
```

### Output

```text
u
```

---

## Example 3

### Input

```text
aabbcc
```

### Output

```text
No non-repeating character found.
```

---

## Task

Create the following method:

```java
public static Character firstNonRepeatingCharacter(String input)
```

If every character repeats, return `null`.

---

## Requirements

- Use a `HashMap`.
- Do **not** use Java Streams.
- The solution should be case-sensitive.
- Ignore spaces in the input string.

---

## Constraints

- Length of the string can be up to **100000**.
- The solution should be efficient.

---

## Expected Complexity

- Time Complexity: **O(n)**
- Space Complexity: **O(k)**

where `k` is the number of unique characters.

---

## Interview Follow-up Questions

### Follow-up 1

Can you solve this without using a `HashMap`?

---

### Follow-up 2

What if the string contains Unicode characters?

---

### Follow-up 3

How would you make the search case-insensitive?

---

## What the Interviewer Is Evaluating

- String traversal
- Character manipulation
- HashMap usage
- Two-pass algorithm
- Problem-solving skills
- Time and Space Complexity