/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedidopizza;

import java.util.ArrayList;


public class Flavor {

    double preçoSabor;
    SizePizza size = new SizePizza();
    ArrayList<String> listaSabores = new ArrayList<>();

    Order order = new Order();

    public ArrayList<String> selectFlavor(int op) {

        switch (op) {
            case 1:
                listaSabores.add("5 Queijos");
                break;
            case 2:
                listaSabores.add("Frango Catupiry");
                break;
            case 3:
                listaSabores.add("Cheddar");
                preçoSabor += 3.50;
                break;
            case 4:
                listaSabores.add("Calabresa");
                break;
            case 5:
                listaSabores.add("Chocolate");
                break;
            case 6:
                listaSabores.add("Prestígio");
                break;
            case 7:
                listaSabores.add("Salmão com alcaparras");
                preçoSabor += 4;
                break;
            case 8:
                listaSabores.add("Camarão ");
                preçoSabor += 4.5;
                break;
            case 9:
                listaSabores.add("Abacaxi com Canela");
                break;
        }

        return listaSabores;
    }

}
