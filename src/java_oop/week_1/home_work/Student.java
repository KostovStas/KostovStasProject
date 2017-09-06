package java_oop.week_1.home_work;


public class Student {

    private static final int DEFAULT_SIZE = 10;

    private String name;
    private String adress;
    private Subject[] listOfSubjects;
    private int freePlaces;
    private int subjectPosition;

    public Student(String name, String adress) {
        this.name = name;
        this.adress = adress;
        listOfSubjects = new Subject[DEFAULT_SIZE];
        this.freePlaces = DEFAULT_SIZE;
    }


    public boolean addSubject(Subject subject) {
        if (freePlaces == 0) {
            System.out.println("Can not add a subject. Not free places");
            return false;
        } else {
            listOfSubjects[subjectPosition] = subject;
            freePlaces--;
            subjectPosition++;
        }
        return true;
    }

    // delete last subject in subject's array
    public boolean deleteLastSubject() {
        listOfSubjects[listOfSubjects.length - 1] = null;
        freePlaces++;
        subjectPosition--;
        return true;
    }

    public void showSubjectsInfo() {
        for (int i = 0; i < subjectPosition; i++) {
            System.out.println(listOfSubjects[i]);
        }
    }

    // среднее бал за все предметы
    public double subjectsAverageScore() {
        int averageScore = 0;
        for (int i = 0; i < subjectPosition; i++) {
            averageScore = averageScore + listOfSubjects[i].getStudentMarkForSubject();
        }
        return (double)averageScore/subjectPosition;
    }


    public void study(Subject subject){
       subject.setTotalWorkedHoursBySudent(5);
       subject.setStudentMarkForSubject(1);
    }

    public String getName() {
        return name;
    }
}


