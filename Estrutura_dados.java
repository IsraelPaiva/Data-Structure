package atividade03;
import java.util.ArrayList;



public class Estrutura_dados {

	public static void main(String[] args) {

			// Passo 1: Insira os números [1, 2, 3, 4 e 5] em uma lista - com 5 células; FOI UTILIZADA A CLASSE NUMERO PARA CRIAR AS VARIÁVEIS E MÉTODOS.
		
			ArrayList<Numero> Item = new ArrayList<>(5);	
			Item.add(new Numero(1));
			Item.add(new Numero(2));
			Item.add(new Numero(3));
			Item.add(new Numero(4));
			Item.add(new Numero(5));
			System.out.println("Inciando a Lista");
			
				
			for (int i = 0; i < Item.size(); i++) {
				System.out.println(Item.get(i).getDados());
			}
			
			System.out.println("\n\n");
			
			// Passo 2: Remova todos os dados da lista e insira-os em uma Pilha - com 5 células. Deve-se sempre remover os dados da célula inicial da lista; 
			
			Item.clear();
			System.out.println(Item);
			System.out.println("Dados removidos da lista! \n\n");
			
			System.out.println("Iniciando a pilha: ");
			
			// Passo 2: Remova todos os dados da lista e insira-os em uma Pilha - com 5 células. Deve-se sempre remover os dados da célula inicial da lista; 
			// FOI UTILIZADA A CLASSE PILHA PARA CRIAR AS VARIÁVEIS E MÉTODOS.
			
			Pilha p = new Pilha();
			p.push(5);
			p.push(4);
			p.push(3);
			p.push(2);
			p.push(1);
			
			while (!p.isEmpty()) {
				int elemento = p.pop();
				System.out.println("Número: " + elemento);
			}	
			
			System.out.println("\n\n");
			
			// Passo 3: Remova os dados da Pilha e insira-os em uma Fila - com 10 células); 
			
			while (!p.isEmpty()) {
				p.pop();
				System.out.println(p);

			}		
			
			System.out.println("A pilha está vazia! \n\n");

			// Passo 3: Remova os dados da Pilha e insira-os em uma Fila - com 10 células); 
			
			Fila fila = new Fila();
			fila.inserir(1);
			fila.inserir(2);
			fila.inserir(3);
			fila.inserir(4);
			fila.inserir(5);
			
			System.out.println("Adicionando na Fila: ");
			
			while(! fila.isEmpty()) {
				int f = fila.retirar();
				System.out.println("Números: " + f);
			}
			
			System.out.println("\n\n");
			
			//Passo 4: Insira os números [6, 7, 8, 9 e 10] na lista; 
			
			Item.add(new Numero(6));
			Item.add(new Numero(7));
			Item.add(new Numero(8));
			Item.add(new Numero(9));
			Item.add(new Numero(10));
			
			// Passo 5: Repita os passos 2 e 3. 
			
			Item.clear();
			System.out.println(Item);
			System.out.println("Dados removidos da lista! \n\n");
			
			System.out.println("Iniciando a pilha novamente: ");
				
			p.push(5);
			p.push(4);
			p.push(3);
			p.push(2);
			p.push(1);
			
			while (!p.isEmpty()) {
				int elemento = p.pop();
				System.out.println("Número: " + elemento);
			}	
			
			while (!p.isEmpty()) {
				p.pop();
			}
			
			System.out.println("\n\n");
			
			fila.inserir(1);
			fila.inserir(2);
			fila.inserir(3);
			fila.inserir(4);
			fila.inserir(5);
			
			// Passo 6: Exiba todos os números que foram inseridos na fila. 
			
			
			System.out.println("Fila implementada: " + fila.imprimir());
	}
	

}
			

