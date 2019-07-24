public class Loja{
    private ContaCorrente conta;
    public Loja(double saldo, double chequeEspecial){
        conta = new ContaCorrente(saldo, chequeEspecial);
    }
    public void vender (double valor){
        conta.creditar(valor);
        System.out.println("Operação concluida com sucesso.");
    }
    public void comprar(double valor){
        this.conta.saca(valor);
        System.out.println("Operação concluída com sucesso.");
    }
    public static void main (String[]args){
        Loja a = new Loja();
        try{
            a.vender(100);}
        catch{
            
        }
        a.comprar(200);
    }
}