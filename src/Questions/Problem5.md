# Java Interview Problem 5 (Hard) – Top K Failed Test Cases

## Problem Statement

You are given a list of failed test execution logs.

Each log contains the name of the failed test case.

Your task is to return the **Top K most frequently failed test cases**.

If two test cases have the same failure count, return them in **alphabetical order**.

---

## Example 1

### Input

```text
Test Cases

[
"LoginTest",
"PaymentTest",
"LoginTest",
"SearchTest",
"PaymentTest",
"LoginTest",
"CartTest",
"SearchTest",
"PaymentTest",
"LogoutTest"
]

K = 2
```

### Output

```text
[
LoginTest,
PaymentTest
]
```

Explanation

```text
LoginTest   -> 3
PaymentTest -> 3
SearchTest  -> 2
CartTest    -> 1
LogoutTest  -> 1
```

Since LoginTest and PaymentTest both have frequency 3,
they are returned in alphabetical order.

---

## Example 2

### Input

```text
[
"A",
"B",
"A",
"C",
"B",
"A",
"D"
]

K = 3
```

### Output

```text
[
A,
B,
C
]
```

---

## Task

Implement

```java
public static List<String> topKFailedTests(List<String> failedTests, int k)
```

---

## Requirements

- Do NOT use Java Streams.
- Use Java Collections only.
- Time complexity should be better than O(n²).
- If K is greater than the number of unique test cases, return all unique test cases.

---

## Constraints

```text
1 <= n <= 100000

1 <= k <= uniqueTestCases
```

---

## Expected Complexity

```text
Frequency Count -> O(n)

Sorting -> O(m log m)

Overall -> O(n + m log m)

m = number of unique test cases
```

---

## Follow-up Questions

### 1.

Can you solve it using a PriorityQueue (Heap)?

Expected Complexity

```text
O(n log k)
```

---

### 2.

Why would a Heap be better than sorting when

```text
k << n
```

?

---

### 3.

Which Comparator would you write?

Primary sort

```text
Frequency Descending
```

Secondary sort

```text
Alphabetical Ascending
```

---

## What the Interviewer Is Evaluating

- HashMap
- List
- Comparator
- Collections.sort()
- Custom Sorting
- Comparable vs Comparator
- Time Complexity
- Clean Coding