package TestEntidades;

import Dao.ClassProductoImp;
import model.TblProductocl3;

public class TestEntidadProducto {
	 
	public static void main(String[] args){
	
	TblProductocl3 producto=new TblProductocl3();
	ClassProductoImp crud= new ClassProductoImp();
	
	//asignamos valores
	producto.setNombrecl3("Queso");
	producto.setPrecioventacl3(10.0);
	producto.setPreciocompcl3(9.0);
	producto.setEstadocl3("Pasable");
	producto.setDescripcl3("Aceite");
	crud.RegistrarProductocl3(producto);
	
	//invocamos metodo registrar
	crud.RegistrarProductocl3(producto);	
	}
}
