import java.util.Date;

public class PruebaFactura {

	public static void main(String[] args) {
		
		Factura f1= new Factura (00001,new Date());
		f1.agregarItem(1, 3);
		
		Stock prod1 = new Stock(1,"Tornillo",50.5,30);
		//prod1. quiero agregar a lista
		Stock prod2 = new Stock(2,"Tuerca",25,100);
		Stock prod3 = new Stock(3,"Martillo",280,25);
		Stock prod4 = new Stock(4,"Clavos",29.5,300);
		Stock prod5 = new Stock(5,"Caño Pvc",200,2);
		
	}

}
