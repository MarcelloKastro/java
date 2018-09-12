import java.util.Scanner;

public class banco {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double saldo = 0;
        boolean sair = false;
        banco obj = new banco();
        while (sair ==false){
           obj.menu(saldo);
           int opcao = tcl.nextInt();
           switch (opcao){
               case 1:
                   obj.MostrarSaldo(saldo);
                   break;
               case 2:
                   saldo = obj.sacar(saldo);
                   break;
               case 3:
                   saldo = obj.depositar(saldo);
                   break;
               case 4:
                   sair = obj.Sair(sair);
                   break;
               default:
                   System.out.println("Digite um valor válido");
        }
      }
        
    }
    public void menu(double valor){
        System.out.println("Escolha uma opção");
        System.out.println("");
        System.out.println("1 - Ver Saldo");
        System.out.println("2 - Sacar");
        System.out.println("3 - Depositar");
        System.out.println("4 - Sair");
    }
    public void MostrarSaldo(double saldo){
        System.out.println("Seu saldo é R$ " + saldo);
    }
    public double sacar(double saldo){
        Scanner tcl = new Scanner(System.in);
        System.out.println("Digite o valor que deseja sacar");
        double valor = tcl.nextInt();
        saldo = saldo - valor;
        return saldo;    
    }
    public double depositar(double saldo){
        Scanner tcl = new Scanner(System.in);
        System.out.println("Digite o valor a ser depositado");
        double valor = tcl.nextInt();
        saldo = saldo + valor;
        return saldo;  
    }
    
    public boolean Sair(boolean Sair){
        Scanner tcl = new Scanner(System.in);
        System.out.println("Você realmente quer sair Y/N");
        String acao = tcl.next();
        if (acao.equals("Y")){
            Sair = true;
        }else {
            acao.equals("N");
            Sair = false;
        }
        return Sair;
    }
}
