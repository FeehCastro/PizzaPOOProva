/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedidopizza;

/**
 *
 * @author felip
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Order order = new Order();
       SizePizza size = new SizePizza();
       Flavor flavor = new Flavor();
       Drink drink = new Drink();
       
       order.order();
   }
}