
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Cuadrado square = new Cuadrado();
		square.lado = 34.5f;
		System.out.println(square.calcular_area());
		System.out.println("");
		
		Triangulo triangle = new Triangulo();
		triangle.base = 6.5f;
		triangle.altura = 4;
		System.out.println(triangle.calcular_area());
		
		
		Circulo circle = new Circulo();
		circle.pi= 3.1416f;
		circle.radio = 3;
		System.out.println(circle.calcular_area());
		
	}

}
