package entites;

public class Aluno {
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notafinal() {
		return nota1 + nota2 + nota3;
	}
	
	public double notarestante() {
		if (notafinal() < 60.0) {
			return 60.0 - notafinal();
		}else {
			return 0.0;
		}
	}
}
