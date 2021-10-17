package sessao08.exEstudante.entities;

public class Estudante {
	

	String name;
	Double n1,n2,n3;
	Double media;
	
	public Estudante() {
		
	}

	public Estudante(String name, Double n1, Double n2, Double n3) {
		this.name = name;
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
		this.media = setMedia();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getN1() {
		return n1;
	}

	public void setN1(Double n1) {
		this.n1 = n1;
	}

	public Double getN2() {
		return n2;
	}

	public void setN2(Double n2) {
		this.n2 = n2;
	}

	public Double getN3() {
		return n3;
	}

	public void setN3(Double n3) {
		this.n3 = n3;
	}

	public Double getMedia() {
		return media;
	}

	public Double setMedia() {
		return this.media = (n1 + n2 + n3);
	}

	
}
