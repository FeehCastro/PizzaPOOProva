/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedidopizza;


public class SizePizza {

    int qtdSabores;
    double preçoTamanho;
    double preçoCborda;
    String tamanho;
    int validador = 0;
    EdgeFlavor edgeflavor = new EdgeFlavor();

    public int selectSize(int op) {

        switch (op) {
            case 1:
                qtdSabores = 5;
                tamanho = "Gigante";
                preçoTamanho = 75;
                preçoCborda = 80;
                break;

            case 2:
                qtdSabores = 4;
                tamanho = "Familia";
                preçoTamanho = 66;
                preçoCborda = 69.5;
                break;

            case 3:
                qtdSabores = 3;
                tamanho = "Media";
                preçoTamanho = 52;
                preçoCborda = 56.5;
                break;

            case 4:
                qtdSabores = 3;
                tamanho = "Pequena";
                preçoTamanho = 42;
                preçoCborda = 44.5;
                break;

            case 5:
                qtdSabores = 2;
                tamanho = "Broto";
                preçoTamanho = 28;
                validador = 1;
                break;
        }
        return qtdSabores;
    }
}
