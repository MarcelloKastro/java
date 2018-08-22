import java.util.Random;
import java.util.Scanner;
public class BuscaSequencial {
    public static void main(String[] args) {
        Random ale = new Random();
        Scanner ms = new Scanner(System.in);
        int vetor[] = new int[5];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = ale.nextInt();
        }
        System.out.println("Digite um valor a ser buscado" + " ");
        int valores = ms.nextInt();
        for (int i = 0; i < vetor.length; i++) {
            if (valores == vetor[i]) {
                System.out.println("Valor achado");
                break;
            }
            if (valores != vetor[i]) {
                System.out.println("Valor não achado ");
                break;
            }
        }
    }
}
