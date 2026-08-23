# DSA Practice in Java

A Java-based repository for practicing data structures and algorithms through small, focused problem implementations. The goal is to keep each exercise self-contained, easy to read, and quick to run without introducing a full app framework or build system.

## Why this repository?

This project is designed for:

- interview and coding-practice preparation
- learning common DSA patterns in Java
- reviewing problems by topic in a clean folder layout
- running single problem files independently from the command line

It follows a classic coding-practice structure: one problem or pattern per class, with topics grouped under `src/` by category.

## Repository overview

```text
DSA/
├── .codex/
├── .git/
├── .gitignore
├── .idea/
├── .vscode/
├── Arrays.iml
├── README.md
├── out/
└── src/
    ├── ArrayList/
    ├── Arrays/
    ├── Arrays2D/
    ├── Backtracking/
    ├── DP/
    ├── HashMap/
    ├── LinkedList/
    ├── Maths/
    ├── PrefixSum/
    ├── SlidingWindow/
    ├── Sorting/
    ├── Stack/
    ├── String/
    ├── TwoPointersAndSlidingWindow/
    ├── Main.java
    └── Palindrome.java
```

## Topic coverage

The codebase is organized by algorithm category under `src/`:

- `ArrayList/` — list-based exercises and common list operations
- `Arrays/` — array fundamentals, searching, sorting-adjacent problems, and patterns
- `Arrays2D/` — 2D matrix traversal, transformation, and grid problems
- `Backtracking/` — recursion and exhaustive-search style problems
- `DP/` — dynamic programming problems such as stock profit and optimization tasks
- `HashMap/` — frequency, duplicates, lookup, and substring-related logic
- `LinkedList/` — singly linked list patterns and examples
- `Maths/` — number theory, prime checks, and math-based exercises
- `PrefixSum/` — cumulative sum techniques for subarray problems
- `SlidingWindow/` — window-based optimization techniques
- `Sorting/` — sorting algorithms and comparison-based examples
- `Stack/` — stack operations, bracket validation, calculator parsing, and adapter patterns
- `String/` — string manipulation, transformation, and compression problems
- `TwoPointersAndSlidingWindow/` — two-pointer and sliding-window techniques

## Code style and structure

Most files follow a consistent practice pattern:

- each Java file usually solves one focused problem
- classes are often named after the concept or challenge
- input is commonly read with `Scanner`
- output is usually produced with `System.out.println(...)`
- examples are designed to be compiled and run independently

This makes the repository useful as a personal “cheat sheet” for repetition and review, especially when preparing for technical interviews.

## Prerequisites

Use a Java JDK 21 or newer. Some exercises in this repository rely on modern Java features and should not be run with the default Java 8 runtime on many systems.

```bash
java -version
javac -version
```

If the output shows Java 8, set `JAVA_HOME` to a JDK 21+ install before compiling and running the files.

```bash
export JAVA_HOME=/usr/lib/jvm/java-21-openjdk-amd64
export PATH="$JAVA_HOME/bin:$PATH"
```

## Quick start

### Compile and run a single file

```bash
export JAVA_HOME=/usr/lib/jvm/java-21-openjdk-amd64
export PATH="$JAVA_HOME/bin:$PATH"

javac -d out src/Arrays/TwoSum.java
java -cp out Arrays.TwoSum
```

### Run the root demo

```bash
export JAVA_HOME=/usr/lib/jvm/java-21-openjdk-amd64
export PATH="$JAVA_HOME/bin:$PATH"

javac -d out src/Main.java
java -cp out Main hello world
```

### Compile a specific exercise from a package

Most files in this repository are organized under package folders such as `Arrays`, `HashMap`, or `Stack`.

```bash
javac -d out src/Arrays/TwoSum.java
java -cp out Arrays.TwoSum
```

Note: this repository is a collection of standalone practice files, not a single application. Because some files use preview-style Java syntax while others use normal package-based classes, it is usually best to compile one file at a time rather than the whole `src/` tree.

## Suggested workflow

1. Pick a topic folder relevant to the concept you want to practice.
2. Open a single Java file and study the algorithm.
3. Compile and run it directly from the terminal.
4. Reuse the pattern elsewhere as a reference for similar interview problems.

## Notes

- This repository is learning-focused and does not aim to be a production application.
- The `out/` directory contains generated compiled classes and is not meant for manual editing.
- `.gitignore` keeps IDE and build artifacts such as `out/` and `.idea/` out of version control.
- Some class names are intentionally duplicated across packages, which is valid Java because packages separate them.

## Author

Divyanshu Mishra

## License

This project is intended for educational and personal practice use.
