package org.pankaj.fileHandle;
import java.io.*;
import java.util.*;
import org.pankaj.POJO.*;

public class ReadFolder {

	public List readfiles() throws IOException, InterruptedException
	{
		List list=new ArrayList();
		File folder=new File("F:/EPM/current");
		File[] fileArray=folder.listFiles();
		for(File file:fileArray)
		{
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			String line=br.readLine();
			while(line!=null)
			{
				System.out.println(line);
				String[] str=line.split(",");
				if(str[0].equalsIgnoreCase("Gsm"))
				{
					Gsm gsm=new Gsm(str[0],str[1],str[2],str[3],str[4]);
					list.add(gsm);
				}
				else if(str[0].equalsIgnoreCase("Gprs"))
					{
					Gprs gprs=new Gprs(str[0],str[1],str[2],str[3],str[4]);
					list.add(gprs);
					}
				else
				{
					Sms sms=new Sms(str[0],str[1],str[2],str[3],str[4]);
					list.add(sms);
				}
				
				line=br.readLine();
			}
			br.close();
			System.out.println("move");
			File move=new File("F:/EPM/used/"+file.getName());
			System.out.println(move);
			file.renameTo(move);
		}
		
		if(fileArray.length==0)
			Thread.sleep(20000);
		
		return list;
		
	}
	
}
