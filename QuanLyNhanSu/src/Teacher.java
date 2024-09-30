public class Teacher {
    private String name;
    private int birthyear;
    public Teacher(){

    }

    public Teacher(String name, int birthyear) {
        this.name = name;
        this.birthyear = birthyear;
    }
    public String getName() {
        return name;
    }
    public int getBirthyear() {
        return birthyear;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBirthyear(int birthyear) {
        this.birthyear = birthyear;
    }

}
