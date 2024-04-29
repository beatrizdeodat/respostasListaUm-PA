package lista;

public class Hora {
    private int minuto;
    private int hora;
    
    public Hora(int m, int h) {
    	this.minuto = m;
    	this.hora = h;
    }
    public int getMinuto() {
    	return minuto;
    	
    }
    public int getHora() {
    	return hora;
    }
    public void setMinuto(int novoMinuto) {
    	this.minuto = novoMinuto;
    }
    public void setHora(int novaHora) {
    	this.hora = novaHora;
    }
    public String toString() {
    	return hora + ":" + minuto;
   
    }
}
