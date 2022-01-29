package DesafioBasicoDoisDio;

import java.util.Scanner;

/*Jade ganhou de presente de anivers�rio um telesc�pio e ficou muito feliz, pois adora olhar a lua � noite. Ela sempre foi uma estudante muito boa, e s� analizando a lua por duas noites seguidas, j� consegue identificar as mudan�as que ocorreram na ilumina��o e o percentual aproximado da lua que est� iluminada.
Voc�, que � amigo da Jade e estuda Computa��o, resolveu fazer um pequeno programa que, baseado nesta avalia��o que ela fez nas duas �ltimas noites, informa a fase na qual a lua se encontra. Se a por��o vis�vel da lua no momento estiver entre 0 e 2%, por exemplo, � lua nova, se for entre 3 e 96% � lua crescente, se for entre 97 e 100% � lua cheia e se for entre 96 e 3% (diminuindo) � lua minguante.
*/


public class Lua {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  int inicio = sc.nextInt();
		  int fim = sc.nextInt();
		    
		        if (fim >= 97 && fim <= 100) {
		            System.out.println("cheia");
		        }
		        else if (fim >= 0 && fim <= 2) {
		            System.out.println("nova");
		            }
		        else if (fim >= 3 && fim <= 96 && fim > inicio) {
		            System.out.println("crescente");
		            }
		        else {
		            System.out.println("minguante");
		        }
		    
	sc.close();
	}

}
