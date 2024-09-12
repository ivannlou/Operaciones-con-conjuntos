//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.HashSet;
import java.util.Set;
import java.util.AbstractMap.SimpleEntry;

public class Main {

    public static Set<Object> union(Set<Object> a, Set<Object> b) {
        Set<Object> resultado = new HashSet<>(a);
        resultado.addAll(b);
        return resultado;
    }

    public static Set<Object> interseccion(Set<Object> a, Set<Object> b) {
        Set<Object> resultado = new HashSet<>(a);
        resultado.retainAll(b);
        return resultado;
    }

    public static Set<Object> dif(Set<Object> a, Set<Object> b) {
        Set<Object> resultado = new HashSet<>(a);
        resultado.removeAll(b);
        return resultado;
    }

    public static boolean subconjunto(Set<Object> a, Set<Object> b) {
        return a.containsAll(b);
    }

    public static Set<SimpleEntry<Object, Object>> cartesiano(Set<Object> a, Set<Object> b) {
        Set<SimpleEntry<Object, Object>> result = new HashSet<>();
        for (Object elementoA : a) {
            for (Object elementoB : b) {
                result.add(new SimpleEntry<>(elementoA, elementoB));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Set<Object> setA = new HashSet<>();
        Set<Object> setB = new HashSet<>();

        setA.add(8);
        setA.add(5);
        setA.add(4);

        setB.add(7);
        setB.add(8);
        setB.add(3);

        System.out.println("Union: " + union(setA, setB));
        System.out.println("Interseccion: " + interseccion(setA, setB));
        System.out.println("Diferencia (A - B): " + dif(setA, setB));
        System.out.println("B es subconjunto de A = " + subconjunto(setA, setB));
        System.out.println("Producto cartesiano A X B: " + cartesiano(setA, setB));
    }
}
