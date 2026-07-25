# Java Interview Problem 3 (Medium) – Group Test Cases by Status

## Problem Statement

You are given a list of test execution logs.

Each log is in the following format:

```text
STATUS TestCaseName
```

Example:

```text
PASS LoginTest
FAIL PaymentTest
PASS SearchTest
FAIL LoginTest
SKIP LogoutTest
PASS CartTest
FAIL PaymentTest
```

---

## Task

Write the following method:

```java
public static Map<String, List<String>> groupTestCasesByStatus(List<String> logs)
```

The method should group all test case names based on their execution status.

---

## Example

### Input

```text
[
    "PASS LoginTest",
    "FAIL PaymentTest",
    "PASS SearchTest",
    "FAIL LoginTest",
    "SKIP LogoutTest",
    "PASS CartTest",
    "FAIL PaymentTest"
]
```

### Expected Output

```text
PASS -> [LoginTest, SearchTest, CartTest]

FAIL -> [PaymentTest, LoginTest, PaymentTest]

SKIP -> [LogoutTest]
```

---

## Requirements

- Use a `HashMap`.
- Do **not** use Java Streams.
- Preserve the insertion order inside each list.
- If a status appears for the first time, create a new list.
- Otherwise, add the test case to the existing list.

---

## Constraints

- Number of logs can be up to **100000**.
- Each log is in the format:

```text
STATUS TestCaseName
```

where

- STATUS can be PASS, FAIL or SKIP
- Test case names contain no spaces.

---

## Expected Complexity

Time Complexity:

```text
O(n)
```

Space Complexity:

```text
O(n)
```

---

## Interview Follow-up Questions

### Follow-up 1

How can you avoid writing

```java
if(map.containsKey(status))
```

?

---

### Follow-up 2

Which Java 8 method can create the list automatically if the key is absent?

---

### Follow-up 3

What is the difference between

```java
putIfAbsent()
```

and

```java
computeIfAbsent()
```

---

## What the Interviewer Is Evaluating

- HashMap
- List
- ArrayList
- String manipulation
- get()
- put()
- computeIfAbsent() (Bonus)
- Problem-solving
- Clean code