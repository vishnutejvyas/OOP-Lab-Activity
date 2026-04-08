// Write a Java program to demonstrate Encapsulation in Object-Oriented Programming. Create a class Student with private data members such as name and age. Use public getter and setter methods to access and modify these variables. In the main class, create an object of the Student class, set the values, and display the details. //


class Student {

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    public int getAge() {
        return age;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setName("Vishnu");
        s1.setAge(18);

        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
    }
}