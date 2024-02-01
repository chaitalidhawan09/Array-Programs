import java.io.FileInputStream;
import java.io.IOException;

public class BufferedReader
{

	public BufferedReader() 
	{
		
	}

	public static void main(String[] args) 
	{
		String filePath = "example.txt";
        int chunkSize = 1024;

        try (FileInputStream fileInputStream = new FileInputStream(filePath))
        {
            byte[] buffer = new byte[chunkSize];
            int bytesRead;

            while ((bytesRead = fileInputStream.read(buffer)) != -1)
            {
                processChunk(buffer, bytesRead);
            }
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
		   
	}
	}  
	 private static void processChunk(byte[] buffer, int bytesRead)
	 {
	        // This is where you can do something with the chunk of data
	        // For example, print it or perform some processing
	        System.out.write(buffer, 0, bytesRead);
	    }

}
