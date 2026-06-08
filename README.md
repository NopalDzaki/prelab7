# Vehicle Information System

This is a simple Java program that calculates and displays information about different types of vehicles: Bicycle, Motorcycle, and Bus. It reads input data from a text file (`vehicle.txt`) and uses object-oriented programming concepts to process the data.

## Project Structure

The project contains the following files:

- **`Main.java`**: The main entry point of the program. It reads the input file, creates vehicle objects, and prints the calculated information.
- **`Bicycle.java`**: Represents a bicycle. Calculates maximum distance based on wheel size and wheel area.
- **`Motorcycle.java`**: Represents a motorcycle. Calculates maximum distance based on fuel capacity and mileage, and the fuel needed for a specific distance.
- **`Bus.java`**: Represents a bus. Calculates the minimum number of trips required to transport a certain number of passengers using a recursive method.
- **`vehicle.txt`**: The input data file containing vehicle specifications.

## Input File Format (`vehicle.txt`)

The program reads `vehicle.txt` which should be placed in the same directory as the source code (it's read as a resource stream relative to `Main.class`). It expects the following format:

- **Line 1:** Wheel size of the bicycle (integer).
- **Line 2:** Fuel capacity (integer) and mileage (integer) of the motorcycle, separated by a space.
- **Line 3:** Total passenger count (integer) and the bus's capacity (integer), separated by a space.

Example `vehicle.txt`:
```text
26
20 45
95 30
```

## How to Compile and Run

1. Open your terminal or command prompt.
2. Navigate to the project directory: `c:\Users\oreomixue\OneDrive\Documents\Sisfor SEM 2\PemDas\Code\PreLab7`
3. Compile the Java files using the `javac` command:
   ```bash
   javac *.java
   ```
4. Run the main program using the `java` command:
   ```bash
   java Main
   ```

Note: Ensure `vehicle.txt` is available in the classpath, typically in the same directory as `Main.class` when running.
