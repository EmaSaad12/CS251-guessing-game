# 🎯 Number Guessing Game (Java)

## 📌 Description
A simple console-based **Number Guessing Game** built using Java.  
The player selects a difficulty level and tries to guess a randomly generated number.

This project demonstrates basic concepts of Object-Oriented Programming (OOP), loops, conditions, and user interaction.

---

## 🚀 Features
- Multiple difficulty levels:
  - Easy → Range (0 - 50) with unlimited attempts  
  - Medium → Range (0 - 100) with 7 attempts  
  - Hard → Range (0 - 200) with 5 attempts  
- Random number generation using `Math.random()`
- Hints after each guess:
  - Too large
  - Too small
- Performance rating system
- Option to play again

---

## 🧱 System Design (OOP)

The program is designed using OOP principles:

- **GuessingGame Class**  
  Handles the main game logic, difficulty levels, attempts, and user interaction.

- **Main Class**  
  Responsible for starting the program and reading the player's name.

---

## 🏆 Rating System
- Hero → 3 attempts or less  
- Excellent → 4 to 6 attempts  
- Good → More than 6 attempts  

---

## 🛠️ Technologies Used
- Java  
- Object-Oriented Programming (OOP)  
- Scanner (for user input)

---

## ▶️ How to Run

1. Compile the program:
```bash
javac Main.java
