package prodact;

public class ProductApplication {
	public static void main(String[] args) {
		
		product pc = new product(235, "HP", (float) 96.3);
        
		pc.print();
		
		float pric = pc.getPrice();
		
		System.out.println(pric);
		
		pc.updatePrice(10);
		
		pric = pc.getPrice();
		
		System.out.println(pric);
		

    }

}
