package it.volta.ts.musinadennis.compito1;

import it.volta.ts.musinadennis.compito1.boundary.Console;
import it.volta.ts.musinadennis.compito1.boundary.GUI;

public class Main
{

	public static void main(String[] args)
	{
		new GUI(args[0]).excecute();
		new Console(args[0]).excecute();
	}

}
