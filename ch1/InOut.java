import java.io.*;

class InOut
{
	public static String getString() throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}

	public int getInt() throws IOException
	{
		String s = getString();
		return Integer.parseInt(s);
	}

	public double getDouble() throws IOException
	{
		String s = getString();
		Double aDub = Double.valueOf(s);
		return aDub.doubleValue();
	}

}