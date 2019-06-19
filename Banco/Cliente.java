public class Cliente extends Pessoa{
    protected double saldo;
    protected double limite;
    protected double chequeEspecial;

    public Cliente(){
        
    }
    public void sacar(double valor){
        saldo+=valor;
    }
    public void depositar(double valor){
        saldo-=valor;
    }

    //adicionar um diretor que pode autenticar.


}