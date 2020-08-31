package com.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.pojo.Product;

public class ProductIOImpl implements ProductIO {

	@Override
	public Product getProduct() {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Product product = null;
		try {
			product = new Product();
			System.out.println("Enter product id");
			product.setpID(Integer.parseInt(br.readLine()));
			System.out.println("Enter product name");
			product.setpName(br.readLine());
			System.out.println("Enter product price");
			product.setPrice(Double.parseDouble(br.readLine()));
			System.out.println("Enter product quantity");
			product.setQuantity(Integer.parseInt(br.readLine()));
			System.out.println("Enter product category");
			product.setCategory(br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return product;
	}

	@Override
	public void displayProduct(Product product) {
		// TODO Auto-generated method stub

	}

}
