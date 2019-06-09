public class Loja{
    private ContaCorrente conta;
    public void vender (double valor){
        double saldo = conta.creditar(valor);
    }
}