package co.edureka;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Speed s= new Speed();
		SpeedImplementation ob=new SpeedImplementation();
		
		System.out.println(ob.setSpeed(s,25));

	}

}

class SpeedInvalidException extends Exception
{
    SpeedInvalidException(String str)
    {
         super(str);
    }
    
}

class Speed{
	String speed;
}
class SpeedImplementation{
	String setSpeed(Speed s,int spd)
    {
		try {
        if(spd<30 || spd >90)
        {
        	throw new SpeedInvalidException("SpeedInvalidException");
            
            
           
            
        }
        else{
            s.speed="Valid Speed";
        }
		}catch(Exception e) {
			s.speed="Invalid Speed";
			System.out.println(e.getMessage());
		}
        
        return s.speed ;
    }
}