package Ex_07;

public class Livro {
    private String titulo;
    private String autor;
    private String categoria;
    private int numero_paginas;
    private String isbn;


    public Livro(String titulo, String autor, String categoria, int numero_paginas, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.numero_paginas = numero_paginas;
        this.isbn = isbn;
    }


    public String getTitulo() {
        return this.titulo;
    }
    public String getAutor() {
        return this.autor;
    }
    public String getCategoria() {
        return this.categoria;
    }
    public int getNumeroPaginas() {
        return this.numero_paginas;
    }
    public String getIsbn() {
        return this.isbn;
    }


    public void exibirDetalhes(){
        System.out.println("Titulo: "+this.titulo);
        System.out.println("Autor: "+this.autor);
        System.out.println("Categoria: "+categoria);
        System.out.println("N. Paginas: "+numero_paginas);
        System.out.println("ISBN: "+isbn+"\n");
    }


}
