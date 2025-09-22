package it.volta.ts.musinadennis.esercizio1.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FIleUtil {
	public static List<String> readTxtFile(String filename)
	{
		List<String> ris = null;
		
		Path filepath = Paths.get(filename);
		
		try {
			ris = Files.readAllLines(filepath);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return ris;
	}
	
	public static String[] readTxtFileToString(String filename)
	{
		List<String> list = readTxtFile(filename);
		String[] ris = null;
		if(list!=null)
		{
			ris = new String[list.size()];
			for(int i = 0; i < list.size(); i++)
			{
				ris[i] = list.get(i);
			}
		}
		return null;
	}
}
