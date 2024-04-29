package exemploArrayList;

import java.util.ArrayList;

public class ExemploArrayList {
  public static void main(String[] args) {
	ArrayList<String> nomes = new ArrayList<String>();
	
	nomes.add("Beatriz");
	nomes.add("Pietro");
	nomes.add("Gratidão");
	
	System.out.println(nomes);
	
	ArrayList<Integer> idade = new ArrayList<Integer>();
	
	idade.add(17);
	idade.add(18);
	idade.add(19);
	
	System.out.println(idade);
	
	ArrayList<Double> alturas = new ArrayList<Double>();
	
	alturas.add(1.60);
	alturas.add(1.70);
	alturas.add(1.75);
	
	System.out.println(alturas);
  }	
}
