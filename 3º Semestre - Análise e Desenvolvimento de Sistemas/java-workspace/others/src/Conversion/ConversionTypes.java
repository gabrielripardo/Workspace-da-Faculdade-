package Conversion;

public class ConversionTypes {

	public static void main(String[] args){
		String sn1 = "4";
		String sn2 = "6";
		String sfn1 = "2.5";
		String sfn2 = "2.6";
		double dn1 = 32.12;
		double dn2 = 43.322;		
		
		//Conversão de dados por meio de objetos
		Integer obj1 = new Integer(sn1);
		int n1 = obj1.intValue();
		
		Integer obj2 = new Integer(sn2);
		int n2 = obj2.intValue();
		
		int opr = n1 + n2;
		System.out.println(opr);
		
		Double objD1 = new Double(sfn1);
		double nd1 = objD1.doubleValue();
		
		Double objD2 = new Double(sfn2);
		double nd2 = objD2.doubleValue();
		
		double oprD = nd1 + nd2;
		System.out.println(oprD);
		
		Float objF1 = new Float(sfn1);
		float nf1 = objF1.floatValue();
		
		Float objF2 = new Float(sfn2);
		float nf2 = objF2.floatValue();
		
		float oprF = nf1 + nf2;
		System.out.println(oprF);
		
		//Conversão estática
		String objS1 = Double.toString(dn1);
		String objS2 = Double.toString(dn2);
		
		String oprS = objS1 + objS2;
		System.out.println(oprS);
		
		double objn1 = Double.parseDouble(sfn1);
		double objn2 = Double.parseDouble(sfn2);
		
		double somaD = objn1 + objn2;
		System.out.println(somaD);
		
		long objLong1 = Long.parseLong(sn1);
		long objLong2 = Long.parseLong(sn2);
		
		long somaL = objLong1 + objLong2;
		System.out.print(somaL);
	}
}