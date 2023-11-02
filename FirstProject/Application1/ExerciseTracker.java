package vijayasaradhi;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExerciseTracker {
    public static void main(String[] args) {
        List<Exercise> exercises = new ArrayList<>();
        List<User> users = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu Options:");
            System.out.println("1. Add a new exercise.");
            System.out.println("2. Display available exercises.");
            System.out.println("3. Select an exercise to complete.");
            System.out.println("4. Exit.");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    // Add a new exercise
                    System.out.print("Enter exercise name: ");
                    String exerciseName = scanner.nextLine();
                    System.out.print("Enter difficulty level: ");
                    String difficultyLevel = scanner.nextLine();
                    System.out.print("Enter duration (in minutes): ");
                    int duration = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter exercise description: ");
                    String description = scanner.nextLine();

                    Exercise newExercise = new Exercise(exerciseName, difficultyLevel, duration, description);
                    exercises.add(newExercise);
                    System.out.println("Exercise added successfully.");
                    break;

                case 2:
                    // Display available exercises
                    if (exercises.isEmpty()) {
                        System.out.println("No exercises available.");
                    } else {
                        System.out.println("Available Exercises:");
                        for (Exercise exercise : exercises) {
                            System.out.println(exercise);
                        }
                    }
                    break;

                case 3:
                    // Select and complete an exercise
                    if (exercises.isEmpty()) {
                        System.out.println("No exercises available.");
                    } else {
                        System.out.print("Select an exercise (enter the exercise number): ");
                        int exerciseNumber = scanner.nextInt();
                        scanner.nextLine();
                        
                        if (exerciseNumber >= 1 && exerciseNumber <= exercises.size()) {
                            Exercise selectedExercise = exercises.get(exerciseNumber - 1);
                            System.out.print("Enter your username: ");
                            String username = scanner.nextLine();
                            User user = new User(username);
                            user.completeExercise(selectedExercise);
                            System.out.println(username + " completed " + selectedExercise.getName());
                        } else {
                            System.out.println("Invalid exercise number.");
                        }
                    }
                    break;

                case 4:
                    // Exit the application
                    System.out.println("Goodbye!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        }
    }
}

class Exercise {
    private String name;
    private String difficultyLevel;
    private int duration;
    private String description;

    public Exercise(String name, String difficultyLevel, int duration, String description) {
        this.name = name;
        this.difficultyLevel = difficultyLevel;
        this.duration = duration;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nDifficulty: " + difficultyLevel + "\nDuration: " + duration + " minutes\nDescription: " + description;
    }
}

class User {
    private String username;
    private int completedExercisesCount;

    public User(String username) {
        this.username = username;
        this.completedExercisesCount = 0;
    }

    public void completeExercise(Exercise exercise) {
        completedExercisesCount++;
    }
}
