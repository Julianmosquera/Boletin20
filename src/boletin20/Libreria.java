package boletin20;

import java.util.ArrayList;

import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author Julián
 */
public class Libreria {

    ArrayList<Libro> lib = new ArrayList();

    public void loadArray() {
        Libro lib1 = new Libro("Primero", "aa", "1a", 35, 5);
        Libro lib2 = new Libro("Segundo", "ab", "1b", 15, 3);
        Libro lib3 = new Libro("Tercero", "ac", "1c", 25, 7);
        Libro lib4 = new Libro("Cuarto", "ad", "1d", 14, 20);

        lib.add(lib1);
        lib.add(lib2);
        lib.add(lib3);
        lib.add(lib4);

    }

    public void addBooks(Libro libadd) {
        lib.add(libadd);

    }

    public void sell(int f) {
        lib.remove(f);
    }

    public String showbooks() {
        Collections.sort(lib,null); //¿Porque se necesita ell null?
        String cadea = "";
        for (Libro lib : lib) {
            cadea += "\n" + lib.toString();

        }
        return cadea;
    }

    public void delete(){
        for (int i=0;i<lib.size();i++)
            if (lib.get(i).getnUnidades()==0)
                lib.remove(i);
    }
    
    public void serch(){
        String li=JOptionPane.showInputDialog("Introduce el titulo del libro");
        for(int i=0;i<lib.size();i++){
            if (lib.get(i).getTitulo().equalsIgnoreCase(li)){
                JOptionPane.showMessageDialog(null,lib.get(i).toString());
                
            }
            
        }
        
    }
    
    

}
