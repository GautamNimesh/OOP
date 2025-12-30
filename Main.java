package Workshop_week_7;

public class Main {
	public static void main(String[] args) {
		System.out.println("Student Management System.");
		Student s1 = new Student("Ram", 20);

        int[] marks = {80, 75, 90};

        GradeCalculator gc = new GradeCalculator();
        int average = gc.calculateAverage(marks);

        System.out.println("Student Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
        System.out.println("Average Marks: " + average);
	}
}
