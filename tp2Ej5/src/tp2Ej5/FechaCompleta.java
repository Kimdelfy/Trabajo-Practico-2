package tp2Ej5;

public class FechaCompleta {
	
		private int dia;
		private int mes;
		private int año;
		private int[] cantDias= {31,28,31,30,31,30,31,31,30,31,30,31};

		//Constructor
		public FechaCompleta (int dia, int mes, int año) {
			this.dia = dia;
			this.mes = mes;
			this.año = año;
		}
		//Formato dia juliano
		public FechaCompleta (int diaJ, int año) {
			this.dia = diaJ;
			this.año = año;
		}
		
		//Convierte Gregoriano a Dia Juliano
		public int diaJuliano() {
			int i=0;
			int diaJ=0;
			while (i!=mes-1) {
				diaJ=cantDias[i];
				i++;
			}
			diaJ=diaJ+dia;
			return diaJ;
		}
		
		//Convierte de Dia Juliano a Gregoriano
		public FechaCompleta conversor (int dia, int año) {
			int i=0;
			while (dia>cantDias[i]) {
				mes++;
				dia=dia-cantDias[i];
				i++;
			}
			return new FechaCompleta(dia,mes,año);
		}
		
		public void compara (FechaCompleta fecha2) {
			
			int fecha2Juliano = fecha2.diaJuliano();
			int año2 =fecha2.año;
			
			if (this.equals(fecha2)) {
				System.out.println("Ambas fechas son iguales"+ toString() + " = " + fecha2.toString());
			}
			else {
				
				if ( año < año2 || año == año2 && diaJuliano() < fecha2Juliano) {
					System.out.println(toString() + " Es menor que " + fecha2.toString());
				}
				else {
					System.out.println(toString() + " Es mayor que " + fecha2.toString());
				}
			}
		}
		
		
		
		private boolean bisiesto() {
			return (((año % 4 == 0) && (año % 100 != 0)) || (año % 400 == 0));	
		}
		
		//Getter y Setter
		public int getAño() {
			return año;
		}

		public void setAño(int año) {
			this.año = año;
			boolean bi= bisiesto();
			if (bi) {
				cantDias[1]=29;
			}
			else {
				cantDias[1]=28;
			}
		}
		
		public int getMes() {
			return mes;
		}

		public void setMes(int mes) {
			if ((mes>12) || (mes<1)) { 
				throw new IllegalArgumentException("Fecha ingresada incorrecta");
			}
			else {
				this.mes = mes;
			}
		}

		public int getDia() {
			return dia;
		}

		public void setDia(int dia) { 
			if ((dia>cantDias[mes-1]) || (dia<1)) { 
				throw new IllegalArgumentException("Fecha ingresada incorrecta");
			}
			else {
				this.dia = dia;
			}
		}	


		public void diaSiguiente() {
			if (dia == cantDias[mes-1]) {
				if (mes<12) {
					mes ++;
					dia=1;
				}
				else {
					mes=1;
					año++;
					dia=1;
				}
			}
			else {
				dia ++;
			}
		}
		
		public void diaAnterior() {
			if (dia == 1) {
				if (mes > 1) {
					mes--;
					dia=cantDias[mes-1];
				}
				else {
					mes=12;
					año--;
					dia=cantDias[mes-1];
				}
			}
			else {
				dia--;
			}
		}
		@Override
		public String toString() {
			return "FechaCompleta [dia=" + dia + ", mes=" + mes + ", año=" + año + "]";
		}
		
		public long cantidadDias (FechaCompleta fecha2) {
			//int fecha1Ju = diaJuliano();
			int fecha2Ju = fecha2.diaJuliano();
			int año2 =fecha2.año;
			long cantidad=0;
			cantidad=Math.abs(año2-this.año);
			cantidad=cantidad*365;
			cantidad=cantidad+Math.abs(fecha2Ju-diaJuliano());
			return cantidad;
		}
		
		public FechaCompleta suma(int dias) {
			int fechaJu = diaJuliano();
			fechaJu=fechaJu+dias;
			FechaCompleta fecha=conversor(fechaJu,this.año);
			
			return new FechaCompleta(dia,mes,año);
		}
}


