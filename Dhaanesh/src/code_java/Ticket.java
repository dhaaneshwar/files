package code_java;

class Ticket extends Person{
    //private int passengerCount;
    private float price;
    private float totalAmount=0;
	private float discount=0;
    private int num;
    

	Ticket(String name,Character gender,int age,float price,int num){
        super.gender=gender;
        super.age=age;
        this.price=price;
        this.num=num;
        if(gender=='F' ){
        discount=(float) ((0.1*price));
        }
        if(age<16){
        	discount=(float)((0.5*price));
        }
        if(age>64) {
        	discount=(float)((0.25*price));
        }
        totalAmount+=price-discount;
    }
	
	public float getTotalAmount() {
		return totalAmount;
	}


	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}
    
	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	void display() {
		System.out.println("Ticket Details are :");
		System.out.println("Number of Passengers: "+num);
		System.out.println("Price of a ticket: "+price);
		System.out.println("Total amount :"+totalAmount);
		System.out.println("Total Amount :"+((float)price-discount));
	}
}