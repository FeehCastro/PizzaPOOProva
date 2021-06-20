
package pedidopizza;

import java.util.ArrayList;
import java.util.Scanner;


public class Drink {

    int op;
    String drink = "";
    double valorDrink;
    int validador = 1;
    ArrayList<String> listaBebidas = new ArrayList<>();

    public int validarDrink(int op) {

        switch (op) {
            case 1:
                selectDrink();
                break;
            case 2:
                validador = validador - 1;
                break;

        }
        return 0;
    }

    public ArrayList<String> selectDrink() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("SELECIONE UMA BEBIDA");
        System.out.println("[1] - Coca Cola 2 LT");
        System.out.println("[2] - Guaraná 2 LT");
        System.out.println("[3] - Fanta 2 LT");
        System.out.println("[4] - Agua Mineral 600 ML");
        System.out.println("Insira aqui uma bebida: ");
        op = entrada.nextInt();

        switch (op) {
            case 1:
                listaBebidas.add("Coca Cola 2 LT");
                valorDrink = valorDrink + 9.5;
                break;

            case 2:
                listaBebidas.add("Guaraná 2 LT");
                valorDrink = valorDrink + 6.5;
                break;

            case 3:
                listaBebidas.add("Fanta 2LT");
                valorDrink = valorDrink + 12.5;
                break;

            case 4:
                listaBebidas.add("Agua Mineral 600 ML");
                valorDrink = valorDrink + 3.5;
                break;
        }

        return listaBebidas;
    
    }
    }
