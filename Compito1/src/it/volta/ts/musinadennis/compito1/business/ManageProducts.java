package it.volta.ts.musinadennis.compito1.business;

import java.util.List;

import it.volta.ts.musinadennis.compito1.bean.Product;

public class ManageProducts
{
	private Product[] products;
	private int cont = 0;
	
	public void addAllProducts(String[] array)
	{
		products = new Product[array.length];
		for(int i = 0; i < array.length; i++)
		{
			addProduct(array[i]);
		}
	}
	
	public void addProduct(String product)
	{
		String name = product.substring(0, product.indexOf(','));
		float price = Float.parseFloat(product.substring(product.indexOf(',')+1, product.indexOf('(')).trim());
		float calorie = Float.parseFloat(product.substring(product.indexOf('(')+1, product.indexOf("kcal")).trim().replace(',', '.'));
		String category = product.substring(product.lastIndexOf(',')+1).trim();
		
		products[cont++] = new Product(name, price, calorie, category);
	}
	
	public String printAll()
	{
		String ris = "";
		
		for(int i = 0; i < cont; i++)
		{
			ris += products[i].toString() + "\n";
		}
		
		return ris;
	}
}
