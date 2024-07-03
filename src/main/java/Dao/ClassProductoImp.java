package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IProducto;
import model.TblProductocl3;

public class ClassProductoImp implements IProducto{
	
	public void RegistrarProductocl3(TblProductocl3 producto) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPII_CL3_ArangurenTutayaMiguel");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(producto);
		System.out.println("Producto registrado correctamente");
		em.getTransaction().commit();
		em.close();
	}

	public void ActualizarProductocl3(TblProductocl3 producto) {
		// TODO Auto-generated method stub
		
	}

	public void EliminarProductocl3(TblProductocl3 producto) {
		// TODO Auto-generated method stub
		
	}

	public TblProductocl3 BuscarProductocl3(TblProductocl3 producto) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<TblProductocl3> ListadoProducto() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPII_CL3_ArangurenTutayaMiguel");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		List<TblProductocl3> listado = em.createQuery("SELECT p FROM TblProductocl3 p",TblProductocl3.class).getResultList();
		em.getTransaction().commit();
		em.close();
		return listado;
	}

	@Override
	public List<TblProductocl3> ListadoProductocl3() {
		// TODO Auto-generated method stub
		return null;
	}




}
