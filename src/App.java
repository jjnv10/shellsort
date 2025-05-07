import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        Shellsort shellsort= new Shellsort(); // Cria uma instância da classe Shellsort
        // Gera uma lista de números únicos entre 1 e 200, com tamanho 7
        List<Integer> array = shellsort.gerarNumerosUnicos(1, 200, 7);
        // Exibe a lista original e a lista ordenada
        System.out.println("Array original: " + array);
        // Ordena a lista usando o método shellSort e converte de volta para uma lista
        // O método shellSort retorna um array, então convertemos para uma lista
        array = List.of(shellsort.shellSort(array.toArray(new Integer[0])));
        // Exibe a lista ordenada
        // O método shellSort retorna um array, então convertemos para uma lista
        System.out.println("Array ordenado: " + array);
    }
}
