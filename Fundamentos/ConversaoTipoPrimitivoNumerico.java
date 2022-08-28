package Fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		double a = 1; // conversão implícita
		System.out.println(a);
		
		/*float b = 1.0F;*/
		
		float b = (float) 1.12345; // conversão explícita (CAST)
		System.out.println(b);
		
		int c = 4;
		byte d = (byte)c;
		System.out.println(d);
		
		double e = 1;
		int f = (int) e;
		
	}

}
