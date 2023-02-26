package Class29Hw;

import java.util.HashSet;

public class Student {
    /*
    Create a Set collection that will hold Objects of Student Type. In this set we do not care about the insertion order.
    Each student object should have name and studentID. Display name of each student.
     */
    String name;
    String id;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public static void main(String[] args) {
        HashSet<Student> students=new HashSet<>();
        students.add(new Student("Daniel","12344"));
        students.add(new Student("Julia","34645"));
        students.add(new Student("Jimmy","4454645"));

        for(Student s:students){
            System.out.println(s.name);
        }


    }
}
