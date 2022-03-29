package atividade03;
import java.util.ArrayList;

public class Estrutura_dados {

	public static void main(String[] args) {

			ArrayList<Numero> Item = new ArrayList<>();	
			Item.add(new Numero(1));
			Item.add(new Numero(2));
			Item.add(new Numero(3));
			Item.add(new Numero(4));
			Item.add(new Numero(5));
			
			for (int i = 0; i < Item.size(); i++) {
				System.out.println(Item.get(i).getDados());
			}

	}
}