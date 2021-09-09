package java_threads_one;

import java.util.ArrayList;
import java.util.List;

public class InventoryManager {

	List<Product> soldProductList=new ArrayList<Product>();
	
	List<Product> purchasedProductList=new ArrayList<Product>();
	
	
	public void populateSoldProducts() {
		for(int i=0;i<1000;i++) {
			Product prod=new Product(i,"test_product_"+i);
			soldProductList.add(prod);
			System.out.println("ADDED : "+prod);
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void displaySoldProducts() {
		for(Product p:soldProductList) {
			System.out.println("SOLD : "+p);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
