public class ContaCorrente{
    private double saldo;
    private double chequeEspecial;

    public contaCorrente (double saldo, double chequeEspecial){
        this.saldo = saldo;
        this.chequeEspecial = chequeEspecial;
    }
    public double creditar(double valor){
        if (valor > 0){
            if (chequeEspecial<100){
                double resto = 100 - chequeEspecial;
                valor -= resto;
                saldo += valor;
            }
        }
        return saldo;
    }
    public boolean debitar(double valor){
        double resto = saldo-valor;
        if (valor<saldo){
            this.saldo -= valor;
            return true;
        }else if (valor > saldo && resto < chequeEspecial){
            saldo = 0;
            chequeEspecial -= resto;
            return true;
        }
        return false;
    }
    public void debitarV(double valor){
        double resto = saldo-valor;
    }


}