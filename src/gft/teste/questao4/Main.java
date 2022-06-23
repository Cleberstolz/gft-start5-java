package gft.teste.questao4;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int gasolina = 0;
        int diesel = 0;

        Scanner sc = new Scanner(System.in);

        Carros[] c = new Carros[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um Modelo ");
            String modelo = sc.nextLine();
            System.out.println("Digite uma Marca ");
            String marca = sc.nextLine();
            System.out.println("Digite se é gasolina ou diesel ");
            String combustivel = sc.nextLine();
            c[i] = new Carros(modelo, marca);
            c[i].combustivel = combustivel;
            if(Objects.equals(combustivel, "gasolina")) {
                gasolina++;
            } else if (Objects.equals(combustivel, "diesel")) {
                diesel++;
            }
        }

        System.out.println("Carros gasolina: " + gasolina);
        System.out.println("Carros diesel: " + diesel);

        System.out.println(c[0].dados());
        System.out.println(c[1].dados());
        System.out.println(c[2].dados());
        System.out.println(c[3].dados());
        System.out.println(c[4].dados());
    }
}
