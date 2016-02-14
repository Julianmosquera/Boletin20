/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin20;

/**
 *
 * @author Julián
 */
public class Libro {
    private String titulo,autor,ISBN;
     private int prezo,nUnidades;

    public Libro(String titulo, String autor, String ISBN, int prezo, int nUnidades) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.prezo = prezo;
        this.nUnidades = nUnidades;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getPrezo() {
        return prezo;
    }

    public void setPrezo(int prezo) {
        this.prezo = prezo;
    }

    public int getnUnidades() {
        return nUnidades;
    }

    public void setnUnidades(int nUnidades) {
        this.nUnidades = nUnidades;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", ISBN=" + ISBN + ", prezo=" + prezo + ", nUnidades=" + nUnidades + '}';
    }
    
    
    public int compareTO(Libro o) {
        if (titulo.compareToIgnoreCase(o.titulo) < 0) {
            return -1;
        } else if (titulo.compareToIgnoreCase(o.titulo) > 0) {
            return 1;
        } else {
            return 0;
        }

    }
  

 
    
    
}
