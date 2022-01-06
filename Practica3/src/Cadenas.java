import java.util.Scanner; 
public class Cadenas implements AnalizadorDeCadenas {

public int encuentraPosicion(String cadena, char c){
	String cadenaAux="";
	for (int i=0; i <cadena.length() ;i++)
	{	
		if (cadena.charAt(i)==c){
			return i;
		}
	} 
	return -1;
}

public boolean esNumero(String cadena){

	boolean x=true;
	for (int i=0; i < cadena.length() ;i++)
	{
		if	(cadena.charAt(i)!='0'&& cadena.charAt(i)!='1'&& cadena.charAt(i)!='2'&& cadena.charAt(i)!='3'&& cadena.charAt(i)!='4'&&
		 cadena.charAt(i)!='5'&& cadena.charAt(i)!='6'&& cadena.charAt(i)!='7' && cadena.charAt(i)!='8' && cadena.charAt(i)!='9')
			x=false;
	}return x;
}

public String reemplazaCaracter(String cadena, char reemplazado, char reemplazador){
	String aux="";
	for (int i=0; i <cadena.length() ;i++)
	{
		if (cadena.charAt(i)==reemplazado){
			aux+=reemplazador;
		}
		else aux+=cadena.charAt(i);
	} 
	return aux;
}

public int cuentaCaracter(String cadena, char c){
	int x=0;
	for (int i=0; i < cadena.length() ;i++)
	{
		if(cadena.charAt(i)==c)
			{x=x+1;}
	}return x;
}

public boolean esPalindromo(String cadena){
int a = 0;
int b = cadena.length()-1;
boolean c = false;
while ((a<b) && (!c)){
	if (cadena.toLowerCase().charAt(a)==cadena.toLowerCase().charAt(b)){				
		a++;
		b--;
	} else {
		c = true;
	}

}return !c;
}

public boolean contiene(String cadena, String buscada){
boolean x=false;
String suma=cadena+buscada;
	for (int j=cadena.length(); j < suma.length() ;j++)
	{for (int i=0; i < cadena.length() ;i++){
		if (suma.charAt(i)==suma.charAt(j)){
			x=true;
		}
	}return x;
}return x;
}

public boolean sonIguales(String cadena1, String cadena2){
int minimo = cadena1.length()<cadena2.length() ?
	    cadena1.length() : cadena2.length();
boolean y=true;	    
for (int i=0; i < minimo ;i++){
	if (cadena1.charAt(i)!=cadena2.charAt(i)|| cadena1.length()!=cadena2.length())
		y=false;
} return y;
} 

 public String daSubcadena(String cadena, int inicio, int fin){
 	String subcadena="";
 	for (int i=inicio; i < fin+1 ;i++){
 		subcadena+=cadena.charAt(i);
 	}return subcadena;
 }

public static void main (String[] args)
	{
	Cadenas a=new Cadenas ();
	System.out.println("Holilililili amiga");
	System.out.println('a');
	System.out.println(a.encuentraPosicion("Holilililili amiga", 'a')); //13
	System.out.println("\n");

	System.out.println("Palabra");
	System.out.println('a');
	System.out.println('i');
	System.out.println(a.reemplazaCaracter("Palabra",'a','i')); //Pilibri
	System.out.println("\n");

	System.out.println("9873");
	System.out.println(a.esNumero("9873")); //true
	System.out.println("\n");

	System.out.println("Holis amiguis");
	System.out.println('i');
	System.out.println(a.cuentaCaracter("Holis amiguis",'i'));//3
	System.out.println("\n");

	System.out.println("Anana");
	System.out.println(a.esPalindromo("Anana")); //true
	System.out.println("\n");

	System.out.println("Hola");
	System.out.println("o");
	System.out.println(a.contiene("Hola","o")); //true
	System.out.println("\n");

	System.out.println("Hola");
	System.out.println("Holi");
	System.out.println(a.sonIguales("Hola","Holi"));//false
	System.out.println("\n");

	System.out.println("Paola");
	System.out.println(2);
	System.out.println(4);
	System.out.println(a.daSubcadena("Paola",2,4));
	System.out.println("\n");
	}
}	