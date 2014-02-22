package org.upiita.spring.jdbc.tests;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringHibernate {

	public static void main(String[] args) {
		//creamos el contexto de Spring
		ApplicationContext contexto = new ClassPathXmlApplicationContext("/contexto.xml");
		/* *************************************************************************** */
		
		//busca por nombre
		
		//List<Usuario> usuarios = usuarioDAO.buscaPorNombre();
	}

}
