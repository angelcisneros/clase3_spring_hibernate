package org.upiita.spring.jdbc.daos;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.upiita.spring.jdbc.entidades.Usuario;

public class HibernateUsuarioDAO implements UsuarioDAO {
	SessionFactory sessionFactory;
	public Usuario buscaUsuarioPorId(Integer usuarioId) {

		return null;
	}

	public void creaUsuario(Usuario usuario) {

	}
	public Usuario buscaPorEmail(String email, String passsword){
		Usuario usuario = null;
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Criteria criterio = session.createCriteria(Usuario.class);
		criterio.add(Restrictions.eqOrIsNull("eamil", email));
		criterio.add(Restrictions.eqOrIsNull("passsword", passsword));
		usuario = (Usuario) criterio.uniqueResult();
		session.getTransaction().commit();
		session.close();
		
		return usuario;
		
	}
	public List<Usuario> buscaPorNombre(String nombre){
		List<Usuario> usuarioLista = null;
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Criteria criterio = session.createCriteria(Usuario.class);
		criterio.add(Restrictions.like("nombre", nombre));
		usuarioLista = criterio.list();
		
		
		session.getTransaction().commit();
		session.close();
		
		return usuarioLista;
	
	}
}
