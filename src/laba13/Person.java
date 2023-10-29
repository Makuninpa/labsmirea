package laba13;

public class Person {
    private String lastName;
    private String firstName;
    private String middleName;
    public Person(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    public String getFullName() {
        StringBuilder fullName = new StringBuilder(lastName);
        if (firstName != null && !firstName.isEmpty()) {
            fullName.append(" ").append(firstName.charAt(0)).append(".");
        }
        if (middleName != null && !middleName.isEmpty()) {
            fullName.append(" ").append(middleName.charAt(0)).append(".");
        }
        return fullName.toString();
    }

    public static void main(String[] args) {
        Person person1 = new Person("Иванов", "Иван", "Иванович");
        System.out.println(person1.getFullName()); // Иванов И.И.

        Person person2 = new Person("Петров", "Петр", null);
        System.out.println(person2.getFullName()); // Петров П.

        Person person3 = new Person("Сидоров", null, null);
        System.out.println(person3.getFullName()); // Сидоров
    }
}
