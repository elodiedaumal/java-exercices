import java.math.BigDecimal;

public class StudentRunner {
    public static void main(String[] args) {

        Student student = new Student("Elodie", 95, 10, 50, 67);
        Student student2 = new Student("Elisa", 95, 100, 88, 78);
        Student student3 = new Student("Mooncake", 10, 25, 30, 18, 59, 5);

        student.deleteMark(1);
        student.addMarks(100);
        System.out.println("Name of the student: " + student.getName());
        System.out.println("student's Marks: " + student.getMarks());

        int number = student.getNumberOfMarks();
        System.out.println(student.getName() + " number of marks " + number);

        int sum = student.getSumOfMarks();
        System.out.println(student.getName() + " sum of marks " + sum);

        int maximumMark = student.getMaximumMark();
        System.out.println(student.getName() + " maximum mark " + maximumMark);

        int minimumMark = student.getMinimumMark();
        System.out.println(student.getName() + " minimum mark " + minimumMark);

        BigDecimal average = student.getAverageMark();
        System.out.println(student.getName() + " average mark " + average);

        System.out.println("Name of the student: " + student3.getName());

        System.out.println(student3.getName() + " number of marks " + student3.getNumberOfMarks());

        System.out.println(student3.getName() + " sum of marks " + student3.getSumOfMarks());

        System.out.println(student3.getName() + " maximum mark " + student3.getMaximumMark());

        System.out.println(student3.getName() + " minimum mark " + student3.getMinimumMark());

        System.out.println(student3.getName() + " average mark " + student3.getAverageMark());

        System.out.println("Name of the student: " + student2.getName());

        System.out.println(student2.getName() + " number of marks " + student2.getNumberOfMarks());

        System.out.println(student2.getName() + " sum of marks " + student2.getSumOfMarks());

        System.out.println(student2.getName() + " maximum mark " + student2.getMaximumMark());

        System.out.println(student2.getName() + " minimum mark " + student2.getMinimumMark());

        System.out.println(student2.getName() + " average mark " + student2.getAverageMark());
    }
}
