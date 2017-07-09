
public class Calculadora {

	int x,y;
	
	public Calculadora(int x, int y)
	{
		this.x = x;
		this.y = y;
	};
	
	public int somar(){
		return x+y;
	}
	
	public int subtrair(){
		return x-y;
	}
	
	public double dividir(){
		return x/y;
	}
	
	public double multiplicar(){
		return x*y;
	}
}
