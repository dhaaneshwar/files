package Training;

public class Validator {
	
	public String validateCoupon(Product p) {
		
		if(p.getCoupon().contains("-")) {
			
			String[] c=p.getCoupon().split("-");
			int discount=Integer.valueOf(c[1]);
			
			
			if(discount<10 || discount>25) {
				
				try {
					throw new InvalidCouponException("Invalid coupon");
				} 
				catch(InvalidCouponException e) {
//					System.out.println(e);
					return e.getMessage();
					
				}
			}
			
			if(p.getName()=="IPhone" && c[0].equals("IPhone")) {
				return "valid coupon";
			}else {
				try {
					throw new InvalidCouponException("Invalid coupon");
				} 
				catch(InvalidCouponException e) {
//					System.out.println(e);
					return e.getMessage();
					
				}
			}
		}else {
			try {
				throw new InvalidCouponException("Invalid coupon");
			} 
			catch(InvalidCouponException e) {
//				System.out.println(e);
				return e.getMessage();
				
			}
			
		}
//		return test;
		
	}
	
	public double netPrice(Product p) {
		String s=validateCoupon(p);
		
		if(s.equals("valid coupon")) {
			String[] c=p.getCoupon().split("-");
			double price=p.getPrice();
			int discount=Integer.valueOf(c[1]);
			double discountPrice=(price*discount)/100;
			
			return price-discountPrice;
			
		}else {
			return p.getPrice();
		}
	}

}
