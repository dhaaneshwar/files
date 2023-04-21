package Q59;

class Company{
	
	String name;
	String type;
	int cutoff;
	boolean drive;
	public Company(String name, String type, int cutoff, boolean drive) {
		super();
		this.name = name;
		this.type = type;
		this.cutoff = cutoff;
		this.drive = drive;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCutoff() {
		return cutoff;
	}
	public void setCutoff(int cutoff) {
		this.cutoff = cutoff;
	}
	public boolean isDrive() {
		return drive;
	}
	public void setDrive(boolean drive) {
		this.drive = drive;
	}
	
}