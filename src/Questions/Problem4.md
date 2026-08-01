# Java Interview Problem 4 (Medium) – Find Duplicate Test Cases

## Problem Statement

You are given a list of executed test case names.

Some test cases may have been executed multiple times due to retries.

Your task is to return **only the duplicate test case names** along with the number of times they were executed.

---

## Example

### Input

```text
[
    "LoginTest",
    "SearchTest",
    "LoginTest",
    "CartTest",
    "PaymentTest",
    "SearchTest",
    "LoginTest"
]
```

### Expected Output

```text
{
    LoginTest=3,
    SearchTest=2
}
```

> **Note:** Do not include test cases that were executed only once.

---

## Task

Implement the following method:

```java
public static Map<String, Integer> findDuplicateTestCases(List<String> testCases)
```

---

## Requirements

- Use a `HashMap`.
- Do **not** use Java Streams.
- Return only duplicate test cases.
- Preserve the order of the first duplicate occurrence if possible (Bonus).

---

## Constraints

- Number of test cases can be up to **100000**.
- Test case names are case-sensitive.

---

## Expected Complexity

Time Complexity:

```text
O(n)
```

Space Complexity:

```text
O(k)
```

where `k` is the number of unique test case names.

---

## Example 2

### Input

```text
[
    "A",
    "B",
    "C"
]
```

### Output

```text
{}
```

---

## Follow-up Questions

### Follow-up 1

How would you preserve the insertion order of duplicate test cases?

### Follow-up 2

What is the difference between `HashMap` and `LinkedHashMap`?

### Follow-up 3

Can this problem be solved using a `Set`?

---

## What the Interviewer Is Evaluating

- HashMap
- Frequency counting
- Conditional filtering
- Collection traversal
- Time and Space Complexity
- Clean coding practices