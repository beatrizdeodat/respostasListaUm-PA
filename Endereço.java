package lista;

public class Endereço {
     private String rua;
     private int numero;
     private String complemento;
     private String bairro;
     private String cidade;
     private String estado;
     private String cep;
     
     public Endereço(String r, int n, String co, String b, String c, String e, String ce) {
    	 this.rua = r;
    	 this.numero = n;
    	 this.complemento = co;
    	 this.bairro = b;
    	 this.cidade = c;
    	 this.estado = e;
    	 this.cep = ce;
     }
     public String getRua() {
    	 return rua;
     }
     public int getNumero() {
    	 return numero;
     }
     public String getComplemento() {
    	 return complemento;
     }
     public String getBairro() {
    	 return bairro;
     }
     public String getCidade() {
    	 return cidade;
     }
     public String getEstado() {
    	 return estado;
     }
     public String getCep() {
    	 return cep;
     }
     public void setRua(String novaRua) {
    	 this.rua = novaRua;
     }
     public void setNumero(int novoNumero) {
    	 this.numero = novoNumero;
     }
     public void setComplemento(String novoComplemento) {
    	 this.complemento = novoComplemento;
     }
     public void setBairro(String novoBairro) {
    	 this.bairro = novoBairro;
     }
     public void setCidade(String novaCidade) {
    	 this.cidade = novaCidade;
     }
     public void setEstado(String novoEstado) {
    	 this.estado = novoEstado;
     }
     public void setCep(String novoCep) {
    	 this.cep = novoCep;
     }
}
