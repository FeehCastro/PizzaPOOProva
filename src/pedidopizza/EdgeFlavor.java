/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedidopizza;






import java.util.Scanner; 



    class EdgeFlavor {

    int op;
    String border = "";
    double valorBorda;
    int validador = 0;
    Order order = new Order();
	private Scanner entrada;

    public int validarBorda(int op) {
        switch (op) {
            case 1:
                selectBorder();
                validador = 1;
                break;
            case 2:

                break;
        }
        return 0;
    }

    public String selectBorder() {
        entrada = new Scanner(System.in);

        System.out.println("SELECIONE UM SABOR DE BORDA");
        System.out.println("[1] - Cheddar");
        System.out.println("[2] - Catupiry ");
        System.out.println("[3] - ½ Nutella ½ Doce de Leite");
        System.out.println("[4] - Nutella");
        System.out.println("Insira aqui a borda da pizza: ");
        op = entrada.nextInt();

        switch (op) {
            case 1:
                border = "Cheddar";
                break;

            case 2:
                border = "Catupiry";
                break;

            case 3:
                border = "½ Nutella ½ Doce de Leite";
                valorBorda = 3;
                break;

            case 4:
                border = "Nutella";
                valorBorda = 2;
                break;
        }
        return border;
    }
}
