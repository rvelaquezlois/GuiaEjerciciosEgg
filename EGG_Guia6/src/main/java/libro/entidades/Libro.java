/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libro.entidades;

/**
 *
 * @author elpir
 */
public class Libro {
    private long ISBN;
    private String titulo;
    private String Autor;
    private int paginas;

    public Libro() {
    }

    public Libro(long ISBN, String titulo, String Autor, int paginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.Autor = Autor;
        this.paginas = paginas;
    }

    public long getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    
    
}
