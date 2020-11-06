import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		
		boolean salir = false;
		Scanner scan = new Scanner(System.in);
		
		while (!salir) {
		System.out.println (" Escoja una de las opciones");
		System.out.println("1- Evaluar si el numero es perfecto");
		System.out.println("2- Evalua si el numero es mayor igual o menor que el anterior");
		System.out.println("3- Calcula la desviacion estandar de 4 numeros");
		System.out.println("4- Salir");
				
		int menu;
		int numero;
		menu = scan.nextInt();
		switch(menu) {
		case 1:
			System.out.println("Introduzca el número");
			numero = scan.nextInt();
	        int sumas=0;
	        for(int i = 1;i < numero - 1;i++){
	                if(numero % i == 0)
	                    sumas += i;
	                }
	        if (sumas == numero) {
	            System.out.println("El numero "+numero+" es un numero perfecto");
	        } else {
	            System.out.println("El numero "+numero+" no es un numero perfecto");
	           break;
	        }
		case 2 :  
	    
		int i = 0;
		int mayor = 0; 
		System.out.println("introduzca un número entero positivo:" + "(Si quiere salir pulse 0)");
		mayor = scan.nextInt();
		if (mayor != 0) {
			do {
					do { 
						System.out.println("Introduzca otro número: ");
						i = scan.nextInt();
						if (i < 0) {
							System.out.println("El número " + i + " Es incorrecto");
						}
					} while(i < 0);
					if(i > 0) {
						if(i > mayor) {
							System.out.println(" El número " + i + " es mayor que el anterior");
							
						} 
						
						if(i == mayor) {
							System.out.println(" El número " + i + " es igual que el anterior");
						} 
						if(i < mayor) {
							System.out.println(" El número " + i + " es menor que el anterior");
						
						} 
						mayor = i;			
					}
			
		} while (i != 0);
		}
		break;
		case 3:
			  int valor [] = new int[4];
			  int sumatoria = 0;
			  float media = 0;
			  double varianza = 0.0;
			  double desviacion= 0.0; 
			  System.out .println("Ingrese el valor de 4 numeros"+" como muestra");
			  for(int a = 0; a < 4; a++ ){
				   
				   System.out.print("Ingrese el valor " + (a + 1) + ":");
				   valor[a] = scan.nextInt();
				   sumatoria = sumatoria + valor[a];
		}
			  for(int a = 0 ; a < 4; a++){
				   double rango;
				   rango = Math.pow(valor[a] - media, 2f);
				   varianza = varianza + rango;
				  }
			  varianza = varianza / 4f;
			  desviacion = Math.sqrt(varianza);
			  System.out.println("Desvianción Estándar: " + desviacion);
			  break;
		case 4:
			salir = true;
			System.out.println("Programa finalizado!");
			break;
		default:
			System.out.println("Solo numeros entre 1 y 4");
		 }
				
		}
		scan.close();
		
		
	}
	

	
	}

	

