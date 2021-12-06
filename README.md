# Assignment 31

Create a program that finds the median of a set of numbers. The median is the middle number of a sorted set of numbers. If there are two middle numbers, the median is the average of those two numbers.

## Specifications

Take input for the values in the array after asking for how many will be entered. Sort the array by using the selection sort algorithm and then compute the median.

### Selection Sort

Selection sort is an "elementary" sorting algorithm. It is good for small sets, but does not scale well. 

The list is divided into two parts, the sorted part at the left end and the unsorted part at the right end. Initially, the sorted part is empty and the unsorted part is the entire list. The smallest element is selected from the unsorted array and swapped with the leftmost element, and that element becomes a part of the sorted array. This process continues moving unsorted array boundary by one element to the right.

![first](https://i.imgur.com/SX3eB36.png)

![second](https://i.imgur.com/MY7CbVk.png)

### Sample Outputs

```
How many values? 4
Enter next value: 2
Enter next value: -10
Enter next value: 23
Enter next value: 5
{2.0, -10.0, 23.0, 5.0}
{-10.0, 2.0, 5.0, 23.0}
Median = 3.5
```

```
How many values? 5
Enter next value: -12.5
Enter next value: 2.1
Enter next value: 5
Enter next value: 0
Enter next value: 8.75
{-12.5, 2.1, 5.0, 0.0, 8.75}
{-12.5, 0.0, 2.1, 5.0, 8.75}
Median = 2.1
```

### Grading

As always, your program will be graded on its functionality according to the project specifications and proper code style.

