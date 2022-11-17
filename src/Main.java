import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<String>();
        myList.add("Hola");
        myList.add("Como");
        myList.add("Estas");
        myList.add("Espero");
        myList.add("Que");
        myList.add("Estés");
        myList.add("Muy");
        myList.add("Bien");
        myList.add("A");
        myList.add("AAA");
        myList.add("Ti");

        AnonClass anon = new AnonClass() {
            public void anonSort(List<String> list) {

                list.sort((x, y) -> x.length() - y.length());
                System.out.println(list);
            }

            public void anonSort2(List<String> list) {

                list.sort((x, y) -> x.compareTo(y));
                System.out.println(list);
            }
        };

        //Métodos de referencia
        myList.sort(Comparator.comparing(String::length));

        // Lambda + anonima
        anon.anonSort(myList);

        //Lambda + anonima
        anon.anonSort2(myList);
    }
}