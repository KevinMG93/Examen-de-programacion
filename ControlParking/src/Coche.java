
public class Coche {

	private String coche;
	private int horaentrada;
	private int horasalida;
	private int precio;
	public String observaciones;

	
	public Coche() {

		 coche="";
		 horaentrada=0;
		 horasalida=0;
		 precio=0;
		 observaciones="";
		
	}
	
	public Coche(String co, int he, int hs, int pre, String ob) {

		coche=co;
		horaentrada=he;
		horasalida=hs;
		precio=pre;
		observaciones=ob;
		
	}

	public void setcoche (String co){
		coche=co;
	}
	
	public String getcoche (){
		return coche;
	}
	
	public void sethoraentrada (int he){
		horaentrada=he;
	}
	
	public int gethoraentrada (){
		return horaentrada;
	}
	
	public void sethorasalida (int hs){
		horasalida=hs;
	}
	
	public int gethorasalida (){
		return horasalida;
	}
	
	public void setprecio (int p){
		precio=p;
	}
	
	public int getprecio (){
		return precio;
	}
	
	public void setobservaciones (String ob){
			observaciones=ob;
	}
		
	public String getobservaciones (){
		return observaciones;
	}
	
	
	
}
