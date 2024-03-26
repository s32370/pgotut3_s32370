import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Student st=new Student();
        st.fname="";
        st.lname="";
        st.indexNumber="";
        st.email="";
        st.address="";
        st.grades="";

        st.StudentGroup="";

    }

    public double calculateAverageGrade(Student student) {
        if (!students.contains(student)) {
            throw new IllegalArgumentException("Student is not in the group.");
        }
        List<Double> grades = student.getGrades();
        if (grades.isEmpty()) {
            throw new IllegalArgumentException("Student has no grades.");
        }
        double sum = 0;
        for (Double grade : grades) {
            sum += grade;
        }
        double average = sum / grades.size();
        return roundToNearest(average);
    }

    public double roundToNearest(double number) {
        double[] possibleValues = {2, 2.5, 3, 3.5, 4, 4.5, 5};
        double minDifference = Double.MAX_VALUE;
        double nearestValue = number;
        for (double value : possibleValues) {
            double difference = Math.abs(number - value);
            if (difference < minDifference) {
                minDifference = difference;
                nearestValue = value;
            }
        }
        return nearestValue;
    }
}
