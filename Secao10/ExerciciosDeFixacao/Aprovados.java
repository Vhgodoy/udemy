package ExerciciosDeFixacao;

import entities.aluno;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;


public class Aprovados {


    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double nota1 = 0.0 , nota2 = 0.0;
        int semester = 2;
        final double PESO = 6.0;


        System.out.print("Quantos alunos serao digitados? ");
        n = sc.nextInt();

        aluno[] vect = new aluno[n];
        aluno aluno = new aluno(nota1,nota2);

        for (int i=0;i<n;i++) {
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno:\n" , i + 1);
            sc.nextLine();
            String name = sc.nextLine();
            nota1 = sc.nextDouble();
            nota2 = sc.nextDouble();
            vect[i] = new aluno(name, nota1, nota2);
        }

        System.out.println("Alunos aprovados:");
        for (int i=0;i<n;i++) {
            if (vect[i].notaf(semester) >= PESO) {
                System.out.print(vect[i].name + "\n");
            }
        }

        sc.close();
    }
}
