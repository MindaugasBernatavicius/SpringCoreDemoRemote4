package cf.mindaugas._01_dependencyinjection;

public class App {
    public static void main(String[] args) {
        Person person1 = new Person(new FullName("Jonas", "Jonaitis"));
        System.out.println(person1);

        Person person2 = new Person();
        person2.setFullName(new FullName("Petras", "Petraitis"));
        System.out.println(person2);
    }
}

class Person {
    private int id;
    private FullName fullName;

    // 0. No Dependency Injection -> class person creates it's own dependencies
    // private FullName fullName = new FullName("Jonas", "Jonaitis");

    // 1. Constructor Dependency Injection
    public Person(FullName fullName){
        this.fullName = fullName;
    }

    public Person(){}

    // 2. Setter Dependency Injection
    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name=" + fullName +
                '}';
    }
}

class FullName {
    private String firstName;
    private String lastName;

    public FullName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "FullName{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
