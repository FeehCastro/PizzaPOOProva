/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedidopizza;

import java.util.Scanner;


public class Order {

    int x = 0;
    double valorTotal;

    public void order() {
        SizePizza sizePizza = new SizePizza();
        Flavor flavor = new Flavor();
        EdgeFlavor edgeFlavor = new EdgeFlavor();
        Drink drink = new Drink();

        Scanner entrada = new Scanner(System.in);

        System.out.println("SELECIONE UM TAMANHO DE PIZZA");
        System.out.println("[1] - Broto");
        System.out.println("[2] - Pequena ");
        System.out.println("[3] - Media ");
        System.out.println("[4] - Familia");
        System.out.println("[5] - Gigante");
        System.out.println("Insira aqui o tamanho da pizza: ");
        sizePizza.selectSize(entrada.nextInt());

        while (x < sizePizza.qntSabores) {
            Scanner entrada2 = new Scanner(System.in);

            System.out.println("SELECIONE UM SABOR DE PIZZA");
            System.out.println("[1] - 4 Queijos");
            System.out.println("[2] - Marguerita ");
            System.out.println("[3] - Napolitana ");
            System.out.println("[4] - Calabresa");
            System.out.println("[5] - Chocolate branco ");
            System.out.println("[6] - Brigadeiro ");
            System.out.println("[7] - Mussarela ");
            System.out.println("[8] - Frango Catupiry ");
            System.out.println("[9] - Strogonoff ");
            System.out.println("Insira aqui o sabor da pizza: ");
            flavor.selectFlavor(entrada2.nextInt());
            x++;
        }
        
        if (sizePizza.validador == 0){
        Scanner entrada3 = new Scanner(System.in);
        System.out.println("Deseja adicionar borda?");
        System.out.println("[1] - Sim");
        System.out.println("[2] - Nao");
        edgeFlavor.validarBorda(entrada3.nextInt());
        }else{
            
        }

        double valor;
        if (edgeFlavor.validador == 1) {
            valor = sizePizza.valorCborda;
        } else {
            valor = sizePizza.valorTamanho;
        }

        while (drink.validador == 1) {
            Scanner entrada4 = new Scanner(System.in);
            System.out.println("Deseja adicionar bebida?");
            System.out.println("[1] - Sim");
            System.out.println("[2] - Nao");

            drink.validarDrink(entrada4.nextInt());
        }

        valorTotal = valor + flavor.valorSabor + edgeFlavor.valorBorda + drink.valorDrink;

        System.out.println("O tamanho da pizza e: " + sizePizza.tamanho);
        System.out.println("Os sabores solicitados foram: " + flavor.listaSabores);
        System.out.println("A borda solicitada foi: " + edgeFlavor.border);
        System.out.println("A bebida solicitada foi: " + drink.listaBebidas);
        System.out.println("O preço total é de: " + valorTotal);

    }
}
