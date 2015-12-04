
public class Main {
	public static void main(String[] args) {
		Kwadrat figura = new Kwadrat(10); // definicja kwadrat i inicjalizacja z
											// wartością 10
		figura.show(); // wywołanie show
		Walec figura2 = new Walec(5, 1);
		figura2.show();
		Walec figura3 = figura.przygotujWalec();
		figura3.show();
		System.out.println("_______________");
		Wyraz wyraz = new Wyraz();
		wyraz.dodajZnak('a');
		wyraz.dodajZnak('b');
		wyraz.dodajZnak('c');
		wyraz.dodajZnak('d');
		System.out.println(wyraz.toString());
		System.out.println(wyraz.length());

	}
}
