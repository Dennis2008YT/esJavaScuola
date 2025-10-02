package it.volta.ts.musinadennis.compito1.boundary;

import it.volta.ts.musinadennis.compito1.business.ManageProducts;

public class Console
{
	private FileUtil fileUtil;
	private ManageProducts manageProducts;
	private String fileName;
	private String[] array;
	
	public Console(String fileName)
	{
		fileUtil = new FileUtil();
		manageProducts = new ManageProducts();
		this.fileName = fileName;
	}
	public void excecute()
	{
		array = fileUtil.readFileToString(fileUtil.readFile(fileName));
		manageProducts.addAllProducts(array);
		System.out.println(manageProducts.printAll());
	}
}
