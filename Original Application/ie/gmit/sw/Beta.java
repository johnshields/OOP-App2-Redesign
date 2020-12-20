package ie.gmit.sw;

public class Beta {
	public byte beta(byte b)  {
		int i = b;
		return (byte) (i ^ 0xFFFFFFFF);
	}
}