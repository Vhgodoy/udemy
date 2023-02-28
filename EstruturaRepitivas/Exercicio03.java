import java.util.Scanner;

public class Exercicio03 {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int Alcool = 0;
        int Gasolina = 0;
        int diesel = 0;


        int prod = sc.nextInt();

        while ( prod != 4) {
                if (prod == 1) {
                Alcool += 1;
                    System.out.println("Alccol: " + Alcool);
            }
                  else if (prod == 2) {
                Gasolina += 1;
                    System.out.println("Gasolina: " + Gasolina);
            }
                  else if (prod == 3) {
                diesel += 1;
                    System.out.println("Diesel: " + diesel);
            }
                  else if (prod >4) {
                    System.out.println("produto invalido");
                }

            prod = sc.nextInt();

        }
        System.out.println("Muito Obrigado");
        System.out.println("Alcool: " + Alcool);
        System.out.println("Gasolina: " + Gasolina);
        System.out.println("Diesel: " + diesel);


            sc.close();
        }
    }

