public class Loja{
    private ContaCorrente conta;
    public ContaCorrente(double saldo, double chequeEspecial){
        conta = conta.ContaCorrente(saldo, chequeEspecial);
    }
    public boolean vender (double valor, Cliente cliente){
        boolean comprou = cliente.comprar(valor);
        if (comprou){
            boolean vendeu = creditar(valor);
            return true;
        }
        return false;
    }
}