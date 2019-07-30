public class ExercicioX {

	public static void main(String[] args) {
		
		ExercicioX e = new ExercicioX();
		e.mostraValor();
		System.out.println();
		
		System.out.println(e.soma());
		System.out.println(e.somaTermos(1, 1000, 1000));
		System.out.println(e.somarTodos(1, 1000));
		e.calcularMultiplo(12);
		e.calcularFatorial();
	}
	
	public void mostraValor(){
		//Imprima todos os números de 150 a 300
		for(int i = 150; i <= 300; i++){
					
			System.out.println(i);
		}
	}
	
	public int soma(){
		
		//Imprimir a soma de 1 até 1000
		int i = 0;
		int soma = 0;
		
		while(i <= 1000){
			soma = soma + i;
			i++;
		}
		
		return soma;
	}
	
	public int somaTermos(int a1, int an, int n){
		
		//Imprimir a soma de 1 até 1000
		int sn;
		
		sn = ((a1 + an) * n) / 2;
		
		return sn;
	}
	
	//Imprimir a soma de 1 até 1000
	public long somarTodos(int inicio, int fim) {  
		   return ((inicio + fim) * (fim-inicio+1)) / 2;  
	}  
	
	//calcular multiplos de 3
	public void calcularMultiplo(int numero){
		
		if(numero % 3 == 0)
			System.out.println("É multiplo de três");
		else 
			System.out.println("Não é multiplo");		
	}
	
	//calcular fatorial
	public void calcularFatorial(){
		
		int total = 1; 
		
		for (int i =1; i <= 10; i++) { 
			total = total * i; 
		} 
		
		System.out.println(total); 
	}
}