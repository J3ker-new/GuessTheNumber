# Number Guessing Game

A simple number guessing game written in Java where the player has to guess a randomly generated number between 0 and 100. The game provides feedback on whether the guess is too high, too low, or getting closer to the target number.

## Features

### Random Number Generation

The program generates a random number between 0 and 100.

### Feedback on Guesses

The game gives feedback on how close the guess is to the target number.

### Proximity-based Hints

Based on how far the guess is, hints are provided such as:
- "You're getting closer!"
- "You're far off!"
- "You're SUPER close!!"

### Restart/End Prompt on Win.

Game prompts the user to Start a new round or exit.

### Recursion

The game uses recursion to allow multiple guesses until the correct number is found.

### Input Validation

The user is prompted to ensure that their guesses are within the valid range (0–100).

## Requirements

- Java 8 or later (for the console version).

## How to Play

1. The game will generate a random number between 0 and 100.
2. You will be asked to enter a guess.
3. The game will give you feedback on your guess, telling you whether it's too high, too low, or close.
4. Keep guessing until you find the correct number. The game will automatically end once you guess correctly.

## How to Run

### For Console Version:

1. Clone this repository to your local machine.
   
   ```bash
   git clone https://github.com/your-username/number-guessing-game.git
2. Navigate to the project folder.
   
   ```bash
   cd number-guessing-game
3. Compile and run the game.
   ```bash
   javac Main.java
   java Main



