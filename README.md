# Unique IP Address Counter

## Project Description

This project is designed to count unique IP addresses from a given input file.
The program reads a list of IP addresses and outputs the number of unique IP addresses.

## Task Description

The task description can be found in the ```Task.md``` file.
This file provides a complete description of the requirements and specifications that the project must meet.

## Project Structure

```text
├── src
│   ├── main
│   │   ├── kotlin
│   │   │   └── com
│   │   │       └── home
│   │   │           └── playground
│   │   │               ├── Main.kt
│   │   └── resources
│   │       └── input.txt
├── build.gradle.kts
├── settings.gradle.kts
├── Task.md
└── README.md
```

## Getting Started

Prerequisites:

* Kotlin 21
* Gradle

## Setup

### Clone the repository

```shell
git clone https://github.com/oURMIo/ip-address-counter.git
cd ip-address-counter
```

Build the project

```shell
./gradlew clean build
```

### Running the Application

To run the application, use the main method in com.home.playground.MainKt:

```shell
./gradlew run
```

Or, if you are using an IDE, you can run the main method directly from `com.home.playground.MainKt`.
