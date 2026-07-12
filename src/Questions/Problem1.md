# Java Interview Problem 1 (Easy–Medium) – Log Analyzer

## Problem Statement

You are given a list of test execution logs.

```text
[
    "PASS LoginTest",
    "FAIL PaymentTest",
    "PASS SearchTest",
    "FAIL LoginTest",
    "PASS LoginTest",
    "FAIL PaymentTest",
    "PASS CartTest"
]
```

---

## Task

Create a method:

```java
public static Map<String, Integer> countFailedTests(List<String> logs)
```

The method should return **only the failed test cases** along with the number of times each test case failed.

---

## Expected Output

```text
{
    LoginTest=1,
    PaymentTest=2
}
```

---

## Requirements

- Ignore all `"PASS"` logs.
- Count only the failed test cases.
- The order of the returned map does **not** matter.
- Use **Java Collections** (`HashMap`).
- **Do NOT use Java Streams** for this problem.
- Write clean, production-quality code.

---

## Example

### Input

```text
[
    "PASS LoginTest",
    "FAIL PaymentTest",
    "PASS SearchTest",
    "FAIL LoginTest",
    "PASS LoginTest",
    "FAIL PaymentTest",
    "PASS CartTest"
]
```

### Output

```text
{
    LoginTest=1,
    PaymentTest=2
}
```

---

## Follow-up Question (Interviewer May Ask)

If the logs are:

```text
FAIL LoginTest
FAIL loginTest
FAIL LOGINTEST
```

How would you modify your solution so that all three entries are treated as the **same test case**?

---

## What the Interviewer Is Evaluating

- String manipulation
- Java Collections (`HashMap`)
- Looping constructs
- `split()` usage
- `getOrDefault()` usage
- Code readability
- Naming conventions
- Time and Space Complexity
- Edge case handling

---

## Edge Cases to Consider

- Empty list
- `null` input
- List containing only `"PASS"` logs
- Duplicate failed test cases
- Extra spaces in log entries (optional)

---

## Constraints

- Number of log entries can be up to **100,000**.
- Each log entry is in the format:

```text
STATUS TestCaseName
```

where:

- `STATUS` is either `PASS` or `FAIL`
- `TestCaseName` contains no spaces

---

## Submission Guidelines

After solving, provide:

1. Complete Java code
2. Brief explanation of your approach
3. Time Complexity
4. Space Complexity

> **Note:** Solve this as if you are in a live technical interview. Avoid using AI-generated shortcuts or unnecessary libraries.