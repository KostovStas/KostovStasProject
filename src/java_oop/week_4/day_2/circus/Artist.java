package java_oop.week_4.day_2.circus;


public abstract class Artist {

    private String specialization;
    private String name;
    private int age;
    private double salary;
    private int actionTimes;


    public Artist(String specialization, String name, int age, long salary) {
        this.specialization = specialization;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Artist(String name) {
        this.name = name;
    }

    public Artist(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void action();

    public String getSpecialization() {
        return specialization;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public int getActionTimes() {
        return actionTimes;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void setSalary(double salary) {
        if (this instanceof Acrobat) {
            salary = salary + (salary * 0.1);
        }
        this.salary += salary;
    }

    public void setActionTimes(int actionTimes) {
        this.actionTimes = actionTimes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Artist artist = (Artist) o;

        if (age != artist.age) return false;
        if (Double.compare(artist.salary, salary) != 0) return false;
        if (actionTimes != artist.actionTimes) return false;
        if (specialization != null ? !specialization.equals(artist.specialization) : artist.specialization != null)
            return false;
        return name != null ? name.equals(artist.name) : artist.name == null;
    }

    @Override
    public String toString() {
        return String.format("%s, %d years old \n", name,age);
    }

}
