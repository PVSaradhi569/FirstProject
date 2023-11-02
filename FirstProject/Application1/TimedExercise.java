package vijayasaradhi;
public class TimedExercise 
{
	 private int timeRemaining; // Additional attribute for TimedExercise

	    // Constructor to initialize attributes, including those inherited from Exercise
	    public TimedExercise(String name, int difficultyLevel, int durationMinutes, String description, int timeRemaining) {
	        super();
	        this.timeRemaining = timeRemaining;
	    }

	    // Getter method for timeRemaining
	    public int getTimeRemaining() {
	        return timeRemaining;
	    }

	    // Method to decrease timeRemaining by the specified number of seconds
	    public void decreaseTime(int seconds) {
	        if (seconds > 0) {
	            timeRemaining -= seconds;
	            if (timeRemaining < 0) {
	                timeRemaining = 0;
	            }
	        }
	    }
	}

