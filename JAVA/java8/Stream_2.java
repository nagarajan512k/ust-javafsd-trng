package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
	int id;
	String name;
	float price;
	public Product(int id,String name,float price) {
		this.id=id;
		this.name=name;
		this.price=price;
		
	}
}

public class Stream_2 {
	
	public static void main(String[] args) {


		List<Product> productList=new ArrayList<Product>();
		//Adding products
		productList.add(new Product(1,"HP Laptop",25000f));
		productList.add(new Product(2,"Dell Laptop",30000f));
		productList.add(new Product(1,"Lenovo Laptop",25000f));
		productList.add(new Product(1,"Sony Laptop",25000f));
		productList.add(new Product(1,"Apple Laptop",25000f));
		List<Float> productPriceList2=productList.stream().filter(p->p.price>3000)  //filtering data
				.map(p->p.price)    //fetching price
				.collect(Collectors.toList());  //collecting as list
		System.out.println(productPriceList2);
				
		
		
	}

}
