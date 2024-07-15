package application;

import java.util.Scanner;

import entites.Aluno;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		System.out.println("Digite o nome do aluno");
		aluno.nome = sc.nextLine();
		System.out.println("Digite a primeira nota: ");
		aluno.nota1 = sc.nextDouble();
		System.out.println("Digite a segunda nota: ");
		aluno.nota2 = sc.nextDouble();
		System.out.println("Digite a terceira nota: ");
		aluno.nota3 = sc.nextDouble();
		
		System.out.println("A nota final do aluno foi: " +aluno.notafinal());
		
		if (aluno.notafinal() < 60.0) {
			System.out.println("Aluno reprovado, faltam " +aluno.notarestante() + " pontos para passar.");
		}else {
			System.out.println("Aluno Aprovado");
		}
		sc.close();
	}

}
