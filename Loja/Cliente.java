public class Cliente{
    private ContaCorrente conta;
    public Cliente(double valor, double chequeEspecial){
        this.conta = new ContaCorrente(valor, chequeEspecial);
    }
    public boolean comprar(double valor){
        boolean debitado = conta.debitar(valor);
        return debitado;
    }
    public String toString(){
        return "Cliente - "+conta.toString();
    }
}