public class Cliente{
    private ContaCorrente conta;

    public double comprar(double valor){
        double saldo = conta.debitar(valor);
    }
}