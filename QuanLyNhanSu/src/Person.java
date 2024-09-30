public class Person {
    private String name;
    private int birthyear;
    public Person() {

    }

    public Person(String name, int birthyear) {
        this.name = name;
        this.birthyear = birthyear;
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
