## Problem 9 — Two Sum: Find Two Numbers That Add Up to a Target

Problem Statement:

Write a Java program that takes an integer array and a target number as input. Find the indices of two distinct elements whose sum equals the target number, using a `HashMap`.

The program should:

- Ask the user to enter the array length.
- Accept the array elements.
- Ask the user to enter a target number.
- Use a `HashMap<Integer, Integer>` to store each number and its index.
- Print the indices of the two elements whose sum equals the target.

### Example 1

Input:

```
Enter array length:
5

Enter elements one by one:
2 11 7 15 17

Enter target number:
9
```

Expected Output:

```
Index values are: 0 2
```

Explanation: The elements at indices `0` and `2` are `2` and `7`.

\\[ 2 + 7 = 9 \\]

### Example 2

Input:

```
Enter array length:
4

Enter elements one by one:
3 2 4 6

Enter target number:
6
```

Expected Output:

```
Index values are: 1 2
```

Explanation:

\\[ 2 + 4 = 6 \\]

The indices are `1` and `2`.

### Constraints

- Each pair must consist of two distinct array elements.
- Assume exactly one valid pair exists.
- Use a `HashMap` to solve the problem efficiently.
- Aim for O(n) time complexity.

Difficulty: Medium Concepts: Arrays, `HashMap`, `containsKey()`, `put()`, array indices, and complement calculation.

Your submitted code follows the standard Two Sum approach: calculate `targetNumber - arrayElements[i]`, check whether that complement is already in the map, and print both indices if it is.