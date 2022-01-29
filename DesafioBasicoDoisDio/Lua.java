package DesafioBasicoDoisDio;

import java.util.Scanner;

/*Jade ganhou de presente de aniversário um telescópio e ficou muito feliz, pois adora olhar a lua à noite. Ela sempre foi uma estudante muito boa, e só analizando a lua por duas noites seguidas, já consegue identificar as mudanças que ocorreram na iluminação e o percentual aproximado da lua que está iluminada.
Você, que é amigo da Jade e estuda Computação, resolveu fazer um pequeno programa que, baseado nesta avaliação que ela fez nas duas últimas noites, informa a fase na qual a lua se encontra. Se a porção visível da lua no momento estiver entre 0 e 2%, por exemplo, é lua nova, se for entre 3 e 96% é lua crescente, se for entre 97 e 100% é lua cheia e se for entre 96 e 3% (diminuindo) é lua minguante.
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
