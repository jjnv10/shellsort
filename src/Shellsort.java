import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shellsort {
    /**
     * * Método de ordenação ShellSort
     * O algoritmo ShellSort é uma versão otimizada do Insertion Sort. Ele melhora a eficiência do Insertion Sort
     * @param array
     * @return array ordenado
     * O algoritmo ShellSort é um algoritmo de ordenação que melhora a eficiência do Insertion Sort, permitindo que elementos distantes sejam trocados.
     */
    
    public Integer[] shellSort(Integer[] array) {
        int n = array.length; // Tamanho do array
        // O algoritmo ShellSort utiliza uma sequência de incrementos (gaps) para dividir o array em subarrays
        for (int gap = n / 2; gap > 0; gap /= 2) {// Reduz o gap pela metade a cada iteração
            // Realiza uma inserção em cada subarray definido pelo gap
            for (int i = gap; i < n; i++) { // Percorre o array a partir do índice gap
                // Armazena o elemento atual em uma variável temporária
                int temp = array[i];// O elemento a ser inserido na posição correta
                // Realiza a inserção do elemento na posição correta dentro do subarray
                int j;// Índice para percorrer o subarray
                // Move os elementos do subarray que são maiores que o elemento temporário para a direita
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap) {// Percorre o subarray em ordem decrescente
                    // Move o elemento para a direita
                    array[j] = array[j - gap];
                }
                array[j] = temp;// Insere o elemento temporário na posição correta
            }
        }
        return array;// Retorna o array ordenado
    }

    /**
     * * Método para gerar uma lista de números únicos dentro de um intervalo
     * @param minimo O valor mínimo do intervalo (inclusivo)
     * @param maximo O valor máximo do intervalo (inclusivo)
     * @param quantidade A quantidade de números únicos a serem gerados
     * @return Uma lista de números únicos dentro do intervalo especificado
     * * Este método gera uma lista de números únicos dentro de um intervalo especificado. Ele utiliza a classe Collections para embaralhar a lista e garantir que os números sejam únicos.
     * * O método verifica se a quantidade solicitada excede o intervalo disponível e lança uma exceção caso isso ocorra.
     */
    public List<Integer> gerarNumerosUnicos(int minimo, int maximo, int quantidade) {// Gera uma lista de números únicos dentro de um intervalo
        if (minimo > maximo) { // Verifica se o valor mínimo é maior que o máximo
            throw new IllegalArgumentException("Valor mínimo não pode ser maior que o máximo.");// Lança uma exceção se o mínimo for maior que o máximo
        }
        if (quantidade > (maximo - minimo + 1)) {// Verifica se a quantidade solicitada excede o intervalo disponível
            throw new IllegalArgumentException("Quantidade excede o intervalo disponível.");// Lança uma exceção se a quantidade for maior que o intervalo
        }

        List<Integer> numeros = new ArrayList<>();// Cria uma lista para armazenar os números únicos
        // Preenche a lista com números dentro do intervalo especificado
        for (int i = minimo; i <= maximo; i++) {
            numeros.add(i);// Adiciona o número à lista
        }

        Collections.shuffle(numeros); // Embaralha a lista
        return numeros.subList(0, quantidade); // Retorna os primeiros 'quantidade' elementos
    }

    
    
}
