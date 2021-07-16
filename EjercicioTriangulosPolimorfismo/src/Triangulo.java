
public class Triangulo extends FigurasGeometricas{
	
	float base=0;
	float altura=0;
	float area;
	
	public float calcular_area() {
		area = base * altura / 2;
		return area;
	}
}
