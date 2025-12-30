package Workshop_week_7;

public class GradeCalculator {
	public int calculateAverage(int[] marks) {
        int sum = 0;

        for (int m : marks) {
            sum += m;
        }

        return sum / marks.length;
    }

}
