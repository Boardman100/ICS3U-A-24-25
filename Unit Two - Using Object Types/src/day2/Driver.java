package day2;

public class Driver {
    public static void main(String[] args) {
        Student student1 = new Student("Steve", 17, "112324", 3.5, "Com Sci", 2025, true);
        Student student2 = new Student("Jacob", 23, "123231", 2.9, "Eng", 2026, false);
        String info1 = student1.getinfo();
        System.out.println(info1);
        // System.out.println(student1.age) -> Age is private and is not a variable
        student2.study(5); // study does not return anything
    }
}
