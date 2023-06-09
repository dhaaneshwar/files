package Training4;

public class Material {
	
	int mass;
	int temprature;

	public Material(int mass, int temprature) {
		
		this.mass = mass;
		this.temprature = temprature;
	}

	public int getMass() {
		return mass;
	}

	public int getTemprature() {
		return temprature;
	}
	
	
	public String checkMaterial() throws Exception{
		
		if(mass<0) {
			throw new MaterialException("Mass cannot be negative");
		}
		
		if(mass==0) {
			throw new MaterialException("Mass cannot be zero");
		}
		
		return "Valid material";
	}

	
	public String flowOfHeat() throws Exception{
		
//		System.out.println(checkMaterial());
		try {
			checkMaterial();

			
			
		}catch(MaterialException e1) {
			return "Invalid Material";
		}
		catch(Exception e) {
			return "Other Exception";
		}
		
		return "Both in equilibrium";
	}
	
	
	public static void main(String[] args) throws Exception {
		
		Material m=new Material(12,32);
		
		String s=m.flowOfHeat();
		
		System.out.println(s);

	}

}
