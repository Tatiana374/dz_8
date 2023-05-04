import java.util.LinkedList;
import java.util.List;

public class Group {

    private Student headOfGroup;
    Group(Student headOfGroup) {
        this.headOfGroup = headOfGroup;
        studentList.add(headOfGroup);
    }
    public Student getHeadOfGroup() {
        return headOfGroup;
    }
    public void setHeadOfGroup(Student headOfGroup) {
        this.headOfGroup = headOfGroup;
    }

    private List<Student> studentList = new LinkedList<>();

    private List<String> groupTasks = new LinkedList<>();

    public void addNewStudentToGroup(Student newStudent) {

        studentList.add(newStudent);
    }


    public void removeStudentFromGroup(Student student) {
        studentList.remove(student);
    }


    public void addTaskToGroup(String taskName) {

        groupTasks.add(taskName);
    }




}








