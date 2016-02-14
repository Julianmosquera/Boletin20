
package boletin20;

import javax.swing.JOptionPane;

/**
 * @version 1
 * @author Julián
 *
 */
public class Boletin20 {

    public static void main(String[] args) {

        
        int option;
        Libreria ejemplo = new Libreria();
        
        boolean condition = true;

        do {
            option = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opción \n 1.Añadir libro \n 2.Vender libro \n 3. Mostrar libros \n 4. Dar baja un libro \n 5. Consultar libro \n 6. Cerrar programa "));
            switch (option) {
                case 1:
                    ejemplo.addBooks(new Libro(JOptionPane.showInputDialog("Titulo:"), JOptionPane.showInputDialog("Autor:"), JOptionPane.showInputDialog("ISBN:"), Integer.parseInt(JOptionPane.showInputDialog("Prezo:")), Integer.parseInt(JOptionPane.showInputDialog("Unidades:"))));
                    break;
                case 2:
                    int positionBook = Integer.parseInt(JOptionPane.showInputDialog("Posicion libro que quieras vender "));
                    ejemplo.sell(positionBook);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, ejemplo.showbooks());
                    break;
                case 4:
                    ejemplo.delete();
                    break;
                case 5:
                    ejemplo.serch();
                    break;
                case 6:
                    System.exit(0);
            }

        } while (condition);

    }
}
