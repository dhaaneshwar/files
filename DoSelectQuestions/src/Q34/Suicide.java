package Q34;

class Suicide{
	public Bomb bomb;

	public Suicide(Bomb bomb) {
		this.bomb = bomb;
	}
	public String diffuseIt(int time, String color) throws Exception{
		if(time>bomb.getTime())
			throw new SuicideException("Time exceeded");
		if(!color.equals(bomb.color))
			throw new SuicideException("Wrong color");
		return "Hope is there";
	}
	public String checkSafety(int time, String color) throws Exception{
		try{
			diffuseIt(time,color);
		}
		catch(SuicideException e) {
			return "Bomb exploded";
		}
		catch(Exception e) {
			return "Other exception";
		}
		return "Take a bow";
	}
}