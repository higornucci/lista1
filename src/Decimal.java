public class Decimal {
    public String binario(int numero) {
		int d = numero;
		StringBuffer binario = new StringBuffer();
		while (d > 0) {
			int b = d % 2;
			binario.append(b);
			d = d >> 1; 
		}
		return binario.reverse().toString();
	}

    public String binarioFacil(int decimal) {
        return Integer.toBinaryString(decimal);
    }
}