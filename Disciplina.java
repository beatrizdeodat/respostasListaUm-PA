package lista;

public class Disciplina {
    private String nome;
    private String codigo;
    
    public Disciplina(String n, String c) {
    	this.nome = n;
    	this.codigo = c;
    }
    public String getNome() {
    	return nome;
    }
    public String getCodigo() {
    	return codigo;
    }
    public void setNome(String novoNome) {
    	this.nome = novoNome;
    }
    public void setCodigo(String novoCodigo) {
    	this.codigo = novoCodigo;
    }
}
