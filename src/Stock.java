import java.util.ArrayList;
import java.util.List;

public class Stock {
	private int codigoArticulo;
	private String descripcion;
	private double precio;
	private int cantidad;
	private List<Stock>articulos;
	
	public Stock(int codigoArticulo, String descripcion, double precio, int cantidad) {
		super();
		this.codigoArticulo = codigoArticulo;
		this.descripcion = descripcion;
		this.precio = precio;
		this.cantidad = cantidad;
		List<Stock> articulos = new ArrayList<Stock>();
	}

	public boolean descontaralStock(int codigo,int cantidad) {
		boolean realizado = false;
		for(Stock s : articulos) {
			if((s.getCodigoArticulo()==codigo)&&(s.getCantidad()>=cantidad)) {
				s.setCantidad(getCantidad()-cantidad);
				realizado=true;
			}
		}
		return realizado;
	}
	
	public void agregaralStock(int codigo,int cant){
		for(Stock sto : articulos) {
			if(sto.getCodigoArticulo()==codigo) {
				sto.setCantidad(getCantidad()+cant);
			}
		}
	}
	
	public int getCodigoArticulo() {
		return codigoArticulo;
	}

	public void setCodigoArticulo(int codigoArticulo) {
		this.codigoArticulo = codigoArticulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	
	public List<Stock> getArticulos() {
		return articulos;
	}


	public void setArticulos(List<Stock> articulos) {
		this.articulos = articulos;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigoArticulo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stock other = (Stock) obj;
		if (codigoArticulo != other.codigoArticulo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Stock [codigoArticulo=" + codigoArticulo + ", descripcion=" + descripcion + ", precio=" + precio
				+ ", cantidad=" + cantidad + "]";
	}
	
}
