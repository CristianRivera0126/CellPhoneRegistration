import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		
		Itemize item1=new Itemize();
		item1.storage=128;
		item1.camf=19.3f;
		item1.camt=30.6f;
		
		Itemize item2=new Itemize();
		item2.storage=32;
		item2.camf=11.5f;
		item2.camt=20.8f;
		
		Itemize item3=new Itemize();
		item3.storage=64;
		item3.camf=13.4f;
		item3.camt=23.5f;
		
		Phone myphone1=new Phone();
		myphone1.item=item1;
		myphone1.marca="Apple";
		myphone1.modelo="Iphone";
		myphone1.color="Dorado";
		
		Phone myphone2=new Phone();
		myphone2.item=item2;
		myphone2.marca="Samsung";
		myphone2.modelo="Galaxy";
		myphone2.color="Negro";
		
		Phone myphone3=new Phone();
		myphone3.item=item3;
		myphone3.marca="Huawei";
		myphone3.modelo="Mate";
		myphone3.color="Azul";
		
		item1.celulares.add(myphone1);
		item1.celulares.add(myphone2);
		item1.celulares.add(myphone3);
		
		for(Phone g:item1.celulares) {
		   System.out.println(g.saludo());	
		}
			
	}

}

class Phone{
	Itemize item;
	String marca;
	String modelo;
	String color;
	
	public String saludo(){
		String mygreet="Hola soy un celucar marca: "+this.marca+", modelo: "+this.modelo+", soy de color: "+this.color+", mi almacenamiento es de: "+this.item.storage+"GB"+", mi camara frontal es de: "+this.item.camf+"MP"+" y mi camara trasera es de: "+this.item.camt+"MP";
		return mygreet;
	}
	
}

class Itemize{
	int storage;
	float camf;
	float camt;
	List<Phone> celulares;
	
	public Itemize() {
		this.celulares=new ArrayList<Phone>();
	}
}	
	
  
