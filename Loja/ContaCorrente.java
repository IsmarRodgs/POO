package Loja;

public class ContaCorrente {
    private double saldo;
    private double chequeEspecial;

    public ContaCorrente (double saldo, double chequeEspecial){
        this.saldo = saldo;
        this.chequeEspecial = chequeEspecial;
    }
    public boolean creditar(double valor){
        if (valor >= 0){
            if (chequeEspecial < 100){
                double resto = 100 - chequeEspecial;
                chequeEspecial = 100;
                valor -= resto;
            }
            saldo += valor;
            return true;
        }
        System.out.println("\nNão possivel creditar um valor negativo.\n");
        return false;//Valor é negativo, logo não é um valor válido.
    }
    public boolean debitar(double valor){
        double resto = valor-saldo;
        if (valor < saldo && valor >= 0 || resto == 0){
            this.saldo -= valor;
            return true;
        }else if (valor > saldo && resto <= chequeEspecial){
            saldo = 0;
            chequeEspecial -= resto;
            return true;
        }else if (valor < 0 ){
            System.out.println("\nNão foi possivel debitar um valor negativo.");
            return false; //Não foi possivel debitar um valor negativo.
        }
        System.out.println("\nNão foi possivel debitar um valor acima do limite.");
        return false;//Não é possivel debitar um valor acima do limite.
    }
    public String transferencia(ContaCorrente contaCreditar, ContaCorrente contaDebitar, double valor){
        boolean debitado = contaDebitar.debitar(valor);
        if (debitado){
            boolean creditado = contaCreditar.creditar(valor);
            if (creditado){
                return "Operação concluida com sucesso.";
            }
            return "Não foi possivel concluir a operação. Valor inválido.";
        }
        return "Não foi possivel concluir a operação. Valor negativo ou acima do limite possivel.";
    }
    public String toString(){
        return "Saldo: "+this.saldo+", Cheque Especial: "+this.chequeEspecial;
    }
}
