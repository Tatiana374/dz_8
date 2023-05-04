public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Harry", "Potter");
        Student student2 = new Student("Ron","Weasley");
        Student headOfGroup = new Student("Hermione","Granger");



        Group firstGroup = new Group(student2);
        firstGroup.addNewStudentToGroup(student1);
        System.out.println(firstGroup);

        firstGroup.setHeadOfGroup(student1);
        System.out.println(firstGroup);

        firstGroup.addTaskToGroup("to learn java methods");
        firstGroup.addTaskToGroup("try not cry while doing it");

        firstGroup.removeStudentFromGroup(student2);
        System.out.println(firstGroup);







    }


}