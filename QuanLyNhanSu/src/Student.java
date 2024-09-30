public class Student {
    private String id;
    private String name;
    private int birthyear;

    public Student() {

    }

    public Student(String id, String name, int birthyear) {
        this.id = id;
        this.name = name;
        this.birthyear = birthyear;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBirthyear() {
        return birthyear;
    }
    public void setBirthyear(int birthyear) {
        this.birthyear = birthyear;
    }

}
