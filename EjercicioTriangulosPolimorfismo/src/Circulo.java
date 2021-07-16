
public class Circulo extends FigurasGeometricas {
	float pi = 3.1416f;
	float radio = 0;
	float area; 
	
	public float calcular_area() {
		area = pi * (radio * radio);
		return area;
	}
}
