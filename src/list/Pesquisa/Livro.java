package list.Pesquisa;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPubicacao;

    public Livro(String titulo, String autor, int anoPubicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPubicacao = anoPubicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPubicacao() {
        return anoPubicacao;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPubicacao=" + anoPubicacao +
                '}';
    }
}
