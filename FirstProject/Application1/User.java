
public class User 
{
	// Attributes
    private String name;
    private int age;
    private int exercisesCompleted;
    // Constructor to initialize attributes
    public User(String name, int age) {
        this.name = name;
        this.age = age;
        this.exercisesCompleted = 0; // Initialize exercisesCompleted to 0
    }
    // Methods
    // Returns the name of the user
    public String getName() {
        return name;
    }
    // Returns the age of the user
    public int getAge() {
        return age;
    }
    // Returns the number of exercises completed by the user
    public int getExercisesCompleted() {
        return exercisesCompleted;
    }
    // Takes an Exercise object as a parameter and updates exercisesCompleted for the user
    public void completeExercise(Exercise exercise) {
        // Here, you can update exercisesCompleted as needed based on the Exercise object.
        // For example, you can increment it by 1 for each completed exercise.
        exercisesCompleted++;
    }
}
}
