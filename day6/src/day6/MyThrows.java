package day6;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.FileSystemNotFoundException;

class MyException {

	public void myNewException() throws FileNotFoundException
	{
		FileInputStream inputStream = new FileInputStream("c:\\file.txt");
	}
}

public class MyThrows 
{
	public static void main (String args)  {

		try
		{
		MyException exception=new MyException();
		
		exception.myNewException();
		}
		catch(FileNotFoundException e)
		{
			
		}
		catch(FileSystemNotFoundException e)
		{
			
		}
		catch(NullPointerException e)
		{
			
		}
		catch(Exception e)
		{
			
		}	
	}	
}