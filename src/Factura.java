import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Factura {
	private int numero;
	private Date fechaVenta;
	private List<Item> items;
	private Stock articulo;
	
	public Factura(int numero, Date fechaVenta) {
		super();
		this.numero = numero;
		this.fechaVenta = fechaVenta;
		this.items = new ArrayList<Item>();
	}

	public void agregarItem(int codigoArticulo, int cantidadVendida) {
		try {
			if(articulo.descontaralStock(codigoArticulo, cantidadVendida) ) {
				Item i = new Item(codigoArticulo, cantidadVendida);
				items.add(i);
			}
		}catch(NullPointerException e) {
			System.out.println("No hay cantidad disponible del codigo: "+codigoArticulo);		
		}
	}


	@Override
	public String toString() {
		return "Factura [numero=" + numero + ", fechaVenta=" + fechaVenta + ", items=" + items + "]";
	}


	private class Item{
		private int codigoArticulo;
		private int cantidadVendida;
		
		public Item(int codigoArticulo, int cantidadVendida) {
			super();
			this.codigoArticulo = codigoArticulo;
			this.cantidadVendida = cantidadVendida;
		}

		public int getCodigoArticulo() {
			return codigoArticulo;
		}

		public void setCodigoArticulo(int codigoArticulo) {
			this.codigoArticulo = codigoArticulo;
		}

		public int getCantidadVendida() {
			return cantidadVendida;
		}

		public void setCantidadVendida(int cantidadVendida) {
			this.cantidadVendida = cantidadVendida;
		}
		
	}
}
