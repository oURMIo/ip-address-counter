# Task

You have a simple text file with IPv4 addresses. One line is one address, line by line:

```text
145.67.23.4
8.34.5.23
89.54.3.124
89.54.3.124
3.45.71.5
...
```

The file is unlimited in size and can occupy tens and hundreds of gigabytes.

You should calculate the number of unique addresses in this file using as little memory and time as possible. There is a "naive"
algorithm for solving this problem (read line by line, put lines into HashSet). It's better if your implementation is more complicated
and faster than this naive algorithm.

Some details:

* You can only use the features of the standard Java/Kotlin library.
* You should write in Java (version 17 and above) or Kotlin.
* The assignment must have a working main() method, to demonstrate how it works
* The completed assignment should be posted on GitHub