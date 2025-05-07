import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shellsort {
    
    
    public Integer[] shellSort(Integer[] array) {
        int n = array.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = array[i];
                int j;
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap) {
                    array[j] = array[j - gap];
                }
                array[j] = temp;
            }
        }
        return array;
    }

    public List<Integer> gerarNumerosUnicos(int minimo, int maximo, int quantidade) {
        if (quantidade > (maximo - minimo + 1)) {
            throw new IllegalArgumentException("Quantidade excede o intervalo disponível.");
        }

        List<Integer> numeros = new ArrayList<>();
        for (int i = minimo; i <= maximo; i++) {
            numeros.add(i);
        }

        Collections.shuffle(numeros); // Embaralha a lista
        return numeros.subList(0, quantidade); // Retorna os primeiros 'quantidade' elementos
    }

    
    
}
