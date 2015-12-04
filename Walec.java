
public class Walec {
	public double r; // pole
	public double h;

	public Walec(double promien, double wysokosc) { // kontruktor
		this.r = r;
		this.h = h;
	}

	public void show() {
		System.out.println(
				"Pole powierzchni: " + (r * r * Math.PI * 2 + 2 * Math.PI * r * h));
		System.out.println("Objetosc: " + r * r * (long)Math.PI * h);
	}
}
