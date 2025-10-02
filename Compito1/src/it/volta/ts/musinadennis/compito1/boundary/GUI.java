package it.volta.ts.musinadennis.compito1.boundary;

import java.awt.BorderLayout;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import it.volta.ts.musinadennis.compito1.business.ManageProducts;

public class GUI extends Frame
{
	private JFrame frame;
	private FileUtil fileUtil;
	private ManageProducts manageProducts;
	private String fileName;
	private String[] array;
	
	public GUI(String fileName)
	{
		manageProducts = new ManageProducts();
		frame = new JFrame("Hello World!");
		fileUtil = new FileUtil();
		manageProducts = new ManageProducts();
		this.fileName = fileName;
	}
	
	public void excecute()
	{
		frame.setSize(480, 320);
		frame.setVisible(true);
		
		JLabel label1 = new JLabel("Text");
		array = fileUtil.readFileToString(fileUtil.readFile(fileName));
		manageProducts.addAllProducts(array);
		label1.setText("<html>" + manageProducts.printAll().replaceAll("<","&lt;").replaceAll(">", "&gt;").replaceAll("\n", "<br/>") + "</html>");
		JScrollPane scroller = new JScrollPane(label1, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		frame.add(scroller);
		frame.add(label1);
	}
}
