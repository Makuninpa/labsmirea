package laba9;

public class ex1 {
    public static void main(String[] args) {
        Student[] students = new Student[] {
                new Student(3, "Павел"),
                new Student(1, "Даниил"),
                new Student(4, "Сергей"),
                new Student(2, "Виктор")
        };

        System.out.println("Before sorting:");
        displayStudent(students);

        insertionSort(students);

        System.out.println("\nAfter sorting by iDNumber:");
        displayStudent(students);
    }

    public static void displayStudent(Student[] students){
        for (Student student : students){
            System.out.println(student);
        }
    }

    public static void insertionSort(Student[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Student key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }
}
