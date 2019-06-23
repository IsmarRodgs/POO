public class Gerente extends Funcionario implements Autenticavel{
    private int senha;
    private int numFuncionariosGerenciados;

    public boolean autentica(int senha){
        if(this.senha==senha){
            return true;
        }
        return false;
        
    }
    public boolean;;;///completar
}