package codelab.status;

public class Trainee implements Comparable<Trainee> {

    public double length;
    private String firstName;
    private String lastName;
    private int numberOfExercisesSolved;
    private int AverageOfStudents;
    public Trainee() {
    }

    public Trainee(String firstName, String lastName, int numberOfExercisesSolved) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberOfExercisesSolved = numberOfExercisesSolved;
        this.AverageOfStudents = AverageOfStudents;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNumberOfExercisesSolved() {
        return numberOfExercisesSolved;
    }

    public void setNumberOfExercisesSolved(int numberOfExercisesSolved) {
        this.numberOfExercisesSolved = numberOfExercisesSolved;
    }

    public int compareTo(Trainee trainee) {
        return trainee.getNumberOfExercisesSolved() - this.getNumberOfExercisesSolved();
    }

    public int getAverageOfStudents() { return AverageOfStudents; }
    public void setAverageOfStudents(int AverageOfStudents) {
        this.AverageOfStudents = AverageOfStudents;
    }




}
