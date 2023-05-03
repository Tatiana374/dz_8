public class Student {

    private String name;
    private String secondName;
    int id;


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


    private static int idCounter = 0;

    public Student(String name, String secondName) {
        this.id = ++idCounter;
        this.name = name;
        this.secondName = secondName;
    }
}
