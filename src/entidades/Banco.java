package entidades;

public class Banco {
    private String numeroDaConta;
    private String nomeTitularDaConta;
    private double valorDepositoInicail;

    public  Banco(String numeroDaConta, String nomeTitularDaConta,Double valorDepositoInicail){
        this.numeroDaConta = numeroDaConta;
        this.nomeTitularDaConta = nomeTitularDaConta;
        deposito(valorDepositoInicail);
    }
    public  Banco(String numeroDaConta, String nomeTitularDaConta){
        this.numeroDaConta = numeroDaConta;
        this.nomeTitularDaConta = nomeTitularDaConta;

    }

    public String getNumeroDaConta(){
        return numeroDaConta;
    }


    public String getNomeTitularDaConta(){
        return nomeTitularDaConta;
    }
    public void setNomeTitularDaConta(String nomeTitularDaConta){
        this.nomeTitularDaConta = nomeTitularDaConta;
    }

    public double getValorDepositoInicail(){
        return valorDepositoInicail;
    }

    public void deposito(double deposito){
        this.valorDepositoInicail += deposito ;
    }
    public void saque(double saque){
        this.valorDepositoInicail = (valorDepositoInicail - 5) - saque;
    }

    public String toString(){
        return "Numero da conta: " + numeroDaConta + " nome da conta: "+ numeroDaConta + " Saldo da conta: "+ valorDepositoInicail;
    }
}