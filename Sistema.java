public class Sistema {
    public static void main (String []args){
        Cliente cliente = new Cliente(100,100);
        Loja loja = new Loja (1000,100);
        boolean venda1= loja.vender (100, cliente);
        System.out.println(loja.toString());
        System.out.println(cliente.toString());
        boolean venda2= loja.vender (150, cliente);
        System.out.println(loja.toString());
        System.out.println(cliente.toString());
        boolean venda3= loja.vender(0, cliente);
        System.out.println(loja.toString());
        System.out.println(cliente.toString());
        boolean venda4= loja.vender (-10, cliente);
        System.out.println(loja.toString());
        System.out.println(cliente.toString());
        System.out.printf(venda1+" "+venda2+" "+venda3+" "+venda4);
    }
}