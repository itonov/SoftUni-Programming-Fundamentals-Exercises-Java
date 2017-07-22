import java.util.*;

public class AverageStudentGrades {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        Map<String, List<Double>> studentGrades = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] inputTokens = console.nextLine().split(" ");
            String name = inputTokens[0];
            double grade = Double.parseDouble(inputTokens[1]);

            if (!studentGrades.containsKey(name)){
                studentGrades.put(name, new ArrayList<>());
            }

            studentGrades.get(name).add(grade);
        }

        for (Map.Entry<String, List<Double>> studentGrade : studentGrades.entrySet()) {
            String student = studentGrade.getKey();
            List<Double> grade = studentGrade.getValue();

            System.out.print(student + " -> ");

            double gradeSum = 0;
            for (double mark : grade) {
                System.out.printf("%.2f ", mark);
                gradeSum += mark;
            }

            System.out.printf("(avg: %.2f)", gradeSum / grade.size());
            System.out.println();
        }
    }
}
