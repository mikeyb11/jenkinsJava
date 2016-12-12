package javaMathsLib;

public class mathsLib 
{

	public mathsLib()
	{
	}
	
	public float pythagorasFindC(float a, float b)
	{
		return (float) Math.sqrt(((a *= a) + (b *= b)));
	}
	
	public float radiansToDegrees(float rad)
	{
		return (float) (rad * (360 / Math.PI));
	}
	
	public float degreetoRadians(float deg)
	{
		return (float)(deg * (Math.PI / 360));
	}
	
	public float areaOfCircle(float radius)
	{
		return (float) (Math.PI * (radius *= radius));
	}
	
	public float circumferenceOfCircle(float radius)
	{
		return (float) (2 * Math.PI * radius);
	}
	
	public float radiusOfCircle(float circumference)
	{
		return (float) (circumference / (2 * Math.PI));
	}
}
