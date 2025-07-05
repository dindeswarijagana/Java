public class StudentGrader {

//    private final int marks;
//
//    public StudentGrader(int marks) {
//        this.marks = marks;
//    }


    public String getGrade(int marks) {
        if (marks <= 0 || marks > 100) {
            throw new IllegalArgumentException("Invalid Marks");
        }

        if (marks > 90) {
            return "A+";
        }

        if (marks > 80 && marks < 90) {
            return "A";
        }
        if (marks > 70 && marks < 80) {
            return "B";
        }

        if (marks > 60 && marks < 70) {
            return "C";
        }
        if (marks > 50 && marks < 60) {
            return "D";
        }
        return "F";
    }
}
