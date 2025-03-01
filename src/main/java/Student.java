import java.util.ArrayList;

public class Student {
    String name;
    long id;
    ArrayList<Integer> grades;

    public Student(long id, String name){
        this.id = id;
        this.name = name;
    }

    // returns the student's id
    public long getId(){
        return this.id;
    }

    // returns the student's name
    public String getName(){
        return this.name;
    }

    // adds the given grade to the grades list
    public void addGrade(int grade){
        this.grades.add(grade);
    }

    // returns the list of grades
    public ArrayList<Integer> getGrades(){
        return this.grades;
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        double gradeSum = 0;
        for(int grade : this.grades){
            gradeSum += grade;
        }
        return gradeSum / this.grades.size();
    }
}
