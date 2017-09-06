package java_oop.week_1.home_work;


public class Subject {

    private String name;
    private int totalHoursPerSemester;
    private int totalWorkedHoursBySudent;
    private int studentMarkForSubject;

    public Subject(String name, int totalHoursPerSemester) {
        this.name = name;
        this.totalHoursPerSemester = totalHoursPerSemester;
        //this.totalWorkedHoursBySudent = totalWorkedHoursBySudent;
        //this.studentMarkForSubject = studentMarkForSubject;
    }

    // test mehtod
    public boolean passExam(Student student) {
        if(student.subjectsAverageScore() > 3){
            System.out.println("Student " + student.getName() + "pass the " + this.name);
            return true;
        }else {
            System.out.println("Student " + student.getName() + " doesn't pass the " + this.name);
        }
        return false;
    }


    public String getName() {
        return name;
    }

    public int getTotalWorkedHoursBySudent() {
        return totalWorkedHoursBySudent;
    }

    // show subject info
    public void showSubjectInfo(){
        System.out.printf("Subject name is %s, total hours in semester is  %d, total worked hours %d, sutedt mark %d",
                            name,totalHoursPerSemester,totalWorkedHoursBySudent,studentMarkForSubject);

    }

    @Override
    public String toString() {
        return String.format("Subject name is %s, total hours in semester is  %d, total worked hours %d, sutedt mark %d",
                name,totalHoursPerSemester, totalWorkedHoursBySudent,studentMarkForSubject);
    }

    public int getStudentMarkForSubject() {
        return studentMarkForSubject;
    }


    public void setTotalWorkedHoursBySudent(int totalWorkedHoursBySudent) {
        this.totalWorkedHoursBySudent = totalWorkedHoursBySudent;
    }

    public void setStudentMarkForSubject(int studentMarkForSubject) {
        this.studentMarkForSubject = studentMarkForSubject;
    }

}
