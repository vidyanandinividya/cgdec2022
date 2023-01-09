package session6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryWithResource {

	public static void main(String[] args) {
		
		try(Resource1 r1=new Resource1();
				Resource2 r2=new Resource2();
				Scanner sc=new Scanner(new File("newFile.txt")))
		{
			r1.doSomething();
			r2.doSomething();
			while(sc.hasNext())
			{
				System.out.println(sc.nextLine());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
		
		
		
		
		
		
		
		
		
		//Scanner sc=null;
		/*try(Scanner sc=new Scanner(new File("newFile.txt")))
		{
			//sc=new Scanner(new File("newFile.txt"));
			while(sc.hasNext())
			{
				System.out.println(sc.nextLine());
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e.getMessage());
		}*/
		/*finally
		{
			if(sc!=null)
			{
				try
				{
				sc.close();
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
			}
		}*/

	}

}
