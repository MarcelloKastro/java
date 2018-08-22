import java.util.Scanner;
public class BuscaBinária {
    public static void main(String[] args) {
        Scanner ms = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor que deseja");
        int tamanho = ms.nextInt();
        int v[] = new int[tamanho];
        for (int i = 0; i < v.length; i++) {
            v[i] = i;
        }
        int minimo = v[0];
        int maximo = v.length;
        int metade = (minimo + maximo) / 2;
        System.out.println("Digite um valor para buscar");
        int valor = ms.nextInt();
        if (valor < metade) {
            for (int i = 0; i < v.length; i++) {
                if (valor == v[i]) {
                    System.out.println("Posição do valor é " + i);
                }
            }
        } else if (valor > metade) {
            for (int i = 0; i < v.length; i++) {
                if (valor == v[i]) {
                    System.out.println("Posição do valor é " + i);
                }
            }
        } else if (valor == metade) {
            System.out.println("Posição do valor é " + metade);
        }
    }
}
