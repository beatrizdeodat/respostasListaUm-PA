package lista;

public class DataHora {
      Hora refHora;
      Data refData;
      
      public DataHora(Hora novHora, Data novData) {
    	  this.refHora = novHora;
    	  this.refData = novData;	
      }
      public void setRefHora(Hora novaHora) {
    	  this.refHora = novaHora;   	  
      }
      public void setRefData(Data novaData) {
    	  this.refData = novaData;
      }
      public String toString() {
    	  return refData.toString() + refHora.toString();
   
      }
      
}
