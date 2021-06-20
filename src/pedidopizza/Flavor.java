/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedidopizza;

import java.util.ArrayList;


public class Flavor {

    double valorSabor;
    SizePizza size = new SizePizza();
    ArrayList<String> listaSabores = new ArrayList<String>();

    Order order = new Order();

    public ArrayList<String> selectFlavor(int op) {

        switch (op) {
            case 1:
                listaSabores.add("4 Queijos");
                break;
            case 2:
                listaSabores.add("Marguerita");
                break;
            case 3:
                listaSabores.add("Napolitana");
                valorSabor += 3.50;
                break;
            case 4:
                listaSabores.add("Calabresa");
                break;
            case 5:
                listaSabores.add("Chocolate branco");
                break;
            case 6:
                listaSabores.add("Brigadeiro");
                break;
            case 7:
                listaSabores.add("Mussarela");
                valorSabor += 4;
                break;
            case 8:
                listaSabores.add("Frango Catupiry ");
                valorSabor += 4.5;
                break;
            case 9:
                listaSabores.add("Strogonoff");
                break;
        }

        return listaSabores;
    }

}
