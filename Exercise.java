public class Exercise{
	private String name;
	private String muscleGroup;
	private String reps;
	private String sets;
	private String weightType;


	//Constructor for objects used to store information relating to exercises.
	public Exercise(String name, String muscleGroup, String reps, String sets, String weightType){
		this.name=name;
		this.muscleGroup=muscleGroup;
		this.reps=reps;
		this.sets=sets;
		this.weightType=weightType;
	}
	//Getter for muscle attribute of object
	public String getMuscle(){
		return muscleGroup;
	}

	@Override
	public String toString(){
		return String.format("Exercise: %s, Muscle: %s, Repetitions: %s, Sets: %s, Type of Weight: %s\n", 
			name, muscleGroup, reps, sets, weightType);
	}
}