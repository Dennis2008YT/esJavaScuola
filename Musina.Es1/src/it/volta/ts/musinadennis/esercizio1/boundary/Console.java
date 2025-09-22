package it.volta.ts.musinadennis.esercizio1.boundary;

import java.util.List;

import it.volta.ts.musinadennis.esercizio1.util.FIleUtil;

public class Console
{
	private String filename;
	
	public Console(String filename)
	{
		this.filename = filename;
	}
	
	public void excecute(String[] args)
	{
		System.out.println("ciclo while: ");
		int i = 0;
		while(i < args.length) 
			System.out.println(args[i++]);
		
		System.out.println("\nciclo for:");
		for(i = 0; i < args.length; i++) 
			System.out.println(args[i]);
		
		System.out.println("\nciclo foreach:");
		for(String arg: args) 
			System.out.println(arg);
		
		List<String> read = FIleUtil.readTxtFile(filename);
		System.out.println(read);
	}
}
