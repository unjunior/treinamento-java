package lista1;

public class AreaCirculo {
	/*9. Escreva uma classe para calcular a área de um círculo, sabendo que a área
	é A = PI * r2, onde o raio (r) deve ser informado pelo usuário e o resultado terá
	que ser arredondado.
*/
	
	final double PI = 3.14;
	double raio;
	
	public double CalcularArea(){
		return PI * (raio * raio);
	}
}


