import java.io.*;
public class EVM {
public static void main(String[] args) throws InterruptedException  {

Demo demo=new Demo();
while(true)
{
Thread t=new Thread(demo);
t.start();
t.join();
}
	
	
}

}


class Demo implements Runnable
{
	@Override
		public void run() {
		File folder=new File("F:/EPM/current");
		File[] file=folder.listFiles();
		for(File f:file)
		{
		
			
			try {
			FileReader fr = new FileReader(f);
			BufferedReader br=new BufferedReader(fr);
			String str = br.readLine();
			while(str!=null)
			{
				System.out.println(str);	
			str=br.readLine();	
			}
			br.close();
			System.out.println();
			}
			catch(Exception e)
			{
				System.out.println(e);
				e.printStackTrace();
			
			}
			File move=new File("F:/EPM/used/"+f.getName());
			f.renameTo(move);
	}
		if(file.length==0)
		{
			try {
				System.out.println("sleeping");
				Thread.sleep(30000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("woke up");
		}
		
}
			
}

