package it.volta.ts.musinadennis.compito1.bean;

public class Product
{
	private String name, category;
	private float price, calorie;
	
	public Product(String name, float price, float calorie, String category)
	{
		this.name = name;
		this.calorie = calorie;
		this.category = category;
		this.price = price;
	}
	
	public String getNome() {
		return name;
	}
	public void setNome(String nome) {
		this.name = nome;
	}
	public String getCategoria() {
		return category;
	}
	public void setCategoria(String categoria) {
		this.category = categoria;
	}
	public float getPrezzo() {
		return price;
	}
	public void setPrezzo(float prezzo) {
		this.price = prezzo;
	}
	public float getCalorie() {
		return calorie;
	}
	public void setCalorie(float calorie) {
		this.calorie = calorie;
	}
	@Override
	public String toString() {
		return "Prodotto [nome=" + name + ", categoria=" + category + ", prezzo=" + price + ", calorie=" + calorie
				+ "]";
	}
}
