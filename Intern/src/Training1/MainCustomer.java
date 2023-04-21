package Training1;

public class MainCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer c = new Customer("Steve","9898111111","9898ve");
		
		Validator1 v = new Validator1();
		
		String CID = v.validateCId(c);
        String mob = v.validateMobileNo(c);
        
        System.out.println("CID= "+CID);
        System.out.println("mob= "+mob);


	}

}