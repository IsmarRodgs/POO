public class Diretor extends Funcionario implements Autenticavel{
    protected itn senha;
    public Diretor(){
        public  boolean autentica(int senha){
            if (this.senha==senha){
                return true;
            }
            return false;
        }
    }
}