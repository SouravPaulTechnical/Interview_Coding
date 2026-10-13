Problem 6 — Merge Overlapping Test Execution Windows

You are given a list of test execution time intervals.

Each interval is represented as:

[startTime, endTime]

Two intervals overlap if the next interval starts before or exactly when the current interval ends.

Example

Input:

[
[1, 3],
[2, 6],
[8, 10],
[9, 12]
]

Expected output:

[
[1, 6],
[8, 12]
]
Explanation

[1,3] and [2,6] overlap:

1---3
2------6

So they become:

[1,6]

Similarly:

8---10
9------12

becomes:

[8,12]
Your task

Implement:

public List<int[]> mergeExecutionWindows(List<int[]> intervals)
Requirements
Do not use Java Streams.
Sort the intervals by their starting time.
Merge all overlapping intervals.
Return the merged intervals.
Handle intervals that are already sorted.
Handle intervals that are completely contained inside another interval.
Example 2

Input:

[
[1, 10],
[2, 5],
[3, 7]
]

Output:

[
[1, 10]
]
Example 3

Input:

[
[1, 2],
[3, 4],
[5, 6]
]

Output:

[
[1, 2],
[3, 4],
[5, 6]
]
Example 4

Input:

[
[5, 7],
[1, 3],
[2, 6],
[10, 12]
]

Output:

[
[1, 7],
[10, 12]
]
Expected complexity

Target:

O(n log n)

because of sorting.