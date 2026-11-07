# Java Interview Coding Practice

A collection of Java solutions and interview prompts for practicing common coding interview patterns, from string and array problems to collections, sliding windows, and interval merging.

Each problem has a Java implementation in `src/` and a matching prompt in [`src/Questions/`](src/Questions/). The examples are small, standalone programs that you can read, compile, and run one at a time.

## Contents

- [Problems](#problems)
- [Requirements](#requirements)
- [Compile and run](#compile-and-run)
- [Project layout](#project-layout)
- [Practice tips](#practice-tips)

## Problems

| # | Topic | Main concepts | Problem | Solution |
|---:|---|---|---|---|
| 1 | Count failed tests in logs | `HashMap`, strings, frequency counting | [Prompt](src/Questions/Problem1.md) | [Problem1.java](src/Problem1.java) |
| 2 | First non-repeating character | `HashMap`, strings, two passes | [Prompt](src/Questions/Problem2.md) | [Problem2.java](src/Problem2.java) |
| 3 | Group test cases by status | `HashMap`, `ArrayList`, parsing | [Prompt](src/Questions/Problem3.md) | [Problem3.java](src/Problem3.java) |
| 4 | Find duplicate test cases | `HashMap`, frequency counting | [Prompt](src/Questions/Problem4.md) | [Problem4.java](src/Problem4.java) |
| 5 | Top K failed test cases | Maps, sorting, comparators | [Prompt](src/Questions/Problem5.md) | [Problem5.java](src/Problem5.java) |
| 6 | Longest substring without repeating characters | Sliding window, sets/maps | [Prompt](src/Questions/Problem6.md) | [Problem6.java](src/Problem6.java) |
| 7 | Merge overlapping execution windows | Sorting, intervals, lists | [Prompt](src/Questions/Problem7.md) | [Problem7.java](src/Problem7.java) |
| 8 | Find a missing number | Arrays, loops, arithmetic | [Prompt](src/Questions/Problem8.md) | [Problem8.java](src/Problem8.java) |
| 9 | Two Sum | Arrays, `HashMap`, complement lookup | [Prompt](src/Questions/Problem9.md) | [Problem9.java](src/Problem9.java) |
| 10 | First non-repeating character (case-insensitive) | `HashMap`, character frequencies | [Prompt](src/Questions/Problem10.md) | [Problem10.java](src/Problem10.java) |
| 11 | Group anagrams | `HashMap`, arrays, string keys | [Prompt](src/Questions/Problem11.md) | [Problem11.java](src/Problem11.java) |
| 12 | Move zeroes to the end | Arrays, in-place movement | [Prompt](src/Questions/Problem12.md) | [Problem12.java](src/Problem12.java) |
| 13 | Find the intersection of two arrays | Arrays, maps, sets | [Prompt](src/Questions/Problem13.md) | [Problem13.java](src/Problem13.java) |
| 14 | Remove duplicate characters | Strings, sets, order preservation | [Prompt](src/Questions/Problem14.md) | [Problem14.java](src/Problem14.java) |
| 15 | Find the longest word | Strings, maps, traversal | [Prompt](src/Questions/Problem15.md) | [Problem15.java](src/Problem15.java) |
| 16 | Check for duplicate array elements | Arrays, sets | [Prompt](src/Questions/Problem16.md) | [Problem16.java](src/Problem16.java) |
| 17 | Find the second-largest unique element | Arrays, comparisons | [Prompt](src/Questions/Problem17.md) | [Problem17.java](src/Problem17.java) |
| 18 | Find the maximum-occurring character | `HashMap`, character frequencies | [Prompt](src/Questions/Problem18.md) | [Problem18.java](src/Problem18.java) |
| 19 | Check whether all characters are unique | Strings, sets | [Prompt](src/Questions/Problem19.md) | [Problem19.java](src/Problem19.java) |
| 20 | Reverse the order of words | Strings, traversal | [Prompt](src/Questions/Problem20.md) | [Problem20.java](src/Problem20.java) |
| 21 | First non-repeating integer | `HashMap`, frequency counting, order | [Prompt](src/Questions/Problem21.md) | [Problem21.java](src/Problem21.java) |

## Requirements

- Java 8 or newer
- A JDK with `javac` and `java` available on your `PATH`

No build tool or external library is required.

## Compile and run

From the repository root, compile all solutions into an output directory:

```bash
mkdir -p out
javac -d out src/*.java
```

Run an individual problem by its class name:

```bash
java -cp out Problem1
```

For example, to run the integer version of the first non-repeating problem:

```bash
java -cp out Problem21
```

Most classes include a `main` method. Some read input from the terminal; others use sample values in the source. Check the selected class before running and follow its prompts where present. To try a different example, edit the sample input in that class and compile again.

## Project layout

```text
src/
├── Problem1.java ... Problem21.java   # Standalone Java solutions
└── Questions/
    └── Problem1.md ... Problem21.md   # Matching prompts and examples
```

The numbered prompt and solution files are paired by number. A few prompts retain their original interview or practice wording, so use the corresponding Java source to see the implemented version of the exercise.

## Practice tips

1. Read a prompt and work through an approach before opening its solution.
2. Trace the example by hand, including repeated values and boundary cases.
3. Explain the data structure and time and space costs as you would in an interview.
4. Change the sample inputs and compare the program's output with your expectations.

Contributions that improve explanations, edge-case coverage, or readability are welcome.
