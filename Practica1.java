/**
*Practica 1 del curso de ICC.
 *@author -Paola Barredo-
 *@version -Version 1-
*/
public class Practica1 {
	public static void main(String [] args){

// Actividad 1
/*	Tipo que permite verificaciones. Valor true o false. */
boolean verdadero;
boolean falso;

/* Tipo que almacena un entero de 8 bits. Valor (-128,127) */
byte byte1;
byte byte2;

/* Tipo que almacena un entero de 16 bits. Valor (-32768,32767) */
short short1;
short short2;

/* Tipo que almacena un entero de 32 bits. Valor (-2147483648,2147483647) */
int int1;
int int2;

/* Tipo que almacena un entero de 64 bits. Valor (-9223372036854775808,9223372036854775807) */
long long1;
long long2;

/* Tipo que almacena un valor de punto flotante de precisión sencilla. 32 bits. Valor (1.40239846e-45,3.40282347e+38) */
float float1;
float float2;

/* Tipo que almacena un valor de punto flotante de doble precisión. 64 bits. Valor (4.9406564581246544e-324,1.7976931348623157e+308) */
double double1;
double double2;

/* Tipo que almacena valores no asignados de 16 bits de 0 a 65535.Representa caracteres Unicode. Valor ('\u0000','\uffff') */
char char1;
char char2;



// Actividad 2
verdadero=true;
falso=false;

byte1=-11;
byte2=120;

short1=-10000;
short2=27500;

int1=-150360;
int2=1234567;

long1=-98765432;
long2=123456789;

float1=.3f;
float2=-3.14f;

double1=-4.12344328750560237450234702456023745;
double2=3.123456789765432028407347502756374563;

char1='a';
char2='b';

// Actividad 3
/* Boolean toma valores de true o false */
boolean booleanTrue=true;

/*Byte toma valores entre -128 y 127 */ 
byte cientoVeintisiete=127;

/*Short toma valores entre -32768 y 32767 */
short treintaYDosMil=32000;

/*Int toma valores entre -2147483648 y 2147483647 */
int dosMilMillones=2000000000;

/*Char representa caracteres Unicode*/
char b='b';

/*Float toma valores entre 1.40239846e-45 y 3.40282347e+38 */
float unoPuntodosMil=1.2000f;
float unoPuntoDoscientosMilMillones=1.200000000000f;

// Actividad 4
double y=2;
double x=(y*y*y)*(y/((y*y)+1));
System.out.println(x);

double z=x*((x+30)/((y*y)+((x*x)/y)));
System.out.println(z);

boolean t=true;
boolean f=false;
boolean w=t&&f||t||t;
System.out.println(w);

boolean v=f||w&&w||f||!f;
System.out.println(v);

}
}