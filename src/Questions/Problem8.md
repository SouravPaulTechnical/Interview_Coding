### Problem 8 — Find the Missing Number in an Array

Write a Java program to find the **missing number** from an array containing numbers from **1 to N**, where exactly **one number is missing**.

The program should:
- Ask the user for the length of the array.
- Take the array elements as input.
- Calculate the expected sum of numbers from `1` to `N`.
- Calculate the actual sum of the elements present in the array.
- Find the missing number using the difference between the two sums.

### Example 1

**Input:**
```text
Enter length of the list:
5

Enter elements one by one:
1 2 3 5 4
```

**Expected Output:**
```text
Missing element is: 0
```

⚠️ This example doesn't have a missing number. A proper example is:

**Input:**
```text
Enter length of the list:
5

Enter elements one by one:
1 2 3 5
```

**Expected Output:**
```text
Missing element is: 4
```

### Example 2

**Input:**
```text
Enter length of the list:
6

Enter elements one by one:
1 2 3 4 6
```

**Expected Output:**
```text
Missing element is: 5
```

### Constraint

The array contains **distinct integers from 1 to N**, with exactly **one number missing**.

**Difficulty:** Easy → Medium  
**Concepts:** Arrays, loops, sum formula, enhanced `for` loop.