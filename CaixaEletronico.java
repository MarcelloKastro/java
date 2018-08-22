import java.util.Scanner;
public class CaixaEletronico {
    public static void main(String [] args){
        Scanner ms = new Scanner(System.in);
        double saldo = ms.nextInt();
        Scanner tcl = new Scanner(System.in);
        int acao = 0, continuar = 1;

        System.out.println("Bem vindo");

        while (continuar == 1) {
            System.out.println("Declare a ação que deseja executar");
            System.out.print("1 - Saldo" + "  ");
            System.out.print("2 - Saque" + "  ");
            System.out.print("3 - Depódito" + "  ");
            System.out.println("4 - Sair");
            acao = tcl.nextInt();
            break;
            }switch (acao) {
                    case 1: {
                        switch (acao) {
                case 1:{
                    System.out.println("Seu saldo de " + saldo);
                    break;
                    }
                    case 2:{
                        System.out.println("Seu Saque de "+" ");
                        break;
                    }
                    case 3:{
                        System.out.println("Seu depósito de"+" ");
                        break;
                    }
                    case 4:{
                        
                        System.exit(4);
                        System.out.println("Volte sempre ");
                     break;
             }
           }
         }
       }
    }
}
