import java.io.IOException;
import java.util.Scanner;

abstract class Area{
	
	public abstract int getArea();
}

class Circle extends Area{
	float radius;
	private final double pie=Math.PI;
	public Circle(float radius) {
		// TODO Auto-generated constructor stub
		this.radius=radius;
	}
	@Override
	public int getArea() {
		// TODO Auto-generated method stub
		return (int) Math.ceil(pie * Math.pow(radius, 2));
	}
	
}
class Rectangle extends Area {
    private final double width, length; //sides

   
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public int getArea() {
        // A = w * l
        return (int) Math.ceil(width * length);
    }

   

}
class Square extends Area{
	float side;
	public Square(float side) {
		// TODO Auto-generated constructor stub
		this.side=side;
	}
	@Override
	public int getArea() {
		// TODO Auto-generated method stub
		return (int) Math.ceil(Math.pow(side, 2));
	}
	
}
public class Solution {
    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner sc = new Scanner(System.in);        
        
        float radius = Float.parseFloat(sc.nextLine());
        Circle c1 = new Circle(radius);
      	System.out.println(c1.getArea());   
        
        float width = sc.nextFloat();
        float height = sc.nextFloat();
        Rectangle r1 = new Rectangle(width, height);
      	System.out.println(r1.getArea());
      	sc.nextLine();
        
        radius = Float.parseFloat(sc.nextLine());
        Circle c2 = new Circle(radius);
      	System.out.println(c2.getArea());
    
        width = Float.parseFloat(sc.nextLine());
        Square s1 = new Square(width);
      	System.out.println(s1.getArea());
        
      	width = sc.nextFloat();
        height = sc.nextFloat();
        Rectangle r2 = new Rectangle(width, height);
      	System.out.println(r2.getArea());
        
        sc.close();
    }
}