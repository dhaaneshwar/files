package Question;

public class ShoppingWebsite {
	
	public String purchaseItem(Item i,Customer c) throws ItemOutOfStockException,InsufficientBalanceException {
		if(!i.isInStock()) {
			throw new ItemOutOfStockException("Item is out of stock");
		}
		if(i.getPrice()>c.getWalletBalance()) {
			throw new InsufficientBalanceException("Customer wallet balance is insufficient");
		}
		return "Order Successful";
	}

}
