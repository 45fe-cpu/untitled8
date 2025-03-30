## Project Structure
- **Main.java** – main program logic.
- **README.md** – project documentation.


## Time Complexity Analysis
- **Finding the minimum** – O(n), as we traverse the array once.
- **Calculating the average** – O(n), as we sum all elements.
- **Prime number check (recursion)** – O(n), as we check all divisors.
- **Factorial calculation** – O(n), due to n recursive calls.
- **Fibonacci sequence** – O(2^n), because of two recursive calls per step.
- **Exponentiation** – O(n), as it requires n recursions.
- **Reversing an array output** – O(n), due to n recursive calls.
- **Checking if a string contains only digits** – O(n), since we check each character.

## Running the Project
1. Open IntelliJ IDEA.
2. Create a new project and add the source code.
3. Run the program via `Run` or using the command:
   ```sh
   javac Main.java && java Main
   ```

## Testing
- Enter data into the console according to the examples.
- Compare the output with the expected result.

## Working with Git
### Initializing the Repository
```sh
git init
git add .
git commit -m "Initial commit"
git branch -M main
git remote add origin <REPOSITORY_URL>
git push -u origin main
```

### Basic Git Commands
```sh
git status        # Check file status
git add .        # Add all changes
git commit -m "Description of changes"
git push         # Push changes
```

## Author
Zhanel Shunshalinova
