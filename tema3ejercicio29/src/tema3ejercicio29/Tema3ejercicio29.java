package tema3ejercicio29;

import java.util.Scanner;

public class Tema3ejercicio29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Github primera prueba
		Scanner sc=new Scanner(System.in);
		
		double peso,altura,imc;
		
		System.out.print("Dime tu altura :");
		altura=sc.nextDouble();
	
		System.out.print("Dime tu peso :");
		peso=sc.nextDouble();
		
		imc=peso/(altura*altura);
		
		if(imc<18.5) {
			
			System.out.println("Bajo peso");
			
		    }else if  (imc<24.9) {
			
				
			System.out.println(" Normal ");
			
			
			} else if(imc<29.9)  {
				
				
			System.out.println(" Sobreopeso ");
					
			} else {
				
				
			System.out.println(" obesidad ");		
					
					
					
				}
				
				
				
				
			}
			
			
			
			
		
			
			
		
		
		
		
		
		
		
	}


