package DesafioBasicoDoisDio;
import java.text.DecimalFormat;
import java.util.Scanner;

public class VolMel {
	
    public static void main(String[] args) {
    	Scanner leitor = new Scanner(System.in);
    	DecimalFormat df = new DecimalFormat("0.00");

    	while (leitor.hasNext()) {
    		double V = leitor.nextDouble();
    		double D = leitor.nextDouble();
    		double R = D / 2;
    		double area = 3.14 * D / 2.0 * D / 2.0;
    		double altura = V / area;
    		System.out.println("ALTURA = " + df.format(V / area));
    		System.out.println("AREA = " + df.format(area));
    	}
    	leitor.close();
    }
	
}