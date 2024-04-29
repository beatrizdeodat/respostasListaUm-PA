package lista;

public class Livro {
    private String titulo;
    private String autor;
    private String editora;
    private int anoPublicado;
    
    public Livro(String t, String a, String e, int ap) {
    	this.titulo = t;
    	this.autor = a;
    	this.editora = e;
    	this.anoPublicado = ap;
    }
    public String getTitulo() {
    	return titulo;
    }
    public String getAutor() {
    	return autor;
    }
    public String getEditora() {
    	return editora;
    }
    public int getAnoPublicado() {
    	return anoPublicado;
    }
    public void setTitulo(String novoTitulo) {
    	this.titulo = novoTitulo;
    }
    public void setAutor(String novoAutor) {
    	this.autor = novoAutor;
    }
    public void setEditora(String novaEditora) {
    	this.editora = novaEditora;
    }
    public void setAnoPublicado(int novoAnoPublicado) {
    	this.anoPublicado = novoAnoPublicado;
    }
    
}
