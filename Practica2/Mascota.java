/**
*Practica 2 del curso de ICC.
 *@author -Paola Barredo-
 *@version -Version 1-
*/
//Actividad 2
public class Mascota{

//Actividad 2.1
public String nombre;
private int edad;
private final String ESPECIE;
private static int numDeMasc=0;
private String adora;
private String recuerdos;

//Actividad 2.2
public Mascota (String nombre, int edad, String ESPECIE,String adora, String recuerdos){
  this.nombre=nombre;
  this.edad=edad;
  this.ESPECIE=ESPECIE;
  numDeMasc+=1;
  this.adora=adora;
  this.recuerdos=recuerdos;
 }

public Mascota (String ESPECIE){
  this.ESPECIE=ESPECIE;
  numDeMasc+=1;
}

public String getNombre (){
  return this.nombre;
}

public void setNombre (String nombre){
  this.nombre=nombre;
}

public int getEdad (){
  return this.edad;
}

public void setEdad (int edad){
  this.edad=edad;
}

public String getEspecie (){
  return this.ESPECIE;
}

public int getNumDeMasc (){
  return this.numDeMasc;
}


public String getAdora (){
  return this.adora;
}

public void setAdora (String adora){
  this.adora=adora;
}

public String getRecuerdos (){
  return this.recuerdos;
}

public void setRecuerdos (String recuerdos){
  this.recuerdos=recuerdos;
}


public void contarRecuerdos (Mascota x){
  x.recuerdos+=this.adora;
}

  @Override
  public String toString (){
    return "El nombre de tu mascota es "+this.nombre+" \nTiene "+this.edad+" año(s)"+"\nSu especie es "+this.ESPECIE+"\nLo que más adora es "+this.adora+"\nLo que recuerda es"+ this.recuerdos;
  }

  public static void main (String[] args){
    Mascota juan = new Mascota("Juan", 5 , "perro","que le rasquen la panza"," ");
    Mascota pedro=new Mascota("Pedro", 4 ,"gato","que le den leche"," ");
    Mascota luis=new Mascota ("Luis", 3, "conejo","que le den zanahoria"," ");
    Mascota pablo=new Mascota("Pablo", 2 ,"pony","que le cepillen la cola"," ");
    Mascota anita=new Mascota("Anita", 1 ,"iguana","que le pongan un foco calentador"," ");
    Mascota panchita=new Mascota("Panchita",8,"burra","que le den de comer pasto"," ");
    Mascota fifi=new Mascota("Fifi",5,"zorra","pelear con otras mascotas"," ");


    juan.contarRecuerdos(pedro);
    System.out.println(pedro.toString()+" a Juan\n");

    pedro.contarRecuerdos(luis);
    System.out.println(luis.toString()+" a Pedro\n");

    luis.contarRecuerdos(pablo);
    System.out.println(pablo.toString()+" a Luis\n");

    pablo.contarRecuerdos(anita);
    System.out.println(anita.toString()+" a Pablo\n");

    anita.contarRecuerdos(panchita);
    System.out.println(panchita.toString()+" a Anita\n");

    panchita.contarRecuerdos(juan);
    System.out.println(juan.toString()+" a Panchita\n");

    panchita.contarRecuerdos(fifi);
    System.out.println(fifi.toString()+ " a Panchita\n");

    System.out.println("El número de mascotas es: "+numDeMasc);
  }

}

