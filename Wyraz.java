
public class Wyraz {
	public String pusty;
	public int zero;
	
	public Wyraz(){
		this.pusty="";
		this.zero=0;
	}
	public void dodajZnak (char znak){
		zero=znak+zero;
		zero++;
	}
	public String toString(){
		return pusty;
	}
	public int length(){
		return zero;
	}
}
