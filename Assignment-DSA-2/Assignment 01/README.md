# Programming Assignment 1 -- Two-Pointer Technique
## Overview

This assignment demonstrates the Two-Pointer Technique using two
sorted-array problems. Each problem has a brute-force solution and an
optimized solution.

## Problems

### 1. Remove Duplicates from a Sorted Array

Remove repeated values in place and return the number of unique
elements.

**Input**

``` text
[1, 1, 2, 2, 3, 4, 4]
```

**Output**

``` text
[1, 2, 3, 4]
Unique count: 4
```

### 2. Pair Sum in a Sorted Array

Find two different elements whose sum equals the target.

**Input**

``` text
Array:  [1, 2, 4, 7, 11, 15]
Target: 15
```

**Output**

``` text
4 + 11 = 15
Indices: 2 and 4
```

## Approaches

-   **Brute Force:** Checks values or pairs directly.
-   **Two Pointers:** Uses two indexes and sorted order to solve the
    problem faster.

## Languages

-   C++ (C++17)
-   Java
-   Python

## Source Files

  File                Description
  ------------------- ----------------------------------------------
  `assignment.cpp`    C++ implementation of all four algorithms
  `Assignment.java`   Java implementation of all four algorithms
  `assignment.py`     Python implementation of all four algorithms

## Complexity

  Algorithm                              Time   Space
  ----------------------------------- ------- -------
  Brute Force -- Remove Duplicates      O(n²)    O(n)
  Two Pointers -- Remove Duplicates      O(n)    O(1)
  Brute Force -- Pair Sum               O(n²)    O(1)
  Two Pointers -- Pair Sum               O(n)    O(1)

## Execution Screenshots

Create a `screenshots` folder and add your actual screenshots with these
filenames.

### 1. C++ Output

<img width="1085" height="280" alt="Screenshot 2026-10-30 at 9 45 36 PM" src="https://github.com/user-attachments/assets/1b933f16-3e9a-42f3-9282-244ed1d8e2c0" />


### 2. Java Output

<img width="983" height="242" alt="image" src="https://github.com/user-attachments/assets/ecef587f-c7a9-451f-a59a-0e4881147d3d" />


### 3. Python Output

<img width="972" height="185" alt="Screenshot 2026-10-30 at 9 47 57 PM" src="https://github.com/user-attachments/assets/56a093b3-85c4-44a0-9857-64cb570eaedb" />

## Conclusion

The Two-Pointer Technique reduces unnecessary comparisons and gives
linear-time solutions for both sorted-array problems.

## References

-   [C++ Reference](https://en.cppreference.com/w/)
-   [Java Documentation](https://docs.oracle.com/en/java/)
-   [Python Documentation](https://docs.python.org/3/)
-   [GeeksforGeeks -- Two
    Pointers](https://www.geeksforgeeks.org/two-pointers-technique/)
-   [LeetCode -- Remove
    Duplicates](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)
-   [LeetCode -- Two Sum
    II](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/)
