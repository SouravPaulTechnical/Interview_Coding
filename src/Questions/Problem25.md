# 217. Contains Duplicate

**Difficulty:** Easy  
**Topics:** Array, Hash Table, Sorting  
**Companies:** Frequently Asked in Coding Interviews

---

## Problem Statement

Given an integer array `nums`, return `true` if any value appears **at least twice** in the array.

Return `false` if every element in the array is distinct.

## Examples

### Example 1

**Input:**
```text
nums = [1, 2, 3, 1]
```

**Output:**
```text
true
```

**Explanation:**

The element `1` occurs at indices `0` and `3`.

### Example 2

**Input:**
```text
nums = [1, 2, 3, 4]
```

**Output:**
```text
false
```

**Explanation:**

All elements in the array are distinct.

### Example 3

**Input:**
```text
nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]
```

**Output:**
```text
true
```

**Explanation:**

Multiple elements appear more than once in the array.

## Constraints

- `1 <= nums.length <= 10^5`
- `-10^9 <= nums[i] <= 10^9`

## Expected Complexity

| Complexity | Requirement |
|---|---|
| Time Complexity | `O(n)` |
| Space Complexity | `O(n)` |

## Suggested Approaches

1. **HashSet:** Traverse the array and check whether an element already exists in the set.
2. **HashMap:** Maintain the frequency of each element.
3. **Sorting:** Sort the array and compare adjacent elements.

**Recommended Approach:** HashSet, as it provides an efficient solution with `O(n)` time complexity on average.

