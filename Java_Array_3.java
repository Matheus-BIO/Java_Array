import java.util.Scanner;

public class Java_Array_3 {

	public static void main(String[] args) {
	
		
		
		
		
		double [] salario= new double[10];
		
		
	Scanner leitor = new Scanner (System.in);
		
		double [] vetor = new double [10];
		
		System.out.println("Digite 10 valores de sal�rio:");
		
		vetor[1]= leitor.nextDouble();
		vetor[2]= leitor.nextDouble();
		vetor[3]= leitor.nextDouble();
		vetor[4]= leitor.nextDouble();
		vetor[5]= leitor.nextDouble();
		vetor[6]= leitor.nextDouble();
		vetor[7]= leitor.nextDouble();
		vetor[8]= leitor.nextDouble();
		vetor[9]= leitor.nextDouble();
		vetor[10]= leitor.nextDouble();
		
		int maior = 0;
		
		for (int i = 1; i < vetor.length; i++) {
			
			if(vetor[i]> vetor[maior]) {
				
				maior=i;
			}
			
		}
		
		
		System.out.println(" O maior sal�rio � o n�mero "+ maior+".");
		

	}

}