package atividade03;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private int numeroPaginas;
    private boolean livroAberto;
    private int paginaAtual;

    public Livro(String titulo, String autor, int anoPublicacao, int numeroPaginas, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.numeroPaginas = numeroPaginas;
        this.genero = genero;
        this.paginaAtual = 1;
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

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getGenero() {
        return genero;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    private String genero;

    public void abrir(){
        this.livroAberto = true;
        System.out.println("Livro aberto.");
    }

    public void fechar(){
        this.livroAberto = false;
        System.out.println("Livro fechado.");
    }

    public boolean isLivroAberto(){
        return this.livroAberto;
    }

    public void marcarPagina(int pagina) {
        if (pagina >= 1 && pagina <= numeroPaginas) {
            paginaAtual = pagina;
        } else {
            System.out.println("Página inválida.");
        }
    }

    public void avancarPagina(int pagina) {
        if ((this.paginaAtual + pagina) <= this.numeroPaginas) {
            this.paginaAtual = (this.paginaAtual + pagina);
        }
    }

    public void retrocederPagina(int pagina) {
        if ((this.paginaAtual - pagina) > 0) {
            this.paginaAtual = (this.paginaAtual - pagina);
        }
    }
}
