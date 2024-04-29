package lista;

public class Professor {
     private String nome;
     private String departamento;
     private String titulação;
     
     public Professor(String n, String d, String t) {
    	 this.nome = n;
    	 this.departamento = d;
    	 this.titulação = t;
     }
     public String getNome() {
    	 return nome;
     }
     public String getDepartamento() {
    	 return departamento;
     }
     public String getTitulação() {
    	 return titulação;
     }
     public void setNome(String novoNome) {
    	 this.nome = novoNome;
     }
    public void setDepartamento(String novoDepartamento) {
    	this.departamento = novoDepartamento;
    }
    public void setTitulação(String novaTitulação) {
    	this.titulação = novaTitulação;
    }
    
}
