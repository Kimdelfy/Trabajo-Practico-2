package tp2Ej5;

public class FechaCompleta {
	
		private int dia;
		private int mes;
		private int a�o;
		private int[] cantDias= {31,28,31,30,31,30,31,31,30,31,30,31};

		//Constructor
		public FechaCompleta (int dia, int mes, int a�o) {
			this.dia = dia;
			this.mes = mes;
			this.a�o = a�o;
		}
		//Formato dia juliano
		public FechaCompleta (int diaJ, int a�o) {
			this.dia = diaJ;
			this.a�o = a�o;
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
		public FechaCompleta conversor (FechaCompleta fecha) {
			int i=0;
			dia=this.diaJuliano(); //Sera asi o this.diaJ???
			while (dia>cantDias[i]) {
				mes++;
				dia=dia-cantDias[i];
				i++;
			}
			return new FechaCompleta(dia,mes,a�o);
		}
		
		public void compara (FechaCompleta fecha1,FechaCompleta fecha2) {
			fecha1.dia=diaJuliano();
			fecha2.dia=diaJuliano();
			int a�o1 =fecha1.a�o;
			int a�o2 =fecha2.a�o;
			int dia1=fecha1.dia;
			int dia2=fecha2.dia;
			if (fecha1.equals(fecha2)) {
				System.out.println("Ambas fechas son iguales"+fecha1 + " = " + fecha2);
			}
			else {
				if (a�o1==a�o2) {
					if (fecha1.dia<fecha2.dia) {
						System.out.println(fecha1 + " Es menor que " + fecha2);
					}
					else {
						System.out.println(fecha1 + " Es mayor que " + fecha2);
					}
				}
				else {
					if (a�o1<a�o2) {
						System.out.println(fecha1 + " Es menor que " + fecha2);
					}
					else {
						System.out.println(fecha1 + " Es mayor que " + fecha2);
					}
				}		
			}
			
		}
		
		
		
		private boolean bisiesto() {
			return (((a�o % 4 == 0) && (a�o % 100 != 0)) || (a�o % 400 == 0));	
		}
		
		//Getter y Setter
		public int getA�o() {
			return a�o;
		}

		public void setA�o(int a�o) {
			this.a�o = a�o;
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
					a�o++;
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
					a�o--;
					dia=cantDias[mes-1];
				}
			}
			else {
				dia--;
			}
		}
		
}


