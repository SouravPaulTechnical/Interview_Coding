# 136. Single Number

**Difficulty:** Easy  
**Topics:** Array, Bit Manipulation  
**Companies:** Frequently Asked in Coding Interviews

---

## Problem Statement

Given a **non-empty** array of integers `nums`, every element appears twice except for one element that appears only once.

Find and return the element that appears only once.

You must implement a solution with:
- **Linear runtime complexity:** `O(n)`
- **Constant extra space:** `O(1)`

## Examples

### Example 1

**Input:**
```text
nums = [2, 2, 1]
```

**Output:**
```text
1
```

### Example 2

**Input:**
```text
nums = [4, 1, 2, 1, 2]
```

**Output:**
```text
4
```

### Example 3

**Input:**
```text
nums = [1]
```

**Output:**
```text
1
```

## Constraints

- `1 <= nums.length <= 3 * 10^4`
- `-3 * 10^4 <= nums[i] <= 3 * 10^4`
- Every element appears exactly twice except for one element, which appears only once.

## Expected Complexity

| Complexity | Requirement |
|---|---|
| Time Complexity | `O(n)` |
| Space Complexity | `O(1)` |

## Approach

Use the **Bit Manipulation (XOR)** technique to solve this problem efficiently.

