package Q34;

public class Bomb {
	public int time;
	public String color;
	public Bomb(int time, String color) {
		super();
		this.time = time;
		this.color = color;
	}
	public int getTime() {
		return time;
	}
	public String getColor() {
		return color;
	}
	public static void main(String[] args) throws Exception {
		Bomb b=new Bomb(10,"red");
		Suicide sc=new Suicide(b);
		String s = sc.diffuseIt(5,"red");
		String t = sc.checkSafety(8,"blue");
		System.out.println(s.toLowerCase());
		System.out.println(t.toLowerCase());
	}
}
