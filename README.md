

# DiceRoller

DiceRoller is an Android application that allows users to simulate rolling one or multiple dice. The app is built using Java and utilizes an SQL database to store and manage data.

## Table of Contents
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Technologies Used](#technologies-used)
- [Database Schema](#database-schema)
- [Contributing](#contributing)
- [License](#license)

## Features
- Roll one or multiple dice simultaneously.
- Choose the number of sides per die (e.g., 4, 6, 8, 10, 12, 20).
- Store and view the history of previous rolls.
- Simple and user-friendly interface.

## Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/DiceRoller.git
   ```
2. Open the project in Android Studio.
3. Build the project and run it on an Android device or emulator.

## Usage
1. Launch the DiceRoller app.
2. Select the number of dice and the number of sides per die.
3. Tap the "Roll" button to roll the dice.
4. View the results and the history of past rolls.

## Technologies Used
- **Android SDK**: The app is developed using the Android SDK, providing the necessary tools and libraries for Android development.
- **Java**: The primary programming language used for the app's development.
- **SQLite**: An SQL database used to store and manage the history of dice rolls.

## Database Schema
The app uses an SQLite database to store the history of dice rolls. The schema includes the following table:

### Rolls Table
| Column         | Type    | Description                  |
|----------------|---------|------------------------------|
| id             | INTEGER | Primary key                  |
| num_dice       | INTEGER | Number of dice rolled        |
| num_sides      | INTEGER | Number of sides per die      |
| result         | TEXT    | Result of the dice roll      |
| timestamp      | TEXT    | Date and time of the roll    |

## Contributing
Contributions are welcome! Please follow these steps:
1. Fork the repository.
2. Create a new branch for your feature or bug fix.
3. Make your changes and commit them with a descriptive message.
4. Push your changes to your forked repository.
5. Open a pull request to the main repository.

## Screenshots
![1](https://github.com/user-attachments/assets/f0720645-4216-4629-962e-8a1b32db50e0)
![2](https://github.com/user-attachments/assets/c367dc05-840d-4c69-a201-97f75cc8c75f)
![3](https://github.com/user-attachments/assets/772b3b5a-f417-4414-bbb5-1821cdcdc9fa)
![4](https://github.com/user-attachments/assets/5c8ff6fb-a67a-48f3-8260-4f2f191c5bdc)
![5](https://github.com/user-attachments/assets/89664f45-bf24-4cde-9ffa-af6d135b9ac1)
![6](https://github.com/user-attachments/assets/f2af0b1d-abee-40f5-b7a2-c4ed6bc61016)


## Contact
Email : aryanprajapati2207@gmail.com


