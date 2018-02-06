package labs.unit2;
public class Fahrenheit
{
	private double fahrenheit;

	public void setFahrenheit(double fahren)
	{
		fahrenheit = fahren;
	}

	public double getCelsius()
	{
		return ((double) 5/9) * (fahrenheit - 32);
	}

	public void print()
	{
		System.out.println(getCelsius());
	}
}