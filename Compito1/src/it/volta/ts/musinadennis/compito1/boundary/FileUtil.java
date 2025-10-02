package it.volta.ts.musinadennis.compito1.boundary;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileUtil
{
	public List<String> readFile(String fileName)
	{
		List<String> list = null;
		try {
			list = Files.readAllLines(Paths.get(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public String[] readFileToString(List<String> list)
	{
		int lenght;
		String[] array = new String[lenght = list.size()];
		
		if(list != null)
		{
			for(int i = 0; i < list.size(); i++)
			{
				array[i] = list.get(i);
			}
		}
		return array;
	}
}
