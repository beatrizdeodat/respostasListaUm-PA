package lista;

public class Empresa {
    private String nome;
    private String cnpj;
    
    public Empresa(String n, String c) {
    	this.nome = n;
    	this.cnpj = c;
    }
    public String getNome() {
    	return nome;
    }
    public String getCnpj() {
    	return cnpj;
    }
    public void setNome(String novoNome) {
    	this.nome = novoNome;
    }
    public void setCnpj(String novoCnpj) {
    	this.cnpj = novoCnpj;
    }
}
