package view;

public class Print {

	public static void main(String[] args) {
		
		byte entero;
		
		entero = 12;
		
		System.out.println("esto es para ver que nos devuelve el byte entero :" +entero);
		
		byte entero2 = 13;
				
				//estas son las dos formas de definir una variable
		
		System.out.println("La segunda variable entera definida es " + entero2);
		
		/*esta es la forma en la wue imprimimos en pantalla "entero2" y nos
		 * damos cuenta que como es una variable no la encerramos dentro de comilla pero si es 
		 * necesario ponerle un mas por delante
		 */
		
		short NumEntero = 12345; 
		
		System.out.println("La segunda variable definida entera es " + NumEntero);
		
		// short es u=otro tipo de variable con una capasidad de bits mayor
		
		 int enteroInt = 12344556;
		 
		 System.out.println("La siguiente  variable definida entera es " + enteroInt);
		 
		/* int es el tipo de variable mas usado dado que el rango de bits que este 
		 * puede ocupar es mas que suficiente para caulquier numero
		 */
		 
		 long enteroLong = 123445565;
		 
		 System.out.println("La siguiente variable definida entera es: " + enteroLong);
		 
		 //por ultimo long es la variable con mayor capacidad 
		 
		 float decimalf = 3.45f;
		 
		 System.out.println("La siguiente variable definida decimal es: " + decimalf);
		 
		 //float es un tipo de variable decimal pero junto al numero debe ir una f para que este sea reconocido
		 
		 double decimal = 12.56;
		 
		 System.out.println("La siguiente variable definida decimal es: " + decimal);
		 
		 //double es la variable decimal preferida por que no necesita una f y tiene mas bits
		 
		 //
		 
		 // esta variable a continuacion es para caracteres
		 
		  char caracter = 'a';
		  System.out.println("La siguiente variable definida caracter es: " + caracter);
		  
		  //es para imprimir en pantalla caracteres
		  
		  boolean decision = true;
		  System.out.println("La decicion es: " + decision);
		  
		  //es para imprimir en pantalla si la variable es verdadera o falsa 
		  
		  System.out.println();//esto solo es para hacer un salto de linea
		  
		  /*
		   * 
		   * ahora veremos tipos de datos no primitivos 
		   * 
		   * 
		   */
		  
		  Integer numero = null;
		  
		  
		  System.out.println("El numero es :" +numero); 
		   
		  
		  
		  
		  
		  
		  
		  
		 
	}

}
