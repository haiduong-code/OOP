//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student s = new Student("23020523", "Nguyen Hai Duong", 2005);
        System.out.println(s.getId());
        Teacher t = new Teacher();
        t.setBirthyear(1982);
        t.setName("Pham Khanh Duy");
        System.out.println(t.getName());
    }
}