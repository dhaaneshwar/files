package Q43;

import java.util.*;

public class WalkingBoy {
	int stepSize;
	int blockSize;

	public WalkingBoy(int stepSize, int blockSize) {
		this.stepSize = stepSize;
		this.blockSize = blockSize;
	}

	public int getStepSize() {
		return stepSize;
	}

	public int getBlockSize() {
		return blockSize;
	}
	
	public String targetHit(String platform) throws Exception{
		List<String> s=new ArrayList<String>();
		String str="";
		for(int i=0;i<platform.length();i++) {
			
			str+=platform.charAt(i);
			if(str.length()==blockSize) {
				s.add(str);
				str="";
			}
		}
		
		for(String i:s) {
			String a=i.substring(0,stepSize);
			if(a.contains("x")) {
				throw new BombBlast("You Hit the target");
			}
		}
		return "Win";
	}

	public static void main(String[] args) {
		WalkingBoy boy = new WalkingBoy(2,3);
		try {
			System.out.println(boy.targetHit("1212121x212"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
