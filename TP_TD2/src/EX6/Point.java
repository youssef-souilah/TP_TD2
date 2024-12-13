package EX6;

public class Point {

	private double x,y;
	private String nom;
	
	public Point(double x, double y, String nom) {
		this.x = x;
		this.y = y;
		this.nom = nom;
	}

	public void Affiche() {
		System.out.println("Point nommé "+this.nom+" et de coordonnées "+this.x+"  "+this.y);
	}
	
	@Override
	public String toString() {
		return "Point nommé "+this.nom+" et de coordonnées "+this.x+"  "+this.y;
	}
	
	
}
