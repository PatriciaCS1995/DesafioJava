package DesafioBasicoDoisDio;
import java.text.DecimalFormat;
import java.util.Scanner;

/*Seu Júlio é proprietário de um grande apiário situado no interior da Paraíba.
Todo ano, semestralmente, seu Júlio coleta o mel produzido pelas abelhas da sua propriedade
e armazena-o em um recipiente de formato CILÍNDRICO para que facilite o transporte do mel para
os estabelecimentos que encomendam esse produto natural para a comercialização.
Certa vez seu Júlio percebeu que devido a um crescimento na produção do mel, 
em relação ao semestre anterior, o recipiente que possuia não suportaria o volume de mel produzido por suas abelhas.
Seu Júlio precisa agora que você faça um programa que informado
o volume de mel em cm3 e o diâmetro da parte interna do recipiente em cm, calcule e mostre:

- Qual deve ser a altura(em cm) da parte interna do recipiente;

- A área(em cm2) da boca(entrada) do recipiente.

Obs.: Considere π = 3.14
*/

public class VolMel {
	
    public static void main(String[] args) {
	    
    	Scanner leitor = new Scanner(System.in);
    	DecimalFormat df = new DecimalFormat("0.00");

    	while (leitor.hasNext()) 
	{
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
