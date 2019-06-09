public class Cliente{
    private ContaCorrente conta;
    public Cliente(double valor, double chequeEspecial){
        this.conta = conta.ContaCorrente();
    }
    public boolean comprar(double valor){
        boolean debitado = conta.debitar(valor);
        return debitado;
    }
}