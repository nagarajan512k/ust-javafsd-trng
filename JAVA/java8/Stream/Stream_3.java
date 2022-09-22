package stream;

import java.util.ArrayList;
import java.util.List;

class Product1{
	int id;
	String name;
	float price;
	public Product1(int id,String name,float price) {
		this.id=id;
		this.name=name;
		this.price=price;
	}
}
public class Stream_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product1> productList=new ArrayList<Product1>();
		//Adding products
		productList.add(new Product1(1,"HP Laptop",25000f));
		productList.add(new Product1(2,"Dell Laptop",30000f));
		productList.add(new Product1(1,"Lenovo Laptop",25000f));
		productList.add(new Product1(1,"Sony Laptop",25000f));
		productList.add(new Product1(1,"Apple Laptop",25000f));
		
		Float totalPrice=productList.stream().map(product->product.price).reduce(0.0f,(sum,price)->sum+price);  //accumulating price
		System.out.println(totalPrice);
		
		//More precise code
		float totalPrice2=productList.stream().map(product->product.price).reduce(0.0f,Float::sum);  //accumulating price, by referring method of float class
		System.out.println(totalPrice2);
		
		

	}

}
