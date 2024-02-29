package programa;

import entidades.Banco;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Aplicacao app = new Aplicacao();
        app.start();
    }

    private void start() {
        Scanner scan = new Scanner(System.in);
        System.out.println("DIgite o numero da conta: ");
        String numeroConta = scan.nextLine();
        System.out.println("Digite o nome da conta: ");
        String nomeConta = scan.nextLine();
        System.out.println("Vai ter saldo inicial(1 para sim/ 2 para nao)? ");
        Banco conta = new Banco(numeroConta,nomeConta);
        try {
            int opcao = scan.nextInt();
            if (opcao == 1) {
                System.out.println("Digite o saldo inical: ");
                double valorInicial = scan.nextDouble();
                conta = new Banco(numeroConta, nomeConta, valorInicial);

            }else if (opcao ==2){
                conta = new Banco(numeroConta,nomeConta);

            }
        }catch (Exception exception){
            System.out.println("Digite uma opcao valida! ");

        }
        System.out.println(conta);


        System.out.println("digite o valor que quer depositar: ");
        double valor = scan.nextDouble();
        conta.deposito(valor);
        System.out.println(conta);

        System.out.println("digite o valor que quer sacar: ");
        valor = scan.nextDouble();
        conta.saque(valor);
        System.out.println(conta);













    }
}
