package vijayasaradhi;
public class Exercise 
{
	 // Attributes
    private String name=vijaya;
    private int difficultyLevel=100;
    private int durationMinutes=60;
    private String description=god;
    // Constructor
    public Exercise(String name, int difficultyLevel, int durationMinutes, String description) {
        this.name = name;
        this.difficultyLevel = difficultyLevel;
        this.durationMinutes = durationMinutes;
        this.description = description;
    }
    // Methods
    public String getName() {
        return name;
    }
    public int getDifficultyLevel() {
        return difficultyLevel;
    }
    public int getDurationMinutes() {
        return durationMinutes;
    }
    public String getDescription() {
        return description;
    }
}
}
