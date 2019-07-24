public class ContaCorrente{
    private double saldo;
    private double chequeEspecial;

    public ContaCorrente (double saldo, double chequeEspecial){
        this.saldo = saldo;
        this.chequeEspecial = chequeEspecial;
    }
    public void deposita(double valor) throws NegativeValueException{
        if (valor >= 0){
            this.saldo += valor;
        }
        throw new NegativeValueException("Não possivel creditar um valor negativo.");
    }
    public void saca(double valor) throws NegativeValueException, SaldoInsuficienteException{
        if (this.valor+this.limite<valor){
            throw new SaldoInsuficienteException ();
        }
        else if(valor<=0){
            throw new NegativeValueException ("Valor digitado é invalido");
        }
        this.saldo -= valor;
    }

    public void setLimite(Double valor){
        this.chequeEspecial = valor;
    }
}