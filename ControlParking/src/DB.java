import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;





import javax.swing.JComboBox;

import com.mysql.jdbc.Statement;

public class DB {
	Connection conexion = null; //maneja la conexión
	Statement instruccion = null;// instrucción de consulta
	ResultSet conjuntoResultados = null;// maneja los resultados
	JComboBox <Coche> listadocoches;
	
	public DB() {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			// establece la conexión a la base de datos
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/apuestas","root","tonphp");
			// crea objeto Statement para consultar la base de datos
			instruccion = (Statement) conexion.createStatement();
			}catch( SQLException excepcionSql ){
			excepcionSql.printStackTrace();
			}// fin de catch
	}
	
	public void leerCoches(){
		
		try{
			instruccion = (Statement) conexion.createStatement();
			// consulta la base de datos
			conjuntoResultados = instruccion.executeQuery("SELECT * FROM parking");
			//Mostrar por pantalla
			while (conjuntoResultados.next())
			{
			System.out.println("id="+conjuntoResultados.getObject("id")+
			", Nombre="+conjuntoResultados.getObject("Nombre"));
			
			//Muestra el contenido de delincuentes de nuestra base de datos
				Coche D =new Coche();
				//Coje los datos para mostrarlos
				((int)conjuntoResultados.getObject("horaentrada"),
				(String)conjuntoResultados.getObject("coche"),
				(int)conjuntoResultados.getObject("horasalida"),
				(int)conjuntoResultados.getObject("precio"),
				listadoCoches.addItem(D);
			
			}
			conjuntoResultados.close();
	}catch( SQLException excepcionSql ){
		excepcionSql.printStackTrace();
	}// fin de catch
	
	
		


	}	

}
