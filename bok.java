
public class Kwadrat {
	public double bok;

	public Kwadrat(double bok) { // kontruktor
		this.bok = bok;
	}

	public void show() {
		System.out.println("Pole: " + bok * bok);
		System.out.println("Objetosc: " + bok * bok * bok);
	}

	public Walec przygotujWalec() {
		Walec walec = new Walec(bok / 2, bok); //definiują nowy walec srednica a i wysokosc a
		return walec;
	}
}
