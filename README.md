# Mood Analyzer Problem

## Project Description
Mood Analyzer is a Java-based application that analyzes a user's mood
based on the input message. The project is developed using
Object-Oriented Programming concepts, Exception Handling, Enums,
and Unit Testing.

The application identifies whether the mood is **SAD** or **HAPPY**
and handles **NULL** and **EMPTY** mood cases using custom exceptions.

---

## Technologies Used
- Java
- Maven
- TestNG
- JUnit Assert
- IntelliJ IDEA

---

## Project Structure
src
├── main
│ └── java
│ └── com.test.services
│ ├── MoodAnalyser.java
│ ├── MoodAnalyserException.java
│ ├── MoodErrorType.java
│ └── App.java
└── test
└── java
└── com.test.services
└── MoodAnalyserTest.java


---

## Features
- Analyze mood using method parameter
- Analyze mood using constructor
- Detect SAD and HAPPY moods
- Handle NULL mood scenario
- Handle EMPTY mood scenario using custom exceptions
- Unit testing using TestNG

---

## Exception Handling
Custom exception `MoodAnalyserException` is used with enum
`MoodErrorType` to identify:
- `NULL` mood
- `EMPTY` mood

---

## Test Cases Covered
- Sad mood using parameter
- Any mood using parameter
- Sad mood using constructor
- Any mood using constructor
- Null mood returns HAPPY
- Null mood throws exception
- Empty mood throws exception

---

## How to Run the Project
1. Clone or download the project
2. Open in IntelliJ IDEA
3. Right click on `MoodAnalyserTest.java`
4. Click **Run**

---

## Author
Kamalpreet Kaur

