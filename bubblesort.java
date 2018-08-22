import java.util.Scanner;
public class bubblesort {
    public static void bubbleSort(int[] dados) {
        boolean troca = true;
        while (troca) {
            troca = false;
             for (int posicao = 0; posicao < (dados.length)-1; posicao++){
                 if (dados[posicao] > dados[posicao+1]){
                     int variavelAuxiliar = dados[posicao+1];
                     dados[posicao+1] = dados[posicao];
                     dados[posicao] = variavelAuxiliar;
                     troca = true;
                    }
                }
            }
        }
     public static void imprime(int[] dados){
         for (int posicao = 0; posicao < dados.length; posicao++ ){
            System.out.println(dados[posicao]);
            }
          }
     
        public static void main(String[] args) {
        int[] dados = new int[5];
        Scanner in = new Scanner(System.in);
        for (int posicao = 0; posicao < dados.length; posicao++ ){
             System.out.println("Digite um valor ");
             dados[posicao] = in.nextInt();
        }

       bubbleSort(dados);
    }
}
