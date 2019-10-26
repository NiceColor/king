package AVEWYCC;

public class Vector2D {
	double vX;
	double vY;
	public static int count=0;
	public Vector2D(){
	this.vX=1;
	this.vY=1;
	count++;
	}
	public Vector2D(double vX, double vY){
	this.vX=vX;
	this.vY=vY;
	count++;
	}
	public Vector2D(Vector2D Vector){
	this.vX= Vector.vX;
	this.vY= Vector.vY;
	count++;
	}
	
	public double length(){
	return Math.sqrt(this.vX*this.vX+this.vY*this.vY);
	}
	void add(Vector2D v){
	this.vX += v.vX;
	this.vY += v.vY;
	}
	void sub(Vector2D v){
		this.vX -= v.vX;
		this.vY -= v.vY;
		}
	void scale(double scaleFactor){
		this.vX *= scaleFactor;
		this.vY *= scaleFactor;
	}
	void print(){
		System.out.print("(");
		System.out.printf("%.2f", this.vX);
		System.out.print(", ");
		System.out.printf("%.2f", this.vY);
		System.out.println(")");
		}
	void normalized(){
		double konb = this.length();
		this.vX /= konb;
		this.vY /= konb;
	}
	double dotProduct(Vector2D v){
		return this.vX*v.vX+this.vY*v.vY;
	}
	public static void main(String[] args){
		Vector2D vA = new Vector2D();
		Vector2D vB = new Vector2D(5.0, 7.0);
		Vector2D vC = new Vector2D(vB);
		vA.add(vB);
		vA.print();
		vA.sub(vC);
		vA.print();
		System.out.println(vB.length());
		vC.scale(1.5);
		vC.print();
		vC.normalized();
		System.out.println(vC.length());
		vC.scale(2);
		System.out.println(vA.dotProduct(vB));
		System.out.println(vA.count);
	}
}
