import java.util.List;

public class Student {
    /* я не розумію як "наповнити" студента данними
    * типу імя, прізвище і тд */

    public String name;
    public String secondName;
    int id;
    public List<Student> listOfStudents;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}




