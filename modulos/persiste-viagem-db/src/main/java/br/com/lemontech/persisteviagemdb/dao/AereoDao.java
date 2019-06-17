package br.com.lemontech.persisteviagemdb.dao;

import javax.enterprise.inject.Model;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.lemontech.persisteviagemdb.entidades.Aereo;

/***
 * Classe responsável por persistir um Aéreo no banco de dados
 * @author rafael.garcia
 *
 */
@Model
public class AereoDao {

	@PersistenceContext
	private EntityManager entityManager;

	public AereoDao() {
		super();
	}

	public AereoDao(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	public void save(Aereo aereo) {
		entityManager.merge(aereo);
	}
	
}
