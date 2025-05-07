import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        Shellsort shellsort= new Shellsort();
        List<Integer> array = shellsort.gerarNumerosUnicos(1, 200, 7);
        System.out.println("Array original: " + array);

        array = List.of(shellsort.shellSort(array.toArray(new Integer[0])));
        System.out.println("Array ordenado: " + array);
    }
}
