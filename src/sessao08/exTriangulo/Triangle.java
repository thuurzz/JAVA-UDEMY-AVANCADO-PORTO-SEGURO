package sessao08.exTriangulo;
import java.lang.Math;


public class Triangle {
	
	public double a;
	public double b;
	public double c;
	public double p;
	public double area;
	
	public Double Area(){
		p = (a + b + c) / 2.0;
		return area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
	
}
