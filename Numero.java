package atividade03;

//construção da lista a ser feita no passo 01

public class Numero {

	private int Num;
	

	
	public Numero(int Num) {
		this.Num = Num;
	}
	
	public int getNum() {
		return Num;
	}
	
	public void setNum(int Num) {
		this.Num = Num;
	}
	
	public String getDados(){
		return "Número: " + this.Num;
	}


}
