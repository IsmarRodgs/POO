public class Loja{
    private ContaCorrente conta;
    public Loja(double saldo, double chequeEspecial){
        conta = new ContaCorrente(saldo, chequeEspecial);
    }
    public boolean vender (double valor, Cliente cliente){
        boolean comprou = cliente.comprar(valor);
        if (comprou){
            boolean vendeu = conta.creditar(valor);
            if (vendeu){
                System.out.println("\nOperação concluida com sucesso.");
            }
            return vendeu;
        }
        return false;
    }
    public String toString(){
        return "Loja - "+conta.toString();
    }
}