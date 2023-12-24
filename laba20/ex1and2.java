package laba20;

public class ex1and2 {
    public static void main (String[] args){
        MyClass<Integer, String, Double> object = new MyClass<>(19,"Pavel", 108.0);

        System.out.println("T: " + object.getT());
        System.out.println("V: " + object.getV());
        System.out.println("K: " + object.getK());

//        System.out.println(object.toString());

        object.print();
    }
}
