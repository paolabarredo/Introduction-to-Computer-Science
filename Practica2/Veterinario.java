/**
*Practica 2 del curso de ICC.
 *@author -Paola Barredo-
 *@version -Version 1-
*/
public class Veterinario{
	public String amigo1;
	public String amigo2;
	public String amigo1a;
	public String amigo2a;

	public Veterinario (String amigo1,String amigo2,String amigo1a,String amigo2a){
		this.amigo1=amigo1;
		this.amigo2=amigo2;
		this.amigo1a=amigo1a;
		this.amigo2a=amigo2a;
	}

	public String getamigo1 (){
  		return this.amigo1;
	}

	public void setamigo1 (String amigo1){
  		this.amigo1=amigo1;
	}

	public String getamigo2 (){
  		return this.amigo2;
	}

	public void setamigo2 (String amigo2){
  		this.amigo2=amigo2;
	}


	public String getamigo1a (){
  		return this.amigo1a;
	}

	public void setamigo1a (String amigo1a){
  		this.amigo1a=amigo1a;
	}

	public String getamigo2a (){
  		return this.amigo2a;
	}

	public void setamigo2a (String amigo2a){
  		this.amigo2a=amigo2a;
	}



	public void hacerAmigos (Veterinario x){
  		x.amigo1=this.amigo1a;
	}

	public void deshacerAmigos (Veterinario x){
  		x.amigo2=this.amigo2a;
	}

	public void imprimirInfo(){
		System.out.println(this.amigo1+" es mejor amigo(a) de "+this.amigo2); //+"\nY "+this.amigo3+" no es amigo(a) de "+this.amigo4);
	}
	

  	public static void main (String[] args){
  		Veterinario a=new Veterinario("A","B","C","D");
  		Veterinario b=new Veterinario("E","F","G","H");
  		Veterinario c=new Veterinario("I","J","K","L");
  		
  		a.imprimirInfo();
    	b.imprimirInfo();
    	c.imprimirInfo();
    	
    	a.hacerAmigos(a);
    	a.deshacerAmigos(a);
    	
    	b.hacerAmigos(b);
    	b.deshacerAmigos(b);


    	c.hacerAmigos(c);
    	c.deshacerAmigos(c);
   

    	a.imprimirInfo();
    	b.imprimirInfo();
    	c.imprimirInfo();
    }
} 